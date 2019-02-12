package hiscoxusa.oneshield.utils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWebdriverSetup {
    static public void setupBrowserWebDriver() {
        String browser = System.getProperty("webdriver.driver");
        if (browser == null) {
            browser = "null";
        }
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;
        }
    }
}
