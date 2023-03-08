package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        System.out.println("pencere ölçüleri : " + driver.manage().window().getSize()); // (1051, 798)
        System.out.println("pencere konumu : " + driver.manage().window().getPosition()); // (9, 9)
        Thread.sleep(2000);

        //pencerenin konumu ve büyüklüğünü değiştirelim
        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,600));

        System.out.println("yeni pencere ölçüleri : " + driver.manage().window().getSize()); //(902, 602)
        System.out.println("yeni pencere konumu : " + driver.manage().window().getPosition()); // (13, 13)

        driver.close();


    }
}
