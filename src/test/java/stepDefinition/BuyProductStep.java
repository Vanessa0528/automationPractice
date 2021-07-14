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


    /*@Given("^that the user want do login in the application libreria nacional successful$")
    public void that_the_user_want_do_login_in_the_application_libreria_nacional_successful()
    {
        theActorCalled("user").attemptsTo(Open.url("https://librerianacional.com/"));
    }


    @When("^the user enter credentials (.+) y (.+)$")
    public void the_user_enter_credentials_y(String mail, String password)  {
        theActorCalled("user").attemptsTo(loginTask.Login(mail,password));
    }

    @When("^the user search the (.+)$")
    public void the_user_search_the(String book) {
        theActorCalled("user").attemptsTo(searchBookTask.search(book));
    }


    @Then("^validate that search throw results$")
    public void validate_that_search_throw_results() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(searchBookQuestion.validateResults()));
    }

    @Then("^the user close session$")
    public void the_user_close_session()
    {
        theActorCalled("user").attemptsTo(settingsAccountTask.closeSession());
    }*/

    @Given("^que el usuario ingresa a la pagina de YourLogo$")
    public void que_el_usuario_ingresa_a_la_pagina_de_YourLogo() {

        theActorCalled("user").attemptsTo(Open.url("http://automationpractice.com/index.php"));

    }


    @When("^ingresa sus credenciales (.+) y (.+)$")
    public void ingresa_sus_credenciales(String mail,String password) {
        theActorCalled("user").attemptsTo(loginTask.Login(mail,password));

    }


    @And("^busca un producto con descuento del veinte porciento$")
    public void busca_un_producto_con_descuento_del_veinte_porciento() {
        theActorCalled("user").attemptsTo(searchProductTask.SelectProduct());
    }


    @And("^anade un producto con las caracteristicas de talla y color$")
    public void anade_un_producto_con_las_caracteristicas_de_talla_y_color() {
        theActorCalled("user").attemptsTo(productTask.chooseProduct());
    }

    @Then("^se muestra el mensaje(.+)$")
    public void se_muestra_el_mensaje_(String mesagge) {
        theActorCalled("user").should(
                seeThat(
                        messageAfterAddProduct.value().answeredBy(theActorCalled("user")),
                        messageAfterAddProduct.value(),
                        containsString(mesagge.trim())
                )
        );
    }

    @And("^se realiza checkout$")
    public void se_realiza_el_checkout() {
        theActorCalled("user").attemptsTo(shoppingCartTask.proceedCheckout());
    }

    @And("^valida la orden de compra(.+)$")
    public void valida_la_orden_de_compra(String cost) {

    }






}
