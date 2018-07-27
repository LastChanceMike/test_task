package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VyacheslavTikhonovPage {

    private WebDriver driver;

    private By filmographyPath = By.xpath("//*[@id='mw-content-text']/div/table[2]/tbody");

    public VyacheslavTikhonovPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> filmography(){
        return driver.findElements(filmographyPath);
    }
}
