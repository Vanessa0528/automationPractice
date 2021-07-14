package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class productUI {

    public static final Target LIST_SIZE =Target.the("Choose size").located(By.xpath("//select[@id='group_1']//option[@value='3']"));
    public static final Target BUTTON_COLOR =Target.the("choose color").located(By.id("color_15"));
    public static final Target BUTTON_ADD_TO_CART = Target.the("add to cart").located(By.id("add_to_cart"));
    public static final Target MSG_PRODUCT_ADDED = Target.the("product added").located(By.xpath("//div[@Id='layer_cart']/div[1]/div[1]/h2[text()]"));
}
