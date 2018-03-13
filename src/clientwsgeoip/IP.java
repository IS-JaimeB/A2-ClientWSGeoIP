package clientwsgeoip;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author queralt
 */

@Root(name="GeoIP")
public class IP {
    
      @Element(required=false)
      private String ReturnCode;
      @Element(required=false)
      private String IP;
      @Element(required=false)
      private String ReturnCodeDetails;
      @Element(required=false)
      private String CountryName;
      @Element(required=false)
      private String CountryCode;
      
      public String getReturnCode()  {
          return ReturnCode;
      }
      
      public String getIP() {
          return IP;
      }
      
      public String getReturnCodeDetails() {
          return ReturnCodeDetails;
      }
      
      public String getCountryName() {
          return CountryName;
      }

      public String getCountryCode() {
          return CountryCode;
      }
      
      public void setReturnCode(String ReturnCode) {
          this.ReturnCode = ReturnCode;
      }
      
      public void setIP(String IP) {
          this.IP = IP;
      }
      
      public void setReturnCodeDetails(String ReturnCodeDetails) {
         this.ReturnCodeDetails = ReturnCodeDetails;
      }
      
      public void setCountryName(String CountryName) {
          this.CountryName = CountryName;
      }
      
      public void setCountryCode(String CountryCode) {
          this.CountryCode = CountryCode;
      }
}