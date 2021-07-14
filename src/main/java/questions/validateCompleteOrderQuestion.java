package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;
import ui.shoppingCartUI;

public class validateCompleteOrderQuestion implements  Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        Target text = shoppingCartUI.MSG_ORDER;
        String content = new TextContent(text, actor).resolve();
        return  content.trim();
    }

    public static Question<String> value()
    {
        return new validateCompleteOrderQuestion();
    }
}
