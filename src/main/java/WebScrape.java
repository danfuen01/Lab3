import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * @param WebScrape  class that scrapes text from the web
 * @param main
 * @return      the image at the specified URL
 * @see         Image
 */

public class WebScrape {

    public static void main(String[] args) {


        int princeCount = 0;

        String s = urlToString("http://erdani.com/tdpl/hamlet.txt");
        String s1 = urlToString("https://www.bls.gov/tus/charts/chart9.txt");
        String s2 = urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt");

        int count = s.length();
        int count1 = s1.length();
        int count2 = s2.length();

        System.out.println(count);
        System.out.println(count1);
        System.out.println(count2);


        if (s.contains("Prince")) {
            princeCount++;
        }

        System.out.println(princeCount);



    }

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

}

