package co.com.choucair.certification.RetoLatam.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LatamConfirmation {


    public static final Target CONFIRMATION_CODE = Target.the("Confirmation code").located(By.xpath("(//div[@class='sc-pJVLq dIjrXL']//span)[2]"));
}
