package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.serenitybdd.screenplay.targets.Target;
import ui.productUI;

public class messageAfterAddProduct implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        Target msg = productUI.MSG_PRODUCT_ADDED;
        String content = new TextContent(msg, actor).resolve();
        return  content.trim();
    }

    public static Question<String> value() { return new messageAfterAddProduct(); }
}