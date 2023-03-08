package day04_xpath_cssLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LoginTest {
    public static void main(String[] args) {
        //verilen web sayfasına gidin https://a.testaddressbook.com/sign_in
        // email textbox, password textbox,signin button locate alın
        //asagidaki kullanıcı adı ve sifreyi girin
        //sign in düğmesine tıklayın
        //kullanıcı adı : testtechproed@gmail.com   sifre: Test1234!

        System.setProperty("webdriver.chorem.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //verilen web sayfasına gidin https://a.testaddressbook.com/sign_in
        driver.get("https://a.testaddressbook.com/sign_in");


    }
}
