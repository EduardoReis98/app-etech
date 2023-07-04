package curso.etech.commos;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public static AppiumDriver driver;

    public void inicialzarDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulador E.Tech");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        capabilities.setCapability("appActivity","br.com.filme.app.modules.onboardingone.ui.OnboardingOneActivity");
        capabilities.setCapability("appPackage","br.com.filme.app");

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver(remoteUrl, capabilities);
    }
}
