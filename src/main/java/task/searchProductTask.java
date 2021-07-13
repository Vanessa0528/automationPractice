package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.homeUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class searchProductTask implements Task {


    public searchProductTask() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(homeUI.BUTTON_HOME));
        actor.attemptsTo(Click.on(homeUI.LIST_RESULTS));


    }

    public static Performable SelectProduct ( )
    {
        return instrumented(searchProductTask.class);
    }
}
