package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import MobileProgrammingLLC.PageLibraries.APIDemos_DragAndDrop;
import MobileProgrammingLLC.PageLibraries.APIDemos_HomePage;
import MobileProgrammingLLC.PageLibraries.APIDemos_Views;
import MobileProgrammingLLC.Resources.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class stepDefinition_03_APIDemos_PlayingRedDots {
	AndroidDriver<AndroidElement> driver;
	Logger log = LogManager.getLogger(stepDefinition_03_APIDemos_PlayingRedDots.class.getName());
	Properties locators = new Properties();
	Properties config = new Properties();
	Properties data = new Properties();
	APIDemos_HomePage hp;
	APIDemos_Views v;
	APIDemos_DragAndDrop dd;
	Base b = new Base();
	
	@Before("@APIDemos_PlayingRedDots")
	public void initConfig() {
		log.info("Initializing Configurations...");
		locators = b.loadLocators();
		config = b.loadConfig();
		data = b.loadData();
		driver = b.createAppiumServerConnection(config.getProperty("ip"),config.getProperty("port"), config.getProperty("DeviceType"));
		hp = new APIDemos_HomePage(driver);
		v = new APIDemos_Views(driver);
		dd = new APIDemos_DragAndDrop(driver);
		log.info("Configurations Successfully Initialized.");
	}
	
    @When("^User taps on View Option$")
    public void user_taps_on_view_option() throws Throwable {
    	b.tapOn(hp.getViewsOption(), driver);
    }
    
    @And("^Taps on Drag And Drop Option$")
    public void taps_on_drag_and_drop_option() throws Throwable {
    	b.tapOn(v.getDragAndDropOption(), driver);
    }

    @Then("^User should be able to perform drag and drop operation from the first dot over the third dot$")
    public void user_should_be_able_to_perform_drag_and_drop_operation_from_the_first_dot_over_the_third_dot() throws Throwable {
    	b.longPressOn(dd.getDot1(), driver);
		b.moveTo(dd.getDot3(), driver, 200, 200);
    }
    
    @After("@APIDemos_PlayingRedDots")
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
          final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
          scenario.embed(screenshot, "image/png");
        }
        b.quitDriver();
    }
}
