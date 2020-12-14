package br.com.test.java.steps;

import br.com.test.java.ExceptionTests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AprendendoCucumberSteps {

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

    Date entrega = new Date();
    Calendar calendar = Calendar.getInstance(); // Instancia do Calendar para outros métodos

    @Given("que a entrega eh dia {int}\\/{int}\\/{int}")
    public void queAEntregaEhDia(int dia, int mes, int ano) {
        calendar.set(Calendar.DAY_OF_MONTH,dia);
        calendar.set(Calendar.MONTH,mes - 1);
        calendar.set(Calendar.YEAR,ano);
        entrega = calendar.getTime();

    }
    @When("atrasar em {int} {string}")
    public void aAtrasarEmDias(int arg1, String tempo) throws Throwable {
        calendar.setTime(entrega);
        try {
            if(tempo.equals("dias")) {
                calendar.add(Calendar.DAY_OF_MONTH,arg1);
            }
            else if (tempo.equals("meses")){
                calendar.add(Calendar.MONTH,arg1);
            }
            else{
                throw new ExceptionTests("O valor "+ tempo +" é inválido! " + "O valor deve ser dia ou mês, no formato: DD ou MM");
            }

        } catch (ExceptionTests e){
            System.out.println("Ocorreu um erro! Por favor para continuar, corrija-o!");
            e.printStackTrace();
        }


        entrega = calendar.getTime();
    }
    @Then("a entrega sera efetuada em {string}")
    public void aEntregaSeraEfetuadaEm(String data) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = format.format(entrega);
        Assert.assertEquals(data,dataFormatada);
    }

}
