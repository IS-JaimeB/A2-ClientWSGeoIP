package clientwsgeoip;

import java.net.URL;
import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author Jaime
 */
public class ClientWSGeoIP {
    public static void main(String[] args) throws Exception {
        System.out.println("What would you like to do?");
        System.out.println("1 - Get information of an IP");
        System.out.println("2 - Get your IP information");
        System.out.print("Enter a number: ");
      
        switch(new Scanner(System.in).nextInt()) {
            case 1:
                System.out.print("Enter an IP: ");
                String source2 = new Scanner(System.in).nextLine();
                String w = "http://www.webservicex.net/geoipservice.asmx/GetGeoIP";
                URL url1 = new URL(w);
                Scanner scan1 = new Scanner(url1.openStream());
                String source1 = new String();
                while(scan1.hasNext()){
                    source1 += scan1.nextLine();
                }
                Serializer serializer1 = new Persister();
                IP ip1 = new IP();
                serializer1.read(ip1,source2);
                System.out.println("IP = " + ip1.getIP());
                System.out.println("Country name = " + ip1.getCountryName());
                System.out.println("Country code = " + ip1.getCountryCode());
                break;
            
            case 2:
                String s = "http://www.webservicex.net/geoipservice.asmx/GetGeoIPContext";
                URL url = new URL(s);
                Scanner scan = new Scanner(url.openStream());
                String source = new String();
                while(scan.hasNext()){
                    source += scan.nextLine();
                }
                Serializer serializer = new Persister();
                IP ip = new IP();
                serializer.read(ip,source);
                
                System.out.println("IP = " + ip.getIP());
                System.out.println("Country name = " + ip.getCountryName());
                System.out.println("Country code = " + ip.getCountryCode());
                break;
                
           default:
                System.out.println("The number must be between 1-2.");
                break;
       }
    }
}
