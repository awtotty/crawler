package crawler;

import java.io.*; 
import java.net.*;

public class WebCrawler {

	// Creates stream of given url
	public static void getUrl(String url) throws Exception {
		URL page = new URL(url);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(page.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
	}
	
	// Crawls from a given source at a given depth
	public void crawl(String source, int depth) {
		
	}
}
