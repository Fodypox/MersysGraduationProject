package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class AlexPOM extends MyMethods {

    public AlexPOM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);



    }
}
