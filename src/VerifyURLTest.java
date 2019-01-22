import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        String expectedUrl="http://www.google.com/";
        String actualUrl=driver.getCurrentUrl();
        if(expectedUrl.equalsIgnoreCase(actualUrl)) {
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println("actualUrl="+actualUrl);
            System.out.println("expectedUrl="+expectedUrl);
        }
        System.out.println(driver.getPageSource());//gets the html of the page

    }

}
