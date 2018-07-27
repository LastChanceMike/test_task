package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ToKillADragonPage {
    private WebDriver driver;

    private By aleksandrAbdulovPath = By.linkText("Aleksandr Abdulov");
    private By olegYankovskyPath = By.linkText("Oleg Yankovsky");
    private By yevgenyLeonovPath = By.linkText("Yevgeny Leonov");
    private By vyacheslavTikhonovPath = By.linkText("Vyacheslav Tikhonov");
    private By aleksandraZakharovaPath = By.linkText("Aleksandra Zakharova");
    private By viktorRakovPath = By.xpath("//a[@href='/wiki/Viktor_Rakov']");

    public ToKillADragonPage(WebDriver driver) {
        this.driver = driver;
    }

    public AleksandrAbdulovPage goToAleksandrAbdulovPage(){
        driver.findElement(aleksandrAbdulovPath).click();
        return new AleksandrAbdulovPage(driver);
    }

    public OlegYankovskyPage goToOlegYankovskyPage(){
        driver.findElement(olegYankovskyPath).click();
        return new OlegYankovskyPage(driver);
    }

    public YevgenyLeonovPage goToYevgenyLeonovPage(){
        driver.findElement(yevgenyLeonovPath).click();
        return new YevgenyLeonovPage(driver);
    }

    public VyacheslavTikhonovPage goToVyacheslavTikhonovPage(){
        driver.findElement(vyacheslavTikhonovPath).click();
        return new VyacheslavTikhonovPage(driver);
    }

    public AleksandraZakharovaPage goToAleksandraZakharovaPage(){
        driver.findElement(aleksandraZakharovaPath).click();
        return new AleksandraZakharovaPage(driver);
    }

    public ViktorRakovPage goToViktorRakovPage(){
        driver.findElement(viktorRakovPath).click();
        return new ViktorRakovPage(driver);
    }
}
