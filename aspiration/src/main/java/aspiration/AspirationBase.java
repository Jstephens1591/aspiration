package aspiration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AspirationBase {
    WebDriver driver;

    public AspirationBase(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/imaso/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}


