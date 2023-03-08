package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       driver.get("https://www.amazon.com");
      // WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
       // findElement(By......locator....)--> istedğimiz webElementi bize döndürür
        //biz de o webElementi kullanmak için bir objeye assign ederiz
    //   aramaKutusu.sendKeys("nutella" + Keys.ENTER);
        //herhangi bir webElemente istedğimiz yazıyı göndermek için senKeys kullanırız.
        //Manuel olarak tıklamayi 2 sekilde yaparzı--> 1. nutella yazdıktan sonra enter yaparız --> 2.ordaki büyütece klik yaparz.
//<input type="text"
// id="twotabsearchtextbox"
// value="" name="field-keywords"
// autocomplete="off" placeholder="Search Amazon"
// class="nav-input nav-progressive-attribute"  ----->> className'le kullabiliriz... Ama genelde unique olmaz
// dir="auto" tabindex="0"
// aria-label="Search Amazon"
// spellcheck="false">
       WebElement aramaKutusu2= driver.findElement(By.name("field-keywords"));
       aramaKutusu2.sendKeys("nutella" + Keys.ENTER);

       //aradğımız webElementin unique olması çok önemlidir.

    }
}
