package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import ui.productUI;

public class popUpCartQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        var msg = productUI.MSG_PRODUCT_ADDED;
        return  Ens;
    }
}
