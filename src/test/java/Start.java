import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void openPhoneBook(){
        //open browser
        wd=new ChromeDriver();

        //go to phonebook
       //wd.get("https://contacts-app.tobbymarshall815.vercel.app/home"); //without browser history
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home"); //with browser history

        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        //close browser
       // wd.close(); // close only one tab in browser
        wd.quit(); // close browser
    }
}
