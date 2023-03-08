package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        //https://www.amazon.com url'ine gidin
        //baslığın amazon kelimesi içerdiğini test edin
        //url'in https://www.amazon.com ' a ait oldugunu test edin
        //sayfayı kapatın

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");
        //baslığın amazon kelimesi içerdiğini test edin
       String actualTitle= driver.getTitle();
       String arananKelime="Amazon";
       if (actualTitle.contains(arananKelime)){
           System.out.println("Title testi PASSED");
       }else {
           System.out.println("Title testi FAILED");
       }

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("actual url: " + actualUrl + "beklenen Url'den farklı, test FAILED");
        }

               driver.close();
    }
}
