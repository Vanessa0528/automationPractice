package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class homeUI {

    public static final Target BUTTON_HOME =Target.the("return to home").located(By.xpath("//img[@class='logo img-responsive']"));
    public static final Target LIST_RESULTS =Target.the("product -20%").located(By.xpath("//div[@class='product-image-container']//span[@class='price-percent-reduction'][text()='-20%']/../../../..//div[@class='right-block']/div[@class='button-container']//a[2]"));

}
