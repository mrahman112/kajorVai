package abc;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Information {
	

	static String url;
	static DocumentBuilder db;
	static Document doc;
	static DocumentBuilderFactory dbf;
	
	
	public void getAllEpisodesVideoUrlByPixel(String pixel) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String episodesUrl="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCustomValue={fullEpisode}{true}";
		
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(episodesUrl).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("media:content");

        int index=0;
		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String height=eElement.getAttribute("height");
			if(height.equalsIgnoreCase(pixel)){
			String mUrl=eElement.getAttribute("url");
			System.out.println(mUrl);
			index++;
			}
		}
		}
		System.out.println("total items : "+index);
	}
	
	
public void getShowTitlesOnly() throws MalformedURLException, SAXException, IOException, ParserConfigurationException {
		
	String showUrl="http://feed.theplatform.com/f/HNK2IC/atv_usa_showlist";
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(showUrl).openStream());
		 doc.getDocumentElement().normalize();
		doc.getDocumentElement().normalize();
	 
		NodeList nList = doc.getElementsByTagName("item");
	 
		int index=0;
		String[]titles=new String[nList.getLength()];
		for (int temp = 0; temp < nList.getLength(); temp++) {
			
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
				try{
					System.out.println(eElement.getElementsByTagName("title").item(0).getTextContent());
					
				
				}catch(Exception e){
					
				}
				index++;
			}
			
		}
		System.out.println("total items : "+index);
		
	    }

 public void getEpisodeTitlesOnly() throws MalformedURLException, SAXException, IOException, ParserConfigurationException {
	String episodesUrl="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCustomValue={fullEpisode}{true}";
	dbf = DocumentBuilderFactory.newInstance();
	 db = dbf.newDocumentBuilder();
	 doc = db.parse(new URL(episodesUrl).openStream());
	 doc.getDocumentElement().normalize();
	doc.getDocumentElement().normalize();
 
	NodeList nList = doc.getElementsByTagName("item");
	int index=0; 
	for (int temp = 0; temp < nList.getLength(); temp++) {
		Node nNode = nList.item(temp);
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 
			Element eElement = (Element) nNode;
 
			try{
				
				System.out.println("Episode title is  : " + eElement.getElementsByTagName("title").item(0).getTextContent());
			
			
			}catch(Exception e){
				
			}
			index++;
		}
	}
	System.out.println("total items present : "+index);
    }
 
 public void getClipsTitlesOnly() throws MalformedURLException, SAXException, IOException, ParserConfigurationException {
	String episodesUrl="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCustomValue={fullEpisode}{false}";
	//String episodesUrl="http://feed.theplatform.com/f/HNK2IC/atv_usa_shelf3_v2";
	dbf = DocumentBuilderFactory.newInstance();
	 db = dbf.newDocumentBuilder();
	 doc = db.parse(new URL(episodesUrl).openStream());
	 doc.getDocumentElement().normalize();
	doc.getDocumentElement().normalize();
 
	NodeList nList = doc.getElementsByTagName("item");
	int index=0; 
	for (int temp = 0; temp < nList.getLength(); temp++) {
		Node nNode = nList.item(temp);
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 
			Element eElement = (Element) nNode;
 
			try{
				
				System.out.println("Clip title is  : " + eElement.getElementsByTagName("title").item(0).getTextContent());
			
			
			}catch(Exception e){
				
			}
			index++;
		}
	}
	System.out.println("total items present : "+index);
    }

 public void getAllEpisodesInfo() throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		
			String episodesUrl="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCustomValue={fullEpisode}{true}";
		
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(episodesUrl).openStream());
		 doc.getDocumentElement().normalize();
		doc.getDocumentElement().normalize();
		 
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	 
		NodeList nList = doc.getElementsByTagName("item");
	 
		System.out.println("----------------------------");
		int index=0; 
		for (int temp = 0; temp < nList.getLength(); temp++) {
			
			Node nNode = nList.item(temp);
	 
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
	 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
				try{
					System.out.println("Episode title is  : " + eElement.getElementsByTagName("title").item(0).getTextContent());
					String a=eElement.getElementsByTagName("dcterms:valid").item(0).getTextContent();
					String b[]=a.split(";");
					System.out.println(b[0]);
					System.out.println(b[1]);
				
				System.out.println("Category  : " + eElement.getElementsByTagName("media:category").item(0).getTextContent());
				
				System.out.println("Ratings  : " + eElement.getElementsByTagName("media:rating").item(0).getTextContent());
				
				System.out.println("Entitlement  : " + eElement.getElementsByTagName("pl1:entitlement").item(0).getTextContent());
				System.out.println("Published on  : " + eElement.getElementsByTagName("pubDate").item(0).getTextContent());
				}catch(Exception e){
					
				}
				index++;
		}
		}
		System.out.println("total episoeds present : "+index);
	    }
 
	public void getEpisodeInfoByName(String episodeName) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		
			String episodesUrl="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byTitle="+episodeName+"&byCustomValue={fullEpisode}{true}";
		
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(episodesUrl).openStream());
		 doc.getDocumentElement().normalize();
		doc.getDocumentElement().normalize();
		 
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	 
		NodeList nList = doc.getElementsByTagName("item");
	 
		System.out.println(nList.getLength());
		int index=0; 
		
		for (int temp = 0; temp < nList.getLength(); temp++) {
			
			Node nNode = nList.item(temp);
	 
			//System.out.println("\nCurrent Element :" + nNode.getNodeName());
	 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				
				Element eElement = (Element) nNode;
				
				String catg= eElement.getElementsByTagName("media:category").item(0).getTextContent();
				System.out.println(catg);
				System.out.println("Description : "+eElement.getElementsByTagName("description").item(0).getTextContent());
				System.out.println("DayPart : "+eElement.getElementsByTagName("pl1:dayPart").item(0).getTextContent());
				System.out.println("entitlement : "+eElement.getElementsByTagName("pl1:entitlement").item(0).getTextContent());
				System.out.println("Episode number : "+eElement.getElementsByTagName("pl1:episodeNumber").item(0).getTextContent());
				System.out.println("Season number : "+eElement.getElementsByTagName("pl1:seasonNumber").item(0).getTextContent());
				
				
				index++;
		}
		}
		System.out.println("total items present : "+index);
	    }
	
	public void getVideoUrlByEpisodeName(String episodeName,String pixel) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String episodesUrl="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byTitle="+episodeName+"&byCustomValue={fullEpisode}{true}";
		
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(episodesUrl).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("media:content");


		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String height=eElement.getAttribute("height");
			if(height.equalsIgnoreCase(pixel)){
			String mUrl=eElement.getAttribute("url");
			System.out.println(mUrl);
			}
		}
		}
	}
	
	public void getEntitledEpisodes() throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCustomValue={fullEpisode}{true}";
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(url).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("item");


		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String entitlement=eElement.getElementsByTagName("pl1:entitlement").item(0).getTextContent();
			if(entitlement.equalsIgnoreCase("auth")){
			System.out.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
			System.out.println("Entitlement  : " + eElement.getElementsByTagName("pl1:entitlement").item(0).getTextContent());
			}
			
		}
	}
}
	
	public void getFreeEpisodes() throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCustomValue={fullEpisode}{true}";
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(url).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("item");


		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String entitlement=eElement.getElementsByTagName("pl1:entitlement").item(0).getTextContent();
			if(entitlement.equalsIgnoreCase("auth")){
			
			}else{
				System.out.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
				System.out.println("Entitlement  : " + eElement.getElementsByTagName("pl1:entitlement").item(0).getTextContent());
			}
			
		}
	}
}
	
	public void getAllEpisodesId() throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCustomValue={fullEpisode}{true}";
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(url).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("item");
		int index=0;

		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String episodeId=eElement.getElementsByTagName("pl:id").item(0).getTextContent();
			
				System.out.println("Episode Id  : " +episodeId.substring(51));
			}
		index++;
		}
		System.out.println("total item present :"+index);
	}
	
	public void getAllEpisodesGuiId() throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCustomValue={fullEpisode}{true}";
		
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(url).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("item");
		int index=0;

		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String episodeId=eElement.getElementsByTagName("guid").item(0).getTextContent();
			
				System.out.println(episodeId);
				//System.out.println(eElement.getElementsByTagName("title").item(0).getTextContent());
			}
		index++;
		}
		System.out.println("total item present :"+index);
	}
	
	public void getAllShowsGuiId() throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		
		String url="http://feed.theplatform.com/f/HNK2IC/atv_usa_showlist";
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(url).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("item");
		int index=0;

		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String episodeId=eElement.getElementsByTagName("guid").item(0).getTextContent();
			
				System.out.println(episodeId+"  : "+eElement.getElementsByTagName("title").item(0).getTextContent());
				//System.out.println(eElement.getElementsByTagName("title").item(0).getTextContent());
			}
		index++;
		}
		System.out.println("total item present :"+index);
	}
	
	public void getEpisodeIdByName(String episodeName) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byTitle="+episodeName+"&byCustomValue={fullEpisode}{true}";
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(url).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("item");
		int index=0;

		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String episodeId=eElement.getElementsByTagName("pl:id").item(0).getTextContent();
			
				System.out.println("Episode Id  : " +episodeId.substring(51));
			}
				
		index++;
		}
		System.out.println("total item present :"+index);
	}
	
	public void getClipsIdByName(String episodeName) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byTitle="+episodeName+"&byCustomValue={fullEpisode}{false}";
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(url).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("item");
		int index=0;

		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String episodeId=eElement.getElementsByTagName("pl:id").item(0).getTextContent();
			
				System.out.println("Clip Id  : " +episodeId.substring(51));
			}
				
		index++;
		}
		System.out.println("total item present :"+index);
	}
	
	public void getEpisodeGuIdByName(String episodeName) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byTitle="+episodeName+"&byCustomValue={fullEpisode}{true}";
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(url).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("item");
		int index=0;

		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String episodeId=eElement.getElementsByTagName("guid").item(0).getTextContent();
			
				System.out.println("Episode guid  : " +episodeId);
			}
				
		index++;
		}
		System.out.println("total item present :"+index);
	}
	
	public void getEpisodeTVRatingByName(String episodeName) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String url="";
		String b="";
		if(episodeName.contains(" ")){
			 b=episodeName.replaceAll(" ", "%20");
			 url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byTitle="+b+"&byCustomValue={fullEpisode}{true}";
		}else{
		 url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byTitle="+episodeName+"&byCustomValue={fullEpisode}{true}";
		}
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(url).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("item");
		int index=0;

		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String episodeId=eElement.getElementsByTagName("media:rating").item(0).getTextContent();
			
				System.out.println("Episodes TV Rating  : " +episodeId);
			}
				
		index++;
		}
		System.out.println("total item present :"+index);
	}
	
	

	
	public void getImageUrlByEpisodeName(String episodeName) throws MalformedURLException, SAXException, IOException, ParserConfigurationException {
		
		String url="";
		String b="";
		if(episodeName.contains(" ")){
			 b=episodeName.replaceAll(" ", "%20");
			 url="http://feed.theplatform.com/f/dCK2IC/atv_usa_show_overview?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{true}";
		}else{
		 url="http://feed.theplatform.com/f/dCK2IC/atv_usa_show_overview?byCategories=Series/"+episodeName+"&byCustomValue={fullEpisode}{true}";
		}
		
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(url).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("media:thumbnail");


		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String mUrl=eElement.getAttribute("url");
			System.out.println(mUrl);
		}
		}
	}
	
		public void getShowInfoByNameEpisodes(String showName) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String url="";
		String b="";
		if(showName.contains(" ")){
			 b=showName.replaceAll(" ", "%20");
			 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{true}";
			 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2"
			url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{true}";
			 
		}else{
			System.out.println("ATV account:");
		// url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{true}";
		url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{true}";
		 
		}
		
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(url).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("item");
		int index=0;
		System.out.println("Series name is : "+showName);

		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String episodeTitle=eElement.getElementsByTagName("title").item(0).getTextContent();
			String airdate=eElement.getElementsByTagName("pubDate").item(0).getTextContent();
			String season=eElement.getElementsByTagName("pl1:seasonNumber").item(0).getTextContent();
			String episode=eElement.getElementsByTagName("pl1:episodeNumber").item(0).getTextContent();
			String episodeId=eElement.getElementsByTagName("guid").item(0).getTextContent();
			
				System.out.println(episodeTitle);
			}
				
		index++;
		}
		System.out.println("total Episodes present :"+index);
	}
		
		public void getShowInfoByNameEpisodes1(String showName) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
			String url="";
			String b="";
			if(showName.contains(" ")){
				 b=showName.replaceAll(" ", "%20");
				 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{true}";
				 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2"
				url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{true}";
				 
			}else{
				System.out.println("ATV account:");
			 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{true}";
			url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{true}";
			 
			}
			
			dbf = DocumentBuilderFactory.newInstance();
			 db = dbf.newDocumentBuilder();
			 doc = db.parse(new URL(url).openStream());
			 doc.getDocumentElement().normalize();
			
		 
			NodeList nPanList = doc.getElementsByTagName("item");
			int index=0;
			System.out.println("Series name is : "+showName);

			for(int temp = 0 ; temp <nPanList.getLength(); temp++){
			Node nNode = nPanList.item(temp);
			
			if(nNode.getNodeType()==Node.ELEMENT_NODE){
				Element eElement = (Element) nNode;
				String episodeTitle=eElement.getElementsByTagName("title").item(0).getTextContent();
				String airdate=eElement.getElementsByTagName("pubDate").item(0).getTextContent();
				String season=eElement.getElementsByTagName("pl1:seasonNumber").item(0).getTextContent();
				String episode=eElement.getElementsByTagName("pl1:episodeNumber").item(0).getTextContent();
				String episodeId=eElement.getElementsByTagName("guid").item(0).getTextContent();
				
					System.out.println(episodeTitle);
				}
					
			index++;
			}
			System.out.println("total Episodes present :"+index);
		}
		
		public void getShowInfoByNameEpisodes2(String showName) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
			String url="";
			String b="";
			if(showName.contains(" ")){
				 b=showName.replaceAll(" ", "%20");
				 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{true}";
				 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2"
				url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{true}";
				 
			}else{
				System.out.println("ATV account:");
			// url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{true}";
			url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{true}";
			 
			}
			
			dbf = DocumentBuilderFactory.newInstance();
			 db = dbf.newDocumentBuilder();
			 doc = db.parse(new URL(url).openStream());
			 doc.getDocumentElement().normalize();
			
		 
			NodeList nPanList = doc.getElementsByTagName("item");
			int index=0;
			System.out.println("Series name is : "+showName);

			for(int temp = 0 ; temp <nPanList.getLength(); temp++){
			Node nNode = nPanList.item(temp);
			
			if(nNode.getNodeType()==Node.ELEMENT_NODE){
				Element eElement = (Element) nNode;
				String episodeTitle=eElement.getElementsByTagName("title").item(0).getTextContent();
				String airdate=eElement.getElementsByTagName("pubDate").item(0).getTextContent();
				String season=eElement.getElementsByTagName("pl1:seasonNumber").item(0).getTextContent();
				String episode=eElement.getElementsByTagName("pl1:episodeNumber").item(0).getTextContent();
				String episodeId=eElement.getElementsByTagName("guid").item(0).getTextContent();
				
					System.out.println(episodeTitle);
				}
					
			index++;
			}
			System.out.println("total Episodes present :"+index);
		}
		public void getShowInfoByNameEpisodes3(String showName) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
			String url="";
			String b="";
			if(showName.contains(" ")){
				 b=showName.replaceAll(" ", "%20");
				 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{true}";
				 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2"
				url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{true}";
				 
			}else{
				System.out.println("ATV account:");
			 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{true}";
			url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{true}";
			 
			}
			
			dbf = DocumentBuilderFactory.newInstance();
			 db = dbf.newDocumentBuilder();
			 doc = db.parse(new URL(url).openStream());
			 doc.getDocumentElement().normalize();
			
		 
			NodeList nPanList = doc.getElementsByTagName("item");
			int index=0;
			System.out.println("Series name is : "+showName);

			for(int temp = 0 ; temp <nPanList.getLength(); temp++){
			Node nNode = nPanList.item(temp);
			
			if(nNode.getNodeType()==Node.ELEMENT_NODE){
				Element eElement = (Element) nNode;
				String episodeTitle=eElement.getElementsByTagName("title").item(0).getTextContent();
				String airdate=eElement.getElementsByTagName("pubDate").item(0).getTextContent();
				String season=eElement.getElementsByTagName("pl1:seasonNumber").item(0).getTextContent();
				String episode=eElement.getElementsByTagName("pl1:episodeNumber").item(0).getTextContent();
				String episodeId=eElement.getElementsByTagName("guid").item(0).getTextContent();
				
					System.out.println(episodeTitle);
				}
					
			index++;
			}
			System.out.println("total Episodes present :"+index);
		}
		public void getShowInfoByNameEpisodes4(String showName) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
			String url="";
			String b="";
			if(showName.contains(" ")){
				 b=showName.replaceAll(" ", "%20");
				 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{true}";
				 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2"
				url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{true}";
				 
			}else{
				System.out.println("ATV account:");
			// url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{true}";
			url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{true}";
			 
			}
			
			dbf = DocumentBuilderFactory.newInstance();
			 db = dbf.newDocumentBuilder();
			 doc = db.parse(new URL(url).openStream());
			 doc.getDocumentElement().normalize();
			
		 
			NodeList nPanList = doc.getElementsByTagName("item");
			int index=0;
			System.out.println("Series name is : "+showName);

			for(int temp = 0 ; temp <nPanList.getLength(); temp++){
			Node nNode = nPanList.item(temp);
			
			if(nNode.getNodeType()==Node.ELEMENT_NODE){
				Element eElement = (Element) nNode;
				String episodeTitle=eElement.getElementsByTagName("title").item(0).getTextContent();
				String airdate=eElement.getElementsByTagName("pubDate").item(0).getTextContent();
				String season=eElement.getElementsByTagName("pl1:seasonNumber").item(0).getTextContent();
				String episode=eElement.getElementsByTagName("pl1:episodeNumber").item(0).getTextContent();
				String episodeId=eElement.getElementsByTagName("guid").item(0).getTextContent();
				
					System.out.println(episodeTitle);
				}
					
			index++;
			}
			System.out.println("total Episodes present :"+index);
		}
		
		public void getShowInfoByNameClips(String showName) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
			String url="";
			String b="";
			if(showName.contains(" ")){
				 b=showName.replaceAll(" ", "%20");
				 //url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{false}";//production url
				url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+b+"&byCustomValue={fullEpisode}{false}";// apple tv account
			}else{
			// url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{false}";
				url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview_v2?byCategories=Series/"+showName+"&byCustomValue={fullEpisode}{false}";
			}
			dbf = DocumentBuilderFactory.newInstance();
			 db = dbf.newDocumentBuilder();
			 doc = db.parse(new URL(url).openStream());
			 doc.getDocumentElement().normalize();
			
		 
			NodeList nPanList = doc.getElementsByTagName("item");
			int index=0;
			System.out.println("Series name is : "+showName);

			for(int temp = 0 ; temp <nPanList.getLength(); temp++){
			Node nNode = nPanList.item(temp);
			
			if(nNode.getNodeType()==Node.ELEMENT_NODE){
				Element eElement = (Element) nNode;
				String episodeTitle=eElement.getElementsByTagName("title").item(0).getTextContent();
				String episodeId=eElement.getElementsByTagName("guid").item(0).getTextContent();
				
				System.out.println(episodeTitle);
				}
					
			index++;
			}
			System.out.println("total Clips present :"+index);
		}

}
