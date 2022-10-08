package video2_driverMethodları;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Position;
import java.time.Duration;

public class DriverManageMethodları {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().getSize();
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        driver.manage().window().getPosition();
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());

        driver.manage().window().setPosition(new Point(15, 15));
        driver.manage().window().setSize(new Dimension(900, 600));

        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());


        driver.manage().window().minimize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
}
