package DressTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultsPage {


    WebDriver myWebDriver;
    WebDriverWait wait = new WebDriverWait(myWebDriver, 10);

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
    private WebElement resultsDisplay;




    public String searchResults(){

       return resultsDisplay.getText();

    }



}
