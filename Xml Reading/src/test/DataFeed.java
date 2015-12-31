package feeds;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Reporter;

import com.nbcuni.tve.common.Config;
import com.nbcuni.tve.common.util.Is;
import com.nbcuni.tve.uitests.support.testdataconfig.TestData;

@SuppressWarnings({ "deprecation", "resource" })
public class DataFeed {
	
	@SuppressWarnings("unused")
	private Is is;
	private Config config;
	
    //TODO - this class will need significant refactoring and additional development
	//as more and more methods are needed to retrieve data dynamically for tests
    public DataFeed() {
    	is = new Is(null);
    	config = new Config();
    }
    
    
    //FEED METHODS
    private String getJSONEntity(String url) throws Exception {
    	
    	Reporter.log("Data Feed Call - " + url);
    	HttpClient httpclient = new DefaultHttpClient();
    	HttpGet httpget = new HttpGet(url);

    	HttpResponse response = httpclient.execute(httpget);
        return EntityUtils.toString(response.getEntity());
    	
    }
    
    private JSONObject getJSONFeedObject(String url) throws Exception {
    	
    	String entityResponse = "";
    	JSONObject object = null;
    	
    	for (int i = 0; i < 2; i++) {
    		
    		entityResponse = this.getJSONEntity(url);
			this.logDataFeed(entityResponse);
    		
    		try {
    			object = new JSONObject(entityResponse);
        		break;
        	}
    		catch (JSONException e) { 
    			System.out.println("An invalid json response was returned by the feeds. See data feed logs for details.");
    			Thread.sleep(1000); 
    		}
    		
    	}
    	
    	return object;
    	
    }
    
    private JSONArray getJSONFeedArray(String url) throws Exception {
    	
    	String entityResponse = "";
    	JSONArray array = null;
    	
    	for (int i = 0; i < 2; i++) {
    		
    		entityResponse = this.getJSONEntity(url);
			this.logDataFeed(entityResponse);
    		
    		try {
    			array = new JSONArray(entityResponse);
        		break;
        	}
    		catch (JSONException e) { 
    			System.out.println("An invalid json response was returned by the feeds. See data feed logs for details.");
    			Thread.sleep(1000); 
    		}
    		
    	}
    	
    	return array;
    	
    }
    
