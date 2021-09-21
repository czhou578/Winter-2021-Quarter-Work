import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.net.*;

public class RouteFinder implements IRouteFinder {

  @Override
  public Map<String, Map<String, String>> getBusRoutesUrls(char destInitial) throws MalformedURLException, IOException {

    String check = "" + destInitial;
    Pattern checkPattern = Pattern.compile("[A-Za-z]"); //check if input is an alphabet
    Matcher matchCheck = checkPattern.matcher(check);

    if (!matchCheck.find()) {
      throw new RuntimeException();
    }
    
    URLConnection bc = new URL("https://www.communitytransit.org/busservice/schedules/").openConnection(); //establish connection
    bc.setRequestProperty("user-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
  
    BufferedReader in = new BufferedReader(new InputStreamReader(bc.getInputStream())); //get reader correctly set up

    String inputLine = ""; //strings to be used later
    String text = "";
    String temporary = "";

    while ((inputLine = in.readLine()) != null) { //reading in the input from the html source
      text += inputLine + "/n";
    }
    
    String temp = String.valueOf(destInitial).toUpperCase(); //change the input char to uppercase
    
    Pattern pattern = Pattern.compile("<h3>(.*)</h3>(([^$]*?)(<hr.*)|(([^$]*?)<p>))"); //pattern to match content in between cities and routes
    Matcher matcher = pattern.matcher(text);
    Pattern pattern2 = Pattern.compile("<h3>(" + temp + ".*?)*</h3>(([^$]*?))(<hr|<p>)"); //matches cities
    Matcher matcher2;
    
    Pattern pattern3 = Pattern.compile("<a href=\"/schedules/(.*?)\".*?>(.*?)</a>"); //matches routes
    Matcher matcher3;
    
    Map<String, Map<String, String>> routes = new HashMap<String, Map<String, String>>(); //hash map to be returned
    Map<String, String> map; //map to be stored inside bigger map


    while(matcher.find()) { //find matches
      inputLine = matcher.group(0);
      matcher2 = pattern2.matcher(inputLine); //narrow down matches for subsequent while loops

      while(matcher2.find()) {
        temporary = matcher2.group(3);
        matcher3 = pattern3.matcher(temporary);

        map = new HashMap<>();
        while(matcher3.find()) {
          String urlTemplate = "https://www.communitytransit.org/busservice/schedules/route/"; //template string url
          String holder = matcher3.group(2).toString();
          System.out.println(matcher3.group(2));

          if (Character.isDigit(matcher3.group(2).charAt(0)) == false) { //for Swift Green line / Blue line...
            map.put(holder, "{}");
            routes.put(matcher2.group(1), map);
            continue;

          } else if (matcher3.group(2).contains("/")) {

            String temporaryStr = "";
            int slashLocation = matcher3.group(2).indexOf("/");
            temporaryStr += matcher3.group(2).substring(0, slashLocation) + "-" + matcher3.group(2).substring(slashLocation + 1, matcher3.group(2).length());
            urlTemplate += temporaryStr;
            map.put(holder, urlTemplate);
            routes.put(matcher2.group(1), map); //add temporary map to actual map and repeat
            continue;
          }
          urlTemplate = urlTemplate + matcher3.group(2); //append to url
          map.put(holder, urlTemplate);
          routes.put(matcher2.group(1), map); //add temporary map to actual map and repeat
        }
      }
    }

    return routes;
  }

  @Override
  public Map<String, LinkedHashMap<Integer, String>> getRouteStops(String url) throws MalformedURLException, IOException {
    boolean connected = false;

    URLConnection bc = new URL(url).openConnection(); //establish connection
    
    bc.setRequestProperty("user-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

    BufferedReader in = new BufferedReader(new InputStreamReader(bc.getInputStream())); //reader to read in html

    String inputLine = ""; //strings to be used for input reading
    String text = "";
    
    while ((inputLine = in.readLine()) != null) { //reading in all the html
      text += inputLine + "\n";
    }
   
    Pattern pattern = Pattern.compile("<thead>(([^$]*?))<small>(.*)</small>(([^$]*?))</thead>"); //matching
    Matcher matcher = pattern.matcher(text); 
    Pattern patternStop = Pattern.compile("<p>(.*)</p>");
    Matcher matcherStop;
    
    Map<String, LinkedHashMap<Integer, String>> routeStops = new LinkedHashMap<String, LinkedHashMap<Integer, String>>(); //map to be returned
    LinkedHashMap<Integer, String> map;
    int counter = 0;
    int numStops = 0;

    while(matcher.find()) { //find matching

      if (counter == 2) {
        break;
      }
      numStops = 0;
      text = matcher.group(5); //the rest of the text not including cities
      matcherStop = patternStop.matcher(text);
      counter++;

      map = new LinkedHashMap<>();

      while(matcherStop.find()) {
        numStops++; //counter tracking number of stops
        map.put(numStops, matcherStop.group(1));
        routeStops.put(matcher.group(3), map); //matcher.group(3) is the "To_____"
      }
    } 

    if (routeStops.size() == 0) { //check to see if route inputted is correct
      throw new RuntimeException();
    }

    return routeStops;
  }
  
}
