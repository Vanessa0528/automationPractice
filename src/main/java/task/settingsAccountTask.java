package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.settingsAccountUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class settingsAccountTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


          actor.attemptsTo(Click.on(settingsAccountUI.BUTTON_MY_ACCOUNT));
          actor.attemptsTo(Click.on(settingsAccountUI.BUTTON_CLOSE_SESSION));

    }

    public static Performable closeSession()
    {
        return instrumented(settingsAccountTask.class);
    }
}
