package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;
import ui.shoppingCartUI;

public class validateOrderQuestion implements  Question<String>{


    @Override
    public String answeredBy(Actor actor) {
        Target amount = shoppingCartUI.TEXT_MSG_AMOUNT;
        String content = new TextContent(amount, actor).resolve();
        return  content.trim();
    }

    public static Question<String> value()
    {
        return new validateOrderQuestion();
    }

}
