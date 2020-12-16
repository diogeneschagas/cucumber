package br.com.test.java.steps;

import br.com.entidades.NotaAluguel;
import br.com.exceptions.ExceptionTests;
import br.com.servicos.AluguelService;
import br.com.entidades.Filme;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Calendar;
import java.util.Date;

public class AlugarFilmeSteps {

    private Filme filme;
    private String tipoAluguel;
    private NotaAluguel nota;
    private String erro;

    @Given("um filme com estoque de {int} unidades")
    public void umFilmeComEstoqueDeUnidades(int qtdFilmesDisponiveis) {
        filme = new Filme();
        filme.setEstoque(qtdFilmesDisponiveis);
    }

    @Given("que o preco de aluguel seja R$ {int}")
    public void queOPrecoDeAluguelSejaR$(int precoAluguel) {
        filme.setAluguel(precoAluguel);
    }

    @When("alugar")
    public void alugar() {
        AluguelService aluguel = new AluguelService();
        try {
            nota = aluguel.alugar(filme, tipoAluguel);
        } catch (ExceptionTests e) {
            erro = e.getMessage();
        }
    }

    @Then("o preco do aluguel sera R$ {int}")
    public void oPrecoDoAluguelSeraR$(int precoFinalAluguel) {
        Assert.assertEquals(precoFinalAluguel, nota.getPreco());
    }

    @Then("a data de entrega sera no dia seguinte")
    public void aDataDeEntregaSeraNoDiaSeguinte() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 1);

        Date dataRetorno = nota.getDataEntrega();
        Calendar calRetorno = Calendar.getInstance();
        calRetorno.setTime(dataRetorno);

        Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
        Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
    }

    @Then("o estoque do filme sera {int} unidade")
    public void oEstoqueDoFilmeSeraUnidade(int qtdEstoque) {
        Assert.assertEquals(qtdEstoque, filme.getEstoque());
    }

    @Then("nao sera possivel por falta de estoque")
    public void naoSeraPossivelPorFaltaDeEstoque() {
        Assert.assertEquals("Filme sem estoque", erro);
    }

    /**
     * Cenário 03 - Aluguel estendido
     */

    @Given("que o tipo de aluguel seja estendido")
    public void queOTipoDeAluguelSejaEstendido() {
        tipoAluguel = "estendido";
    }

    @Then("a data de entrega sera de {int} dias")
    public void aDataDeEntregaSeraDeDias(Integer int1) {

    }

    @Then("a pontuacao recebida sera de {int} pontos")
    public void aPontuacaoRecebidaSeraDePontos(Integer int1) {

    }
}
