import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static util.Util.*;

public class Tests {

    private static WebDriver driver;
    private ToKillADragonPage toKillADragonPage;

    @BeforeClass
    public static void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Before
    public void before(){
        driver.get("https://en.wikipedia.org/wiki/To_Kill_a_Dragon");
        toKillADragonPage = new ToKillADragonPage(driver);
    }

    @Test
    public void aleksandrAbdulovTest(){
        AleksandrAbdulovPage aleksandrAbdulovPage = toKillADragonPage.goToAleksandrAbdulovPage();
        List<WebElement> films = aleksandrAbdulovPage.filmography();
        Assert.assertTrue(filmContainsCheck(toStringFilms(films)));
    }

    @Test
    public void olegYankovskyTest(){
        OlegYankovskyPage olegYankovskyPage = toKillADragonPage.goToOlegYankovskyPage();
        List<WebElement> films = olegYankovskyPage.filmography();
        Assert.assertTrue(filmContainsCheck(toStringFilms(films)));
    }

    @Test
    public void yevgenyLeonovTest(){
        YevgenyLeonovPage yevgenyLeonovPage = toKillADragonPage.goToYevgenyLeonovPage();
        List<WebElement> films = yevgenyLeonovPage.filmography();
        Assert.assertTrue(filmContainsCheck(toStringFilms(films)));
    }

    @Test
    public void vyacheslavTikhonovTest(){
        VyacheslavTikhonovPage vyacheslavTikhonovPage = toKillADragonPage.goToVyacheslavTikhonovPage();
        List<WebElement> films = vyacheslavTikhonovPage.filmography();
        Assert.assertTrue(filmContainsCheck(toStringFilms(films)));
    }

    @Test
    public void aleksandraZakharovaTest(){
        AleksandraZakharovaPage aleksandraZakharovaPage = toKillADragonPage.goToAleksandraZakharovaPage();
        List<WebElement> films = aleksandraZakharovaPage.filmography();
        Assert.assertTrue(filmContainsCheck(toStringFilms(films)));
    }

    @Test
    public void viktorRakovTest(){
        ViktorRakovPage viktorRakovPage = toKillADragonPage.goToViktorRakovPage();
        List<WebElement> films = viktorRakovPage.filmography();
        Assert.assertTrue(filmContainsCheck(toStringFilms(films)));
    }

    @AfterClass
    public static void afterClass(){
        driver.quit();
    }
}
