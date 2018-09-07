package DressTestPackage;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Pa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class StepClass {

    static ExtentReports extent;
    static ExtentTest test;

    WebDriver myWebDriver;

    HomePage homePage = PageFactory.initElements(myWebDriver, HomePage.class);
    ResultsPage resultsPage = PageFactory.initElements(myWebDriver, ResultsPage.class);


    @Given("^the search bar$")
    public void the_search_bar(String dressReport) throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Liam\\Desktop\\chromedriver.exe");
        myWebDriver = new ChromeDriver();
        myWebDriver.manage().window().maximize();
        String url = "http://automationpractice.com/index.php";
        myWebDriver.get(url);
        extent= new ExtentReports("C:\\Users\\Liam\\Desktop\\DressReport", true);
        test = extent.startTest(dressReport);


        try{
            assertEquals("http://automationpractice.com/index.php", myWebDriver.getCurrentUrl());
            test.log(LogStatus.PASS, "Web page loaded correctly");
        } catch (AssertionError e){
            test.log(LogStatus.FAIL, "Unable to load index page");
        }

    }

    @When("^I enter a search term$")
    public void i_enter_a_search_term()  {
        homePage.enterSearch();

    }

    @When("^I click search$")
    public void i_click_search() throws Throwable {

        homePage.clickSearch();
    }

    @Then("^I can see items that match my search terms$")
    public void i_can_see_items_that_match_my_search_terms() throws Throwable {

        try{
            assertEquals("7 results have been found.", resultsPage.searchResults());
            test.log(LogStatus.PASS, "results have loaded properly!");
        } catch (AssertionError e){
            test.log(LogStatus.FAIL, "correct search results unable to load");
        }


    }
}
