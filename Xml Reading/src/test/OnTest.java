package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;



import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;






import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class OnTest {



public static void main(String[] args) throws Exception {
//String url="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview";
String url="https://appletv.nbcuni.com/tv/usa/home?displayOverlay=false";
	/*
DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

DocumentBuilder db = dbf.newDocumentBuilder();

//Document doc = db.parse(new URL("http://feed.theplatform.com/f/HNK2IC/atv_usa_showcase").openStream());

Document doc = db.parse(new URL("http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview").openStream());

//Document doc = db.parse(new URL("http://feed.theplatform.com/f/HNK2IC/atv_usa_showcase").openStream());

doc.getDocumentElement().normalize();

 

//System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

 

NodeList nList = doc.getElementsByTagName("item");

 

System.out.println("----------------------------");

int index=0;

for (int temp = 0; temp < nList.getLength(); temp++) {

 

Node nNode = nList.item(temp);

 

//System.out.println("\nCurrent Element :" + nNode.getNodeName());

Element eElement = (Element) nNode;

if (eElement.getChildNodes().getLength() > 0 && nNode.getNodeType() == Node.ELEMENT_NODE) {

 

String val = eElement.getChildNodes().item(0)

                            .getNodeValue();

                   // if (!val.startsWith("\n"))

                       // System.out.println(nNode + "==" + val);

               // }else {

                    //System.out.print("File not found!");

                //}

 

//System.out.println("Staff id : " + eElement.getAttribute("id"));

//System.out.println("Episode title is  : " + eElement.getElementsByTagName("title").item(0).getTextContent());

//System.out.println("Category : " + eElement.getElementsByTagName("media:category").item(0).getTextContent());

//System.out.println("Category : " + eElement.getElementsByTagName("media:thumbnail").item(0).getTextContent());

//String mcategory=eElement.getElementsByTagName("media:category").item(0).getTextContent();

//System.out.println(mcategory);

/*

if(mcategory.equalsIgnoreCase("Series/Dig")){

System.out.println(mcategory);

System.out.println("Episode title is  : " + eElement.getElementsByTagName("title").item(0).getTextContent());

index++;




                // Get element

                Element element = (Element) list.item(i);

                String nodnam = element.getNodeName();

                if (element.getChildNodes().getLength() > 0) {

                    String val = element.getChildNodes().item(0)

                            .getNodeValue();

                    if (!val.startsWith("\n"))

                        System.out.println(nodnam + "==" + val);

                }

            }

        } else {

            System.out.print("File not found!");

        }



}

*/

//System.out.println("Episode title is  : " + eElement.getElementsByTagName("title").item(0).getTextContent());


//String guid= eElement.getElementsByTagName("pl:id").item(0).getTextContent();

//System.out.println(guid.substring(51));

//System.out.println(guid);
/*
List<String> s=getShowClipTitles(url);
for(String x: s){
	System.out.print(x);
	System.out.println();
}
 */

Feed_Reader f=new Feed_Reader();
//f.getShowTitles(url);
//f.getShowcaseElement(url);
//f.getShelfTitle(url);
f.getShelfContentsByTitle(url);
}



//System.out.println("total item presents : "+index);

    
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






