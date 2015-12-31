package test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XML_Reader_Feed {
	
	
	public void getLatestEpisode(){
		
	}
	
	public void getLatestClip(){
		
	}
	
	public void getShowCaseItem(){
		
	}
	
	public void getFeaturedItemInHomePage(){
		
	}
	
	
	public static List<String> getShowEpisodeTitles(String url) throws Exception {
		
		List<String> showEpisodeTitles = new ArrayList<String>();
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
	    Document doc = db.parse(new URL(url).openStream());
	    doc.getDocumentElement().normalize();
	    NodeList nList = doc.getElementsByTagName("item");
	    
	    for (int temp = 0; temp < nList.getLength(); temp++) {
	    Node nNode = nList.item(temp);
	 	Element eElement = (Element) nNode;
	 	
	 	if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 		showEpisodeTitles.add(eElement.getElementsByTagName("title").item(0).getTextContent());

	 	}
	    }
		return showEpisodeTitles;
		
	} 
	
	public static List<String> getShowClipTitles(String clipurl) throws Exception {
		
		List<String> showClipTitles = new ArrayList<String>();
		

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
	    Document doc = db.parse(new URL(clipurl).openStream());
	    doc.getDocumentElement().normalize();
	    NodeList nList = doc.getElementsByTagName("item");
	    
	    for (int temp = 0; temp < nList.getLength(); temp++) {
	    Node nNode = nList.item(temp);
	 	Element eElement = (Element) nNode;
	 	
	 	if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 		showClipTitles.add(eElement.getElementsByTagName("title").item(0).getTextContent());

	 	}
	    }

		
		return showClipTitles;
		
	} 

	 
	
	

}
