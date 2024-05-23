package Day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException 
	{
    FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
    Properties propertiesobj=new Properties();
    propertiesobj.load(file);
   String url= propertiesobj.getProperty("appurl");
   String email=propertiesobj.getProperty("email");
   String pwd=propertiesobj.getProperty("password");
   String orid=propertiesobj.getProperty("orderid");
   String custid=propertiesobj.getProperty("customerid");
   System.out.println(url+" "+email+" "+pwd+" "+orid+" "+custid);
   
  Set<String> keys=propertiesobj.stringPropertyNames();
  System.out.println(keys);
  Set<Object> key=propertiesobj.keySet();
  System.out.println(key);
 Collection<Object> values= propertiesobj.values();
 System.out.println(values);
    
	}

}
