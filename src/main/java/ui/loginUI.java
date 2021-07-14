package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class loginUI {

    public static final Target BUTTON_SING_IN = Target.the("Sing in").located(By.xpath("//*[@class='login']"));
    public static final Target INPUT_MAIL =Target.the("Enter email").located(By.id("email"));
    public static final Target INPUT_PASSWORD =Target.the("Enter password").located(By.id("passwd"));
    public static final Target BUTTON_SING_IN_SUBMIT =Target.the("SubmitLogin").located(By.id("SubmitLogin"));


}

