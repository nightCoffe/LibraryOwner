package config;

import java.util.Objects;

public class LastWebDriverConfig {
     public Browser getBrowser() {
         String browserString = System.getProperty("browser");
         if (Objects.isNull(browserString)) {
             return Browser.CHROME;
         }
         return Browser.valueOf(browserString);
     }

     public String getBaseUrl() {
         String baseUrlString = System.getProperty("baseUrl");
         if (Objects.isNull(baseUrlString)) {
             return "https://github.com";
         }
         return baseUrlString;
     }

}
