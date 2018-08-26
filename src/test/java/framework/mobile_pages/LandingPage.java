package framework.mobile_pages;

import framework.Core.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.testng.Assert;

public class LandingPage extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Welcome to ICA']")
    @iOSFindBy(accessibility = "yesButton")
    private MobileElement yesButton;

    @AndroidFindBy(accessibility = "Open drawer menu")
    private MobileElement mainMenu;

    @AndroidFindBy(id = "com.hcom.android:id/drawer_header_sign_in")
    private MobileElement signInButton;

    public void tapOnYesButton() {
        boolean isTitleDisplayed = isElementDisplayed(yesButton);
        Assert.assertTrue(isTitleDisplayed);
    }

    public void tapOnMainMenuButton() {
        tapOn(mainMenu);
    }

    public void tapOnSignInButton() {
        tapOn(signInButton);
    }
}
