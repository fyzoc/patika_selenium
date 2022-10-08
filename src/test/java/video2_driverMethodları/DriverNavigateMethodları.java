package video2_driverMethodları;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodları {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com"); // istenen url gider ayni islemi yapar fakat forward ve back yapilmasina imkan tanir.
        driver.navigate().back(); //
        driver.navigate().forward();
        driver.navigate().refresh();// sayfayı yeniler
        driver.close(); // acilan sayfayı kapatir
        driver.quit();  //tüm tabları kapatir.
    }
}
