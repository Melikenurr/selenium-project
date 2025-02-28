import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaykartechNavbar {
    public static void main(String[] args) {

        BaykartechStart();



    }
    public static void BaykartechStart(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://kariyer.baykartech.com/tr/");
        driver.manage().window().maximize();
        System.out.println("Sayfa açıldı ve büyütüldü");
    }

}
