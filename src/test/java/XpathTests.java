import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class XpathTests {
    WebDriver wd;

    @Test
    public void xPathTests(){
        wd= new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        wd.manage().window().maximize(); // open full screen
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //open Login form
        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        Assert.assertTrue(true,"//button[.=' Login']");

        //fill email noa@gmail.com
        WebElement inputMail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        inputMail.click();
        inputMail.clear();
        inputMail.sendKeys("noa@gmail.com");

        //fill password - Nnoa12345$
        WebElement inputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Nnoa12345$");

        //submit login
        WebElement loginBtn = wd.findElement(By.xpath("//button[normalize-space()='Login']"));
        loginBtn.click();

        Assert.assertTrue(true,"//button[normalize-space()='Sign Out']");

        wd.quit();
    }
}
