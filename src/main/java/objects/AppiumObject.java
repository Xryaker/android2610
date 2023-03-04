package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppiumObject {
    @FindBy(id = "downloadLink")
    WebElement element;

    public void printInfoButtoDownload(){
        System.out.println(element.getText());
        System.out.println(element.getAttribute("href"));
        System.out.println(element.getAttribute("data-localize"));
    }
}
