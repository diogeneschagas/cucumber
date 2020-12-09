package br.com.test.java;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AprendendoCucumber {

    public void executarPassos(){
        int quantidade = 3;
        int [] quantPassos = new int[quantidade];
        for (int i = 0; i < quantidade; i++){
            System.out.println("Passo" + (i+1));
        }

    }

    @Given("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() {
        executarPassos();
//        System.out.println("Passo1");
    }

    @When("executar")
    public void executar() {
        executarPassos();
//        System.out.println("Passo2");
    }

    @Then("a especificacao deve finalizar com sucesso")
    public void a_especificacao_deve_finalizar_com_sucesso() {
        executarPassos();
//        System.out.println("Passo3");
    }
}
