package stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.core.StringContains.containsString;

import questions.messageAfterAddProduct;
import questions.validateCompleteOrderQuestion;
import questions.validateOrderQuestion;
import task.productTask;
import task.searchProductTask;
import task.loginTask;
import task.shoppingCartTask;


public class BuyProductStep {

    @Before
    public void setUp()
    {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that the user enters to the page YourLogo$")
    public void that_the_user_enters_to_the_page_YourLogo() {

        theActorCalled("user").attemptsTo(Open.url("http://automationpractice.com/index.php"));

    }


    @When("^enter your credentials (.+) y (.+)$")
    public void enter_your_credentials(String mail,String password) {
        theActorCalled("user").attemptsTo(loginTask.Login(mail,password));

    }


    @And("^search a product with twenty porcentage discount$")
    public void search_a_product_with_twenty_porcentage_discount() {
        theActorCalled("user").attemptsTo(searchProductTask.SelectProduct());
    }


    @And("^add a product with size and color characteristics$")
    public void add_a_product_with_size_and_color_characteristics() {
        theActorCalled("user").attemptsTo(productTask.chooseProduct());
    }

    @Then("^the message is displayed(.+)$")
    public void the_message_is_displayed(String mesagge) {
        theActorCalled("user").should(
                seeThat(
                        messageAfterAddProduct.value().answeredBy(theActorCalled("user")),
                        messageAfterAddProduct.value(),
                        containsString(mesagge.trim())
                )
        );
    }

    @And("^make the checkout$")
    public void make_the_checkout() {
        theActorCalled("user").attemptsTo(shoppingCartTask.proceedCheckout());
    }

    @And("^validate the order buy(.+) y (.+)$")
    public void validate_the_order_buy(String msg,String cost) {

        theActorCalled("user").should(
                seeThat(
                        validateCompleteOrderQuestion.value().answeredBy(theActorCalled("user")),
                        validateCompleteOrderQuestion.value(),
                        containsString(msg.trim())
                )
        );

        theActorCalled("user").should(
                seeThat(
                        validateOrderQuestion.value().answeredBy(theActorCalled("user")),
                        validateOrderQuestion.value(),
                        containsString(cost.trim())
                )
        );



    }






}
