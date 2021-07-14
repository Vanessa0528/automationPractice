package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.loginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class loginTask implements Task {

    private final String mail;
    private final String password;

    public loginTask(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(loginUI.BUTTON_SING_IN));
        actor.attemptsTo(Enter.theValue(mail).into(loginUI.INPUT_MAIL));
        actor.attemptsTo(Enter.theValue(password).into(loginUI.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(loginUI.BUTTON_SING_IN_SUBMIT));

    }

    public static Performable Login(String mail,String password)
    {
        return instrumented(loginTask.class,mail,password);
    }
}
