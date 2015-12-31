package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Apply {

	public static void main(String[] args) throws IOException {
		Properties or=new Properties();
		FileInputStream fs=new FileInputStream("C:\\workspace\\testing\\src\\testing\\or.properties");
		or.load(fs);
		System.out.println(or.getProperty("url"));
	}

}
