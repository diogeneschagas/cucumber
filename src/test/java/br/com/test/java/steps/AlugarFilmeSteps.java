package br.com.test.java.steps;

import br.com.entidades.NotaAluguel;
import br.com.exceptions.ExceptionTests;
import br.com.servicos.AluguelService;
import br.com.entidades.Filme;
import br.com.utils.DateUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        Date dataEsperada = DateUtils.obterDataDiferencaDias(int1);
        Date dataReal = nota.getDataEntrega();

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Assert.assertEquals(format.format(dataEsperada),format.format(dataReal));
    }

    @Then("a pontuacao recebida sera de {int} pontos")
    public void aPontuacaoRecebidaSeraDePontos(int int1) {
        Assert.assertEquals(int1,nota.getPontuacao());
    }
}
