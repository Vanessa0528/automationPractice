package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.productUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class productTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


          actor.attemptsTo(Click.on(productUI.LIST_SIZE));
          actor.attemptsTo(Click.on(productUI.BUTTON_COLOR));
          actor.attemptsTo(Click.on(productUI.BUTTON_ADD_TO_CART));
          actor.attemptsTo(Click.on(productUI.BUTTON_PROCEED_TO_CHECKOUT));

    }

    public static Performable chooseProduct()
    {
        return instrumented(productTask.class);
    }
}
