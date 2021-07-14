package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class shoppingCartUI {

    public static final Target BUTTON_PROCEED_TO_CHECKOUT = Target.the( "proceed to checkout").located(By.xpath("//*[@class='btn btn-default button button-medium']//*[contains(text(),'Proceed to checkout')]"));
    public static final Target BUTTON_PROCEED_TO_CHECKOUT_SUMMARY = Target.the( "proceed to checkout summary").located(By.xpath("//*[@class='cart_navigation clearfix']//*[contains(text(),'Proceed to checkout')]"));
    public static final Target BUTTON_PROCEED_TO_CHECKOUT_ADDRESS = Target.the( "proceed to checkout address").located(By.name("processAddress"));
    public static final Target BUTTON_AGREE = Target.the( "mark agree").located(By.id("cgv"));
    public static final Target BUTTON_PROCEED_TO_CHECKOUT_SHIPPING = Target.the( "proceed to checkout shipping").located(By.name("processCarrier"));
    public static final Target BUTTON_PAYMENT = Target.the( "payment").located(By.xpath("//*[@class='bankwire']"));
    public static final Target BUTTON_CONFIRM_MY_ORDER = Target.the( "confirm").located(By.xpath("//*[@id='cart_navigation']//*[contains(text(),'I confirm my order')]"));
    public static final Target TEXT_MSG_AMOUNT = Target.the( "amount").located(By.xpath("//*[@class='price']//*[contains(text(),'$18.40')]"));
    public static final Target MSG_ORDER = Target.the( "complete order").located(By.xpath("//*[@class='box']//*[contains(text(),'Your order on My Store is complete.')]"));




}
