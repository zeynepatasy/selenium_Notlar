package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //maksimum bekleme süresi esnektir
        Thread.sleep(2000);//Belirtilen süre dolana kadar mutlaka bekler. Esnek değildir.

        /*
        Bir sayfa açılırken ilk basta sayfanın içerisinde bulunan elementlere göre bir yüklenme süresine ihtiyaç vardır.
        veya bir webelementinin kullanılabilmesi için zamana ihtiyaç olabilir.
        impilicitlyWait bize sayfanın yüklenmesi ve sayfadaki elementlere ulasım için beklenecek maxımum süreyi belirleme olanağı sağlar.
         */
    }
}
