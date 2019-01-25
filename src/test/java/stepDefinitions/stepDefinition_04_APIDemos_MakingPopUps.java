package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import MobileProgrammingLLC.PageLibraries.APIDemos_HomePage;
import MobileProgrammingLLC.PageLibraries.APIDemos_PopUpMenu;
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

public class stepDefinition_04_APIDemos_MakingPopUps {
	AndroidDriver<AndroidElement> driver;
	Logger log = LogManager.getLogger(stepDefinition_04_APIDemos_MakingPopUps.class.getName());
	Properties locators = new Properties();
	Properties config = new Properties();
	Properties data = new Properties();
	APIDemos_HomePage hp;
	APIDemos_Views v;
	APIDemos_PopUpMenu pm;
	Base b = new Base();
	
	@Before("@APIDemos_MakingPopUps")
	public void initConfig() {
		log.info("Initializing Configurations...");
		locators = b.loadLocators();
		config = b.loadConfig();
		data = b.loadData();
		driver = b.createAppiumServerConnection(config.getProperty("ip"),config.getProperty("port"), config.getProperty("DeviceType"));
		hp = new APIDemos_HomePage(driver);
		v = new APIDemos_Views(driver);
		pm = new APIDemos_PopUpMenu(driver);
		log.info("Configurations Successfully Initialized.");
	}
	
	@When("^User taps on Views option$")
    public void user_taps_on_views_option() throws Throwable {
		b.tapOn(hp.getViewsOption(), driver);
    }
	
    @And("^taps on Pop Up option$")
    public void taps_on_pop_up_option() throws Throwable {
    	b.scrollTo(locators.getProperty("PopUpMenu"), driver);
		b.tapOn(v.getPopUpMenuOption(), driver);
    }

    @Then("^User should be able to make a pop up$")
    public void user_should_be_able_to_make_a_pop_up() throws Throwable {
    	b.tapOn(pm.getPopUpMenuBtn(), driver);
    }
    
    @After("@APIDemos_MakingPopUps")
    public void tearDown(Scenario scenario) {
    	if(scenario.isFailed()) {
    		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    		scenario.embed(screenshot, "image.png");
    	}
    	b.quitDriver();
    }
}
