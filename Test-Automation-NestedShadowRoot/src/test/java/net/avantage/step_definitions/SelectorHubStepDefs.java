package net.avantage.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.avantage.pages.SelectorHubPage;
import net.avantage.utils.Driver;

public class SelectorHubStepDefs {

    SelectorHubPage selectorHubPage = new SelectorHubPage();

    @Given("navigate tp selectorHub practice page")
    public void navigate_tp_selector_hub_practice_page() {
        Driver.get().get("https://selectorshub.com/xpath-practice-page/");
    }

    @Given("type name in enterName box")
    public void type_name_in_enter_name_box() {
        selectorHubPage.typeUserName();


    }

    @And("handle closed shadowRoot")
    public void handleClosedShadowRoot() {
        selectorHubPage.closeShadowDom();
    }
}
