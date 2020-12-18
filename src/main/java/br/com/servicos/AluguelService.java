package br.com.servicos;

import br.com.entidades.Filme;
import br.com.entidades.NotaAluguel;
import br.com.exceptions.ExceptionTests;
import br.com.utils.DateUtils;

public class AluguelService {

    public NotaAluguel alugar(Filme filme, String tipoAluguel) throws ExceptionTests {
        if (filme.getEstoque() == 0) {
            throw new ExceptionTests("Filme sem estoque");
        }
        NotaAluguel nota = new NotaAluguel();
        if ("estendido".equals(tipoAluguel)) {
            nota.setPreco(filme.getAluguel() * 2);
            nota.setDataEntrega(DateUtils.obterDataDiferencaDias(3));
            nota.setPontuacao(2);
        } else {
            nota.setPreco(filme.getAluguel());
            nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));
            nota.setPontuacao(1);
        }

        filme.setEstoque(filme.getEstoque() - 1);
        return nota;
    }
}
