package co.com.choucair.certification.RetoLatam.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LatamMyTrips extends PageObject {

    public static final Target MY_TRIPS = Target.the("My Trips").located(By.xpath("//a[@class='sc-kUaPvJ jSdLHl']"));
}
