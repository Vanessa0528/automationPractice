package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.homeUI;

public class searchBookQuestion implements Question{

    public static searchBookQuestion validateResults(){
        return new searchBookQuestion();
    }


    @Override
    public Object answeredBy(Actor actor) {
        int sizeResults  = homeUI.LIST_RESULTS.resolveAllFor(actor).size();
        if (sizeResults > 0)
            return true;
        else
            return false;
    }

}
