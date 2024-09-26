package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HooksWeb {
    public static AndroidDriver androidDriver;
    static DesiredCapabilities capabilities = new DesiredCapabilities();

    @BeforeMethod
    public void setUpApplication(){
        try {
            capabilities.setCapability("deviceName","Pixel7");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("platformVersion","12.0");
            capabilities.setCapability("automationName","uiAutomator2");
            capabilities.setCapability("browserName", "chrome");    //hooks tan farklı olarak sadece bu satırı değiştidik
            //capabilities.setCapability("disableIdLocatorAutocompletion", true); //bunu ben kendim ekledim. inspectorda id bulurken appium kendisi otomotik olarak bir paket ismi atıyor bu da locatoru bulmamızı engelliyor. bunu disable yaptık
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"),capabilities);
            androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }catch (MalformedURLException e){
            System.out.println("URL Exception" + e.getMessage());
        }
    }

}
