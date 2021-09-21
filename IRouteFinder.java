import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;

public interface IRouteFinder {
    String TRANSIT_WEB_URL = "https://www.communitytransit.org/busservice/schedules/";

    /**
     * The function returns the route URLs for a specific destination initial using the URL text
     * @param destInitial This represents a destination (e.g. b/B is initial for Bellevue, Bothell, ...)
     * 
     * @return key/value map of the routes with key is destination and
     *       value is an inner map with a pair of route ID and the route page URL
     *       (e.g. of a map element <Brier, <111, https://www.communitytransit.org/busservice/schedules/route/111>>)
     * @throws IOException
     * @throws MalformedURLException
     */
    Map<String, Map<String, String>> getBusRoutesUrls(final char destInitial) throws MalformedURLException, IOException;

    /**
     * The function returns route stops, grouped by destination To/From, for a certain route ID url
     * @param url: the URL of the route that you want to get its bus stops
     * @return map of the stops grouped by destination with key is the destination (e.g. To Bellevue)
     *  and value is the list of stops in the same order that it was parsed on
     * (e.g. of a map element <To Mountlake Terrace, <<1, Brier Rd &amp; 228th Pl SW>, <2, 228th St SW &amp; 48th Ave W>, ...>>)
     * @throws IOException
     * @throws MalformedURLException
     */
    Map<String, LinkedHashMap<Integer, String>> getRouteStops(final String url) throws MalformedURLException, IOException;

}
