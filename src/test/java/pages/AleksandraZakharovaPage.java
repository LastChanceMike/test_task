package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AleksandraZakharovaPage {

    private WebDriver driver;

    private By filmographyPath = By.xpath("//*[@id='mw-content-text']/div/ul[1]");

    public AleksandraZakharovaPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> filmography(){
        return driver.findElements(filmographyPath);
    }
}
