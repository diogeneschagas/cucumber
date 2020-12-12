package br.com.test.java;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AprendendoCucumber {

    public void executarPassos(int numPasso){
            System.out.println("Passo " + numPasso);
        }

    @Given("que criei o arquivo corretamente")
    public void queCrieiOArquivoCorretamente() {
        executarPassos(1);
    }

    @When("executar")
    public void executar() {
        executarPassos(2);
    }
    @Then("a especificacao deve finalizar com sucesso")
    public void aEspecificacaoDeveFinalizarComSucesso() {
        executarPassos(3);
    }
    @Then("passo enxerido")
    public void passoEnxerido() {
        executarPassos(4);
    }
}
