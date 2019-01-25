package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import MobileProgrammingLLC.PageLibraries.APIDemos_ELCustomAdapter;
import MobileProgrammingLLC.PageLibraries.APIDemos_ExpandableLists;
import MobileProgrammingLLC.PageLibraries.APIDemos_HomePage;
import MobileProgrammingLLC.PageLibraries.APIDemos_Views;
import MobileProgrammingLLC.Resources.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class stepDefinition_02_APIDemos_RetrivingDogsInfo {
	AndroidDriver<AndroidElement> driver;
	Logger log = LogManager.getLogger(stepDefinition_02_APIDemos_RetrivingDogsInfo.class.getName());
	Properties locators = new Properties();
	Properties config = new Properties();
	Properties data = new Properties();
	APIDemos_HomePage hp;
	APIDemos_Views v;
	APIDemos_ExpandableLists el;
	APIDemos_ELCustomAdapter ca;
	Base b = new Base();
	
	@Before("@APIDemos_RetrivingInfo")
	public void initConfig() {
		log.info("Initializing Configurations...");
		locators = b.loadLocators();
		config = b.loadConfig();
		data = b.loadData();
		driver = b.createAppiumServerConnection(config.getProperty("ip"),config.getProperty("port"), config.getProperty("DeviceType"));
		hp = new APIDemos_HomePage(driver);
		v = new APIDemos_Views(driver);
		el = new APIDemos_ExpandableLists(driver);
		ca = new APIDemos_ELCustomAdapter(driver);
		log.info("Configurations Successfully Initialized.");
	}
	
	@When("^User navigates to Custom Adapter page$")
    public void user_navigates_to_custom_adapter_page() throws Throwable {
		b.tapOn(hp.getViewsOption(), driver);
		b.tapOn(v.getExpandableListsOption(), driver);
    }

    @Then("^User should be able to retrieve dogs information$")
    public void user_should_be_able_to_retrieve_dogs_information() throws Throwable {
    	b.tapOn(el.getCustomAdapterOption(), driver);
		b.longPressOn(ca.getDogNamesOption(), driver);
    }
    
    @After("@APIDemos_RetrivingInfo")
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
          final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
          scenario.embed(screenshot, "image/png");
        }
        b.quitDriver();
    }
}
