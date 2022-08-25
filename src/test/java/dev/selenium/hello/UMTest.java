package dev.selenium.hello;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

public class UMTest {
    @Test
    public void calendario() {

        System.setProperty("webdriver.chrome.driver", "/Users/fcontigliani/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://um.edu.ar/");
        driver.manage().window().setSize(new Dimension(1024, 743));
        driver.findElement(By.name("s")).click();
        driver.findElement(By.name("s")).sendKeys("CALENDARIO");
        driver.findElement(By.name("s")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@id=\'content\']/div/div[2]/div/div/div/div/div/div/div/div/div[3]/div[5]/div/h2/a")).click();
        driver.findElement(By.xpath("//h1/span")).click();
        assertThat(driver.getTitle(), is("Calendario Académico fcjs – Universidad de Mendoza"));
        driver.quit(); // Cierra el navegador

    }


    
}
