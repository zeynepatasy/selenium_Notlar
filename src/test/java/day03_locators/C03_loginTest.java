package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_loginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://a.testaddressbook.com");

        //sign in tıkla
        WebElement signInLinki= driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        //email password locate al
        WebElement emailTextBox= driver.findElement(By.id("session_email"));
        WebElement passwordTextBox= driver.findElement(By.name("session[password]"));
        WebElement signInButonu=driver.findElement(By.name("commit"));

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234");
        signInButonu.click();

        WebElement actualKullanıcAdiElementi=driver.findElement(By.className("navbar-text"));
        //System.out.println(actualKullanıcAdi); --> burda referans yazdırdı
        //Webelement bir obje ve non primitive data türü olduğu için referansını yazdırır
        System.out.println(actualKullanıcAdiElementi.getText()); //--> elementin üzerindeki  yazıyı getir. webElementismi.gettext kullanırız

        String expectedUserMail="testtechproed@gmail.com";
        if (expectedUserMail.equals(actualKullanıcAdiElementi)){
            System.out.println("Expected kullanıcı testi PASSED");
        }else{
            System.out.println("Expected kullanıcı testi FAILED");
        }
        WebElement adressesElementi=driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi=driver.findElement(By.linkText("Sign out"));

        if (adressesElementi.isDisplayed()){
            System.out.println("Addresses testi PASSED");
        }else {
            System.out.println("Addresses testi FAILED");
        }
        if (signOutElementi.isDisplayed()){
            System.out.println("signOutElementi testi PASSED");
        }else {
            System.out.println("signOutElementi testi FAILED");
        }
        //sayfada kaç link var bulunuz
        List<WebElement>linkSayısı=driver.findElements(By.tagName("a")); //tagname a dır linklerin
        System.out.println("Sayfadki link sayısı : " + linkSayısı.size());

        //linkleri yazdıralım
       // System.out.println(linkSayısı); obje oldugu için referanslarını yazdırır

        for (WebElement each:linkSayısı
             ) {
            System.out.println("Linkler : " + each.getText());
        }


        driver.close();

    }
}
