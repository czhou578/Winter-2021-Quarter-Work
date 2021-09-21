import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) throws MalformedURLException, IOException {
    RouteFinder finder = new RouteFinder();
    Scanner scanner = new Scanner(System.in);
    int routeID;
    String destination;
    char input;
    String routeURL = "https://www.communitytransit.org/busservice/schedules/route/";

    // System.out.print("Please enter a letter that your destinations start with: ");
    // input = scanner.next().charAt(0);
    // // finder.getBusRoutesUrls(input);
    // System.out.println(finder.getBusRoutesUrls(input));

    System.out.print("Please enter your destination: ");
    destination = scanner.nextLine();
    System.out.print("Please enter a route id: ");
    routeID = scanner.nextInt();
    routeURL += routeID;
    //finder.getRouteStops(routeURL);
    System.out.println(finder.getRouteStops(routeURL));
  }
}
