package br.com.test.java;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AprendendoCucumber {

    @Given("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() {
        System.out.println("Passo1");
    }

    @When("executar")
    public void executar() {
        System.out.println("Passo2");
    }

    @Then("a especificacao deve finalizar com sucesso")
    public void a_especificacao_deve_finalizar_com_sucesso() {
        System.out.println("Passo3");
    }
}