    private void logDataFeed(String jsonFeed) throws Exception {
    	
    	File logDir = new File(config.getConfigValueFilePath("PathToTempLogs"));
    	if (!logDir.exists()) {
    		logDir.mkdirs();
    	}
    	
    	File logFile = new File(logDir.getPath() + "/" + "DataFeedLog_"
    			+ new SimpleDateFormat("MMddyyhhmmssSSSa").format(new Date()) + ".txt");
    	
    	if (!logFile.exists()) {
    		logFile.createNewFile();
    	    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(logFile, true));
    	    bufferedWriter.write(jsonFeed);
    	    bufferedWriter.close();
    	}
    	
    }
    
    public List<String> getShowTitles(String url) throws Exception {
		
    	List<String> allShowTitles = new ArrayList<String>();
    	
		JSONArray json = this.getJSONFeedArray(url);
		
		for (int i = 0; i < json.length(); i++) {
			JSONObject subObject = json.getJSONObject(i);
			
			allShowTitles.add(subObject.getString("title"));
			
		}
		
		java.util.Collections.sort(allShowTitles);
		return allShowTitles;
    	
	} 
    
    public String getShowAssetID(String url, String showTitle) throws Exception {
		
    	String assetID = "";
    	JSONArray json = this.getJSONFeedArray(url);
		
		for (int i = 0; i < json.length(); i++) {
			JSONObject subObject = json.getJSONObject(i);
			
			if (subObject.getString("title").equals(showTitle)) {
				assetID = subObject.getString("assetID");
				break;
			}
			
		}
		
		return assetID;
    	
	} 
    
    public HashMap<String,String> getShowData(String url) throws Exception {
		
    	HashMap<String,String> showData = new HashMap<String,String>();
    	
    	JSONObject json = this.getJSONFeedObject(url);
		
    	showData.put("description", json.getString("description"));
    	showData.put("title", json.getString("title"));
		
		return showData;
    	
	} 
    
   
    
    public List<String> getShowClipTitles(String url) throws Exception {
		
    	List<String> showClipTitles = new ArrayList<String>();
    	
    	JSONObject json = this.getJSONFeedObject(url);
		JSONArray assetsXArray = json.getJSONArray("assetsX");
		
		for (int i = 0; i < assetsXArray.length(); i++) {
			JSONObject subObject = assetsXArray.getJSONObject(i);
			
			if (subObject.getString("subtype").equals("clip")) {
				showClipTitles.add(subObject.getString("title"));
			}
			
		}
		
    	return showClipTitles;
    	
	} 
    
    public List<String> getFeaturedShowTitles(String url) throws Exception {
		
    	List<String> allShowTitles = new ArrayList<String>();
    	
		JSONArray json = this.getJSONFeedArray(url);
		
		for (int i = 0; i < json.length(); i++) {
			JSONObject subObject = json.getJSONObject(i);
			
			JSONArray zonesArray = subObject.getJSONArray("zones");
			JSONObject subZonesObject = zonesArray.getJSONObject(0);
			
			JSONObject mappingObject = subZonesObject.getJSONObject("mapping");
			JSONArray assetsArray = mappingObject.getJSONArray("assets");
			JSONObject subAssetsObject = assetsArray.getJSONObject(0);
			JSONObject itemObject = subAssetsObject.getJSONObject("item");
			allShowTitles.add(itemObject.getString("title"));
			
		}
		
		return allShowTitles;
    	
	} 
    
 public Boolean isFeaturedShowMostRecentEpisodeAvailable(String url, String showTitle) throws Exception {
		
    	Boolean recentEpisodeAvailable = false;
    	
		JSONArray json = this.getJSONFeedArray(url);
		
		for (int i = 0; i < json.length(); i++) {
			JSONObject subObject = json.getJSONObject(i);
			
			JSONArray zonesArray = subObject.getJSONArray("zones");
			JSONObject subZonesObject = zonesArray.getJSONObject(0);
			
			JSONObject mappingObject = subZonesObject.getJSONObject("mapping");
			JSONArray assetsArray = mappingObject.getJSONArray("assets");
			JSONObject subAssetsObject = assetsArray.getJSONObject(0);
			JSONObject itemObject = subAssetsObject.getJSONObject("item");
			
			if (itemObject.getString("title").equals(showTitle)) {
				JSONObject mostRecentObject = itemObject.getJSONObject("mostRecentEpisode");
				try {
					mostRecentObject.getString("title");
					recentEpisodeAvailable = true;
					break;
				}
				catch (JSONException e) {}
			}
			
		}
		
		return recentEpisodeAvailable;
    	
	} 
 
    public String getFeaturedShowMostRecentEpisode(String url, String showTitle) throws Exception {
		
    	String mostRecentTitle = "";
    	
		JSONArray json = this.getJSONFeedArray(url);
		
		for (int i = 0; i < json.length(); i++) {
			JSONObject subObject = json.getJSONObject(i);
			
			JSONArray zonesArray = subObject.getJSONArray("zones");
			JSONObject subZonesObject = zonesArray.getJSONObject(0);
			
			JSONObject mappingObject = subZonesObject.getJSONObject("mapping");
			JSONArray assetsArray = mappingObject.getJSONArray("assets");
			JSONObject subAssetsObject = assetsArray.getJSONObject(0);
			JSONObject itemObject = subAssetsObject.getJSONObject("item");
			
			if (itemObject.getString("title").equals(showTitle)) {
				JSONObject mostRecentObject = itemObject.getJSONObject("mostRecentEpisode");
				mostRecentTitle = mostRecentObject.getString("title");
				break;
			}
			
		}
		
		return mostRecentTitle;
    	
	} 
    
    public HashMap<String,String> getRestrictedEpisodeData(String url) throws Exception {
		
    	HashMap<String,String> showData = new HashMap<String,String>();
    	Boolean authEpisodePresent = false;
    	
    	List<String> showAssetIDs = new ArrayList<String>();
    	
    	JSONArray json = this.getJSONFeedArray(url);
		
		for (int i = 0; i < json.length(); i++) {
			JSONObject subObject = json.getJSONObject(i);
			showAssetIDs.add(subObject.getString("assetID"));
		}
    	
    	for (String assetID : showAssetIDs) {
    		
    		JSONObject subJSON = this.getJSONFeedObject(new TestData().getBrandData().get("showsContainerBaseURL") + assetID);
    		JSONArray assetsXArray = subJSON.getJSONArray("assetsX");
    		
    		for (int i = 0; i < assetsXArray.length(); i++) {
    			JSONObject subObject = assetsXArray.getJSONObject(i);
    			
    			if (subObject.getString("subtype").equals("episode") && subObject.getString("requiresAuth").equals("true")) {
    				
    				showData.put("showTitle", subObject.getString("parentContainerTitle"));
    				showData.put("episodeTitle", subObject.getString("title"));
    				authEpisodePresent = true;
    				break;
    			}
    			
    		}
    		
        	if (authEpisodePresent) { break; }
        	
    	}
    	
    	return showData;
    	
	} 
	
}
