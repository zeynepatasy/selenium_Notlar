package day01_selenıumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        //en ilkel haliyle bir otomasyon yapmak için
        //Class'ımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
        //bunun için java kütüphanesinden System.setProperty methodunu kullanırız
        //method 2 parametre ister: 1.kullanacağımız webdriver.chrome.driver // 2.driver ın fiziki yolu src/resources/drivers/chromedriver.exe

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.get("https://www.amazon.com");
        driver.close();
    }
}
