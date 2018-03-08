package clientwsgeoip;

import java.util.Scanner;
import net.webservicex.GeoIP;

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
                GeoIP IP = getGeoIP(new Scanner(System.in).nextLine());
                System.out.println("IP = " + IP.getIP());
                System.out.println("Country name = " + IP.getCountryName());
                System.out.println("Country code = " + IP.getCountryCode());
                break;
            
            case 2:
                System.out.println("IP = " + getGeoIPContext().getIP());
                System.out.println("Country name = " + getGeoIPContext().getCountryName());
                System.out.println("Country code = " + getGeoIPContext().getCountryCode());
                break;
                
           default:
                System.out.println("The number must be between 1-2.");
                break;
       }
    }


    private static GeoIP getGeoIP(java.lang.String ipAddress) {
        net.webservicex.GeoIPService service = new net.webservicex.GeoIPService();
        net.webservicex.GeoIPServiceSoap port = service.getGeoIPServiceSoap();
        return port.getGeoIP(ipAddress);
    }

    private static GeoIP getGeoIPContext() {
        net.webservicex.GeoIPService service = new net.webservicex.GeoIPService();
        net.webservicex.GeoIPServiceSoap port = service.getGeoIPServiceSoap();
        return port.getGeoIPContext();
    }
}
