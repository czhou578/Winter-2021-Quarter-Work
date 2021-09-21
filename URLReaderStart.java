import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.*;

public class URLReaderStart {
    public static void main(String[] args) throws Exception {
        URLConnection bc = new URL("https://www.bellevuecollege.edu/courses/exams/").openConnection();
        // System.out.println("working");
        //It's because the site uses SSL.
        //You just need to set user agent header for it to work:
        //SSL (secure socket layer) is a method of ensuring security of data passed back and forth between a client and server.
        // An SSL endpoint is a regular URL, but with https instead of http.
        // Using SSL is more complicated than regular http because there needs to be handshaking between the client and server.
        bc.setRequestProperty("user-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

        BufferedReader in = new BufferedReader(new InputStreamReader(bc.getInputStream()));

        String inputLine = "";
        String text = "";
        while ((inputLine = in.readLine()) != null) {
            text += inputLine + "\n";

        }
        in.close();
    /* Add your own code here to 
    Read Final Exam Schedule from BC website using regex in java */
        Pattern pattern = Pattern.compile("<td>(.*?)</td> (<td>)?(<td[\\s]colspan=\"2\">)?(.*?)</td> (<td>(.*?)</td>)?");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            System.out.println("Class Time: " + matcher.group(1));
            System.out.println("Exam Day: " + matcher.group(4));
            System.out.println("Exam Time: " + matcher.group(6));
            System.out.println("++++++++++++++++++++++++++++++++++");
        }
        
	}
}

