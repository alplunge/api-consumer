package com.example.webjson.api;

import com.example.webjson.data.ResultData;
import com.example.webjson.parser.JsonParser;
import com.example.webjson.parser.JacksonParser;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class StackQuery {
	private static final String BASE_URL = "https://api.stackexchange.com/2.2/search?";
	private static final String PARAM_SITE = "site=";
	private static final String PARAM_PAGE_SIZE = "&pagesize=";
	private static final String PARAM_ORDER = "&order=";
	private static final String PARAM_SORT = "&sort";
	private static final String PARAM_TAG = "&tagged=";
	private static final String PARAM_FILTER = "&filter=";
	private static final String PARAM_SEARCH_TERM = "&intitle=";
	public static final String GZIP = "gzip";

	private String site = "stackoverflow";
	private int pageSize = 5;
	private SortOrder sortOrder = SortOrder.ASCENDING;
	private SortBy sortBy = SortBy.RELEVANCE;
	private String tag = "angular";
	private String searchTerm = "";

	public static String getBaseUrl() {
		return BASE_URL;
	}

	public static String getParamSite() {
		return PARAM_SITE;
	}

	public static String getParamPageSize() {
		return PARAM_PAGE_SIZE;
	}

	public static String getParamOrder() {
		return PARAM_ORDER;
	}

	public static String getParamSort() {
		return PARAM_SORT;
	}

	public static String getParamTag() {
		return PARAM_TAG;
	}

	public static String getParamFilter() {
		return PARAM_FILTER;
	}

	public static String getParamSearchTerm() {
		return PARAM_SEARCH_TERM;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public SortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(SortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}

	public SortBy getSortBy() {
		return sortBy;
	}

	public void setSortBy(SortBy sortBy) {
		this.sortBy = sortBy;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}



	public enum SortOrder {
		ASCENDING	("asc"),
		DESCENDING	("desc");
		
		private final String key;
		SortOrder(String key) { this.key = key; }
		
		public String toString() { return key; }
	}
	
	
	public enum SortBy {
		RELEVANCE	("relevance"), 
		VOTES		("votes"), 
		CREATION	("creation"), 
		ACTIVITY	("activity");
		
		private final String key;
		SortBy(String key) { this.key = key; }
		
		public String toString() { return key; }
	}

	public List<ResultData> getResult() throws IOException {
		URL url = buildUrl();
		InputStream inputStream = getRequiredInputStream(url);
		JsonParser json = new JacksonParser();
		List<ResultData> results = json.parseJson(inputStream);
		inputStream.close();
		return results;
	}

	private URL buildUrl() throws MalformedURLException {
		StringBuilder urlString = new StringBuilder();

		urlString.append(BASE_URL);
		urlString.append(PARAM_SITE).append(this.site);
		urlString.append(PARAM_PAGE_SIZE).append(this.pageSize);
		urlString.append(PARAM_ORDER).append(this.sortOrder);
		urlString.append(PARAM_SORT).append(this.sortBy);
		urlString.append(PARAM_TAG).append(this.tag);
		urlString.append(PARAM_SEARCH_TERM).append(this.searchTerm);
		return getCorrectURL(urlString);
	}

	private InputStream getRequiredInputStream(URL url) throws IOException {
		URLConnection connection = url.openConnection();
		if (GZIP.equalsIgnoreCase(connection.getContentEncoding())) {
			return new GZIPInputStream(connection.getInputStream());
		}
		return connection.getInputStream();
	}

	private URL getCorrectURL(StringBuilder urlString) throws MalformedURLException {
		URL url = new URL(urlString.toString());
		try {
			URI uri = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), null);
			url = uri.toURL();
		} catch (URISyntaxException e) {
			throw new MalformedURLException(e.getMessage());
		}
		return url;
	}
}
