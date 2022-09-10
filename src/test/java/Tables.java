import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.util.List;

public class Tables {
    WebDriver wd;

    @Test
    public void wschoolTables() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");

        //counts rows in table
        List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Count of rows" + listRows.size());
        Assert.assertEquals(listRows.size(), 7);

        // print last row
        WebElement lastRow = wd.findElement(By.cssSelector("#customers tr:last-child"));
        System.out.println(lastRow.getText());

        //print Canada
        WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(6) td:last-child"));
        System.out.println(canada.getText());
        Assert.assertEquals(canada.getText(), "Canada");

        //print count of columns
        List<WebElement> listColumns = wd.findElements(By.cssSelector("#customers th"));
        Assert.assertEquals(listColumns.size(), 3);
    }

    @Test
    public void homeWorkTable() {

        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/User/Downloads/index.html");

        //print count rows in table
        List<WebElement> listRows = wd.findElements(By.cssSelector("#country-table tr"));
        System.out.println("Count of rows" + listRows.size());
        Assert.assertEquals(listRows.size(), 4);

        //print last row

        WebElement lastRow = wd.findElement(By.cssSelector("#country-table tr:last-child"));
        System.out.println(lastRow.getText());
        Assert.assertEquals(lastRow.getText(), "Poland Chine Mexico");

        //print count of columns

        //?????????????????????????
        List<WebElement> count = wd.findElements(By.cssSelector("#country-table tr"));
        System.out.println("Count of columns is" + count.size());
        Assert.assertEquals(count.size(),4);

        //print text Israel
        WebElement israel = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:nth-child(2)"));
        System.out.println("Text is "  + israel.getText());
        Assert.assertEquals(israel.getText(),"Israel");




    }


}





