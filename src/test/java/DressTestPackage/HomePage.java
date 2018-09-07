package DressTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {


    WebDriver myWebDriver;
    WebDriverWait wait = new WebDriverWait(myWebDriver, 10);

    @FindBy(id = "search_query_top")
    private WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    private WebElement searchButton;


    public void enterSearch(){
        searchBar.click();
        searchBar.clear();
        searchBar.sendKeys("Dress");
    }

    public void clickSearch(){
        searchButton.click();
    }


}
