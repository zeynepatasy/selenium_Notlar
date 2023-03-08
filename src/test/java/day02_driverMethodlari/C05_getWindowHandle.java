package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());
        //CDwindow-A5A83B1C174427B26AB2BABDB19F8791 benzersiz olarak açılan window'a ait hashcode'unu verir.

    }
}
