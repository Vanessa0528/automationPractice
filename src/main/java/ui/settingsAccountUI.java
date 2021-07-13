package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class settingsAccountUI {

    public static final Target BUTTON_MY_ACCOUNT =Target.the("my account").located(By.xpath("//body//app-root//app-header//header//a[@href='/mi-cuenta']"));
    public static final Target BUTTON_CLOSE_SESSION =Target.the("close session").located(By.xpath("//span[contains(text(),' Cerrar sesi')]"));
}
