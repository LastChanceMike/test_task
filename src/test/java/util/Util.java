package util;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static String toStringFilms(List<WebElement> elements){
        String filmography = new String();
        for (WebElement e: elements) {
            filmography += e.getText();
        }
        return filmography;
    }

    public static boolean filmContainsCheck(String data){
        return data.contains("To Kill a Dragon");
    }
}
