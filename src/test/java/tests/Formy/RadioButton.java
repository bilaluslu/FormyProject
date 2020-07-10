package tests.Formy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;

import static utils.ReusableMethods.clickOnTheDesiredLink1;

public class RadioButton {

    @Test
    public void verify_button_link_page() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);

        clickOnTheDesiredLink1("Radio Button");

        Driver.get().close();
    }

    @Test
    public void verify_button_link_page_1() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);

        clickOnTheDesiredLink1("Radio Button");
// verification
        Assert.assertEquals(Driver.get().getCurrentUrl() , "http://formy-project.herokuapp.com/radiobutton");

        Driver.get().close();
    }
}
