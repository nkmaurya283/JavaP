package stepdef;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver;
    @Before
    public void setUp(){
        driver=new ChromeDriver();
    }

    @Given("User takes the title of the page")
    public void user_takes_the_title_of_the_page() {
       driver.get("https://the-internet.herokuapp.com/");
       String title1=driver.getTitle();
        System.out.println("title is:"+title1);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
