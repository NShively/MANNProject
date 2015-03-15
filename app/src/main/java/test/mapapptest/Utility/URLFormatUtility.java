package test.mapapptest.Utility;

/**
 * Created by nathan on 3/14/15.
 */
public class URLFormatUtility {
    final static private String BASE_URL = "http://www.fueleconomy.gov/ws/rest/";

    static public String formatApiUrl(String params){
        String urlString = String.format(BASE_URL, params);
        return urlString;
    }
}
