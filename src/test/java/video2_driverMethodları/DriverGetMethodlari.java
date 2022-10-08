package video2_driverMethodları;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://amazon.com"); //yazdıgımız url e gider
        driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle()); //sayfanın baslıgını dondurur
        driver.getCurrentUrl();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());  //ıcınde oldugu sayfanın urlsını dondurur.
        driver.getPageSource();
        System.out.println("driver.getPageSource() = " + driver.getPageSource());  //ıcınde oldugu sayfanın kaynak kodunu gonderir
        driver.getWindowHandle();
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle()); //icinde oldugu sayfanın UNIQIE hash kodunu gonderir

    }
}
