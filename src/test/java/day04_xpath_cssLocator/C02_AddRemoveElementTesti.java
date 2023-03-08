package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_AddRemoveElementTesti {
    public static void main(String[] args) throws InterruptedException {
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //Add element butonuna basın
        //Delete butonunun görünür oldugunu test edin
        //delete tusuna basın
        //"Add/Remove Elements" yazısının görünür oldugunu test edin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add element butonuna basın
        //bir kez kullanacağımız için weblement olusturmadık
       driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
       //button[text()='Add Element']


        WebElement deleteButonu=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
      if (deleteButonu.isDisplayed()){
          System.out.println("Delete butonu testi PASSED");
      }else{
          System.out.println("Delete butonu testi FAILED");
      }
      Thread.sleep(3000);
      deleteButonu.click();


      WebElement addRemoveElementi=driver.findElement(By.xpath("//h3"));
      if(addRemoveElementi.isDisplayed()){
          System.out.println("Add remove elementi testi PASSED");
      }else {
          System.out.println("Add remove elementi testi FAILED");
      }
driver.close();
    }
}
