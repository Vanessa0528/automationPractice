package task;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.shoppingCartUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class shoppingCartTask implements Task {

    public shoppingCartTask() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(shoppingCartUI.BUTTON_PROCEED_TO_CHECKOUT));
        actor.attemptsTo(Click.on(shoppingCartUI.BUTTON_PROCEED_TO_CHECKOUT_SUMMARY));
        actor.attemptsTo(Click.on(shoppingCartUI.BUTTON_PROCEED_TO_CHECKOUT_ADDRESS));
        actor.attemptsTo(Click.on(shoppingCartUI.BUTTON_AGREE));
        actor.attemptsTo(Click.on(shoppingCartUI.BUTTON_PROCEED_TO_CHECKOUT_SHIPPING));
        actor.attemptsTo(Click.on(shoppingCartUI.BUTTON_PAYMENT));
        actor.attemptsTo(Click.on(shoppingCartUI.BUTTON_CONFIRM_MY_ORDER));
    }


    public static Performable proceedCheckout ( )
    {
        return instrumented(shoppingCartTask.class);
    }
}
