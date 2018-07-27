package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViktorRakovPage {

    private WebDriver driver;

    private By filmographyPath = By.xpath("//*[@id='mw-content-text']/div/div[2]/ul");

    public ViktorRakovPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> filmography(){
        return driver.findElements(filmographyPath);
    }
}
