package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import MobileProgrammingLLC.PageLibraries.APIDemos_HomePage;
import MobileProgrammingLLC.PageLibraries.APIDemos_Preference;
import MobileProgrammingLLC.PageLibraries.APIDemos_PreferenceDependencies;
import MobileProgrammingLLC.Resources.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class stepDefinition_01_APIDemos_SettingWifi {
	AndroidDriver<AndroidElement> driver;
	Logger log = LogManager.getLogger(stepDefinition_01_APIDemos_SettingWifi.class.getName());
	Properties locators = new Properties();
	Properties config = new Properties();
	Properties data = new Properties();
	APIDemos_HomePage hp;
	APIDemos_Preference p;
	APIDemos_PreferenceDependencies pd;
	Base b = new Base();
	
	@Before("@APIDemos_SettingWifi")
	public void initConfig() {
		log.info("Initializing Configurations...");
		locators = b.loadLocators();
		config = b.loadConfig();
		data = b.loadData();
		driver = b.createAppiumServerConnection(config.getProperty("ip"),config.getProperty("port"), config.getProperty("DeviceType"));
		hp = new APIDemos_HomePage(driver);
		p = new APIDemos_Preference(driver);
		pd = new APIDemos_PreferenceDependencies(driver);
		log.info("Configurations Successfully Initialized.");
	}
	
	@When("^User clicks on Preference Option$")
    public void user_clicks_on_preference_option() throws Throwable {
		b.tapOn(hp.getPreferenceLink(), driver);
    }
	
    @And("^clicks on Preference Dependencies Option$")
    public void clicks_on_preference_dependencies_option() throws Throwable {
    	b.tapOn(p.getPrefDependenciesLnk(), driver);
    }

    @Then("^User should be able to set the wifi of the device$")
    public void user_should_be_able_to_set_the_wifi_of_the_device() throws Throwable {
    	b.tapOn(pd.getWifiChkBox(), driver);
		b.tapOn(pd.getwifiSettingsLnk(), driver);
		pd.getwifiPasswordTF().sendKeys(data.getProperty("Password"));
		b.tapOn(pd.getWifiPopUpOKBtn(), driver);
    }
    
    @Then("^User should be able to set the wifi of the device using the password (.+)$")
    public void user_should_be_able_to_set_the_wifi_of_the_device_using_the_password(String password) throws Throwable {
    	b.tapOn(pd.getWifiChkBox(), driver);
		b.tapOn(pd.getwifiSettingsLnk(), driver);
		b.enterContentInto(pd.getwifiPasswordTF(), password);
		//pd.getwifiPasswordTF().sendKeys(data.getProperty("Password"));
		b.tapOn(pd.getWifiPopUpOKBtn(), driver);
    }

    @After("@APIDemos_SettingWifi")
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
          final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
          scenario.embed(screenshot, "image/png");
        }
        b.quitDriver();
    }
}
