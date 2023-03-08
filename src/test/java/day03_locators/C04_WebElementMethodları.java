package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodları {
    public static void main(String[] args) {
        //amazona gidip, arama kutusunu locate edin
        //arama kutusunun tagName'inin input oldugunu test edin
        //arama kutusunun name attribute'nun değerininn ... oldgunu test edin

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.amazon.com");
        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
        String actualAramaKutusuTagNme = aramaKutusuElementi.getTagName();
        String expectedAramaKutusuTagName = "input";
        if (expectedAramaKutusuTagName.equals(actualAramaKutusuTagNme)) {
            System.out.println("Tagname testi PASSED");
        } else {
            System.out.println("TagName testi FAıled");
        }

        String actualNameDeğeri = aramaKutusuElementi.getAttribute("name");
        String expectedNameDeğeri = "field-keywords";

        if (expectedNameDeğeri.equals(actualNameDeğeri)) {
            System.out.println("Name attribute testi PASSED");
        }else {
            System.out.println("Name attribute testi FAILED");
        }
        System.out.println("WebElementin konumu : " + aramaKutusuElementi.getLocation());
        System.out.println("WebElementin yüksekliği : " + aramaKutusuElementi.getSize().height);
        driver.close();
    }
}