package crawler;

import java.util.*;

public class UrlHash extends HashMap<String, ArrayList<String>> {
	
	private static final long serialVersionUID = 1L; 
	
	public UrlHash() {
		super(); 
	}
	
	// Returns ArrayList of urls associated with word
	public ArrayList<String> getUrls(String word) {
		return this.get(word);
	}
}
