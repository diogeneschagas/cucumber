package br.com.test.java;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AprendendoCucumber {

    /**
     * Cenário 1: Aprendendo a escrever cenários
     **/
    public void executarPassos(int numPasso) {
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

    /**
     * Cenário 2: Implementando um contador
     **/

    private int contador = 0;

    @Given("que o valor do contador eh {int}")
    public void queOValorDoContadorEh(int arg1) {
        contador = arg1;
    }

    @When("eu incrementar em {int}")
    public void euIncrementarEm(int arg1) {
        contador += arg1;
    }

    @Then("o valor do contador sera {int}")
    public void oValorDoContadorSera(int arg1) {
        Assert.assertEquals(arg1,contador);
    }

    /**
     * Cenário 03 - Calcular atraso na entrega
     */

    @Given("que a entrega eh dia {int}\\/{int}\\/{int}")
    public void queAEntregaEhDia(int dia, int mes, int ano) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("a atrasar em {int} dias")
    public void aAtrasarEmDias(int dias) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("a entrega sera efetuada em {int}\\/{int}\\/{int}")
    public void aEntregaSeraEfetuadaEm(int dia, int mes, int ano) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
