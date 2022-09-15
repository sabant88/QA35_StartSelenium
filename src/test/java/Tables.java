import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

public class Tables {

    WebDriver wd;

    @Test
    public void schoolTablesNew(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");

        //print count rows in table
      List<WebElement> listRows= wd.findElements(By.cssSelector("#customers tr  "));
        System.out.println("Count of rows = " + listRows.size());
        Assert.assertEquals(listRows.size(),7);

        //print last rows
        WebElement lastRow = wd.findElement(By.cssSelector("#customers tr:last-child"));
        System.out.println(lastRow.getText());



        //print count of columns
        List<WebElement> listColumns = wd.findElements(By.cssSelector("#customers  th"));
        Assert.assertEquals(listColumns.size(),3);


        //print text Canada
        WebElement textCountry = wd.findElement(By.cssSelector("#customers tr:nth-child(6) td:last-child"));
        System.out.println(textCountry.getText());
        Assert.assertEquals(textCountry.getText(),"Canada");


        wd.quit();

    }

    @Test
    public void homeWorkTable(){
        wd=new ChromeDriver();
        wd.navigate().to("file:///C:/Users/saban/Downloads/index.html");

        // print count rows in table
        List<WebElement> rows = wd.findElements(By.xpath("//tr"));
        List<WebElement> rows1 = wd.findElements(By.cssSelector("tr"));

        wd.findElement(By.xpath( "//table[@id='country-table']/tbody/tr"));
        wd.findElement(By.cssSelector( "table#country-table>tbody>tr"));



        wd.findElement(By.xpath("//table[@id='country-table']//tr"));
        wd.findElement(By.cssSelector( "table#country-table tr"));

        wd.findElement(By.xpath("//*[@id='country-table']//tr"));
        wd.findElement(By.cssSelector("#country-table tr"));
        Assert.assertEquals(rows.size(),4);
        // print last rows
        WebElement lastRow = wd.findElement(By.xpath("//tr[last()]"));
        wd.findElement(By.cssSelector("tr:last-child"));
        System.out.println(lastRow.getText()); // Poland Chine Mexico
        Assert.assertEquals(lastRow.getText(),"Poland Chine Mexico");
        // print count of columns

        List<WebElement> columns = wd.findElements(By.xpath("//tr[1]/td"));
        wd.findElement(By.cssSelector("tr:first-child>td"));
        Assert.assertEquals(columns.size(),3);
        // print text Israel
        WebElement israelText= wd.findElement(By.xpath("//tr[2]/td[2]"));
        wd.findElement(By.cssSelector("tr:nth-child(2)>td:nth-child(2)"));
        Assert.assertEquals(israelText.getText(),"Israel");

        wd.quit();
    }
}
