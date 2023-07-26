package net.avantage.pages;

import net.avantage.utils.BrowserUtils;
import net.avantage.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectorHubPage {

    public SelectorHubPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "div#userName")
    public WebElement shadowHostUserName;

    @FindBy(css = "div#userPass")
    public WebElement userPass;

    public void typeUserName() {
        BrowserUtils.waitForClickablility(shadowHostUserName, 5);
        SearchContext shadowRoot1 = shadowHostUserName.getShadowRoot();
        WebElement enterName = shadowRoot1.findElement(By.cssSelector("input#kils"));
        enterName.sendKeys("who who");
    }

    public void closeShadowDom() {
        BrowserUtils.waitForClickablility(userPass,5);
        userPass.click();
        Actions action=new Actions(Driver.get());
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys("NeoTech").perform();
    }
}
