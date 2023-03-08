package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class C05_TekrarTesti {
    public static void main(String[] args) {
        /*
        1.amazon'a gidin
        2. ara
        3.görüntülenen sonucların sayısını yazdırın
        4.shopping'e tıklayın
        5.ilk çıkan resme tıklayın
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
        List<WebElement>istenenElementListesi=driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazısı=istenenElementListesi.get(0);
        System.out.println(sonucYazısı.getText());
         //görüntülenen ilgili sonucların sayısını yazdırın
     String sonucYazısıDeğerleri= String.valueOf(sonucYazısı.getText());
        System.out.println(sonucYazısıDeğerleri);
        //Sonuç değerinin kaç tane olduğunu yazdırın
    String[]arr=sonucYazısıDeğerleri.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
        //çıkan ilk resme tıklayın
    List<WebElement>urunResimleri=driver.findElements(By.className("sg-col-inner"));
    WebElement ılkUrunResmi=urunResimleri.get(4);
    ılkUrunResmi.click();

        }


    }





