package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("maximize boyut : " + driver.manage().window().getSize()); // (1552, 832)
        System.out.println("maximize konum : " + driver.manage().window().getPosition()); //(-8, -8)

        driver.manage().window().fullscreen();
        System.out.println(" fullscreen boyut : " + driver.manage().window().getSize()); //(1536, 864) çözünürlük
        System.out.println("fulscreen konum : " + driver.manage().window().getPosition()); //(0, 0)
    }

}
