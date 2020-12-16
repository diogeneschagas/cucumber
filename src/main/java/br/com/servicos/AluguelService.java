package br.com.servicos;

import br.com.entidades.Filme;
import br.com.entidades.NotaAluguel;
import br.com.exceptions.ExceptionTests;
import br.com.utils.DateUtils;

import java.util.Calendar;

public class AluguelService {

    public NotaAluguel alugar(Filme filme) throws ExceptionTests {
        if(filme.getEstoque() == 0){
            throw new ExceptionTests("Filme sem estoque");
        }
        NotaAluguel nota = new NotaAluguel();
        nota.setPreco(filme.getAluguel());
        nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));

        filme.setEstoque(filme.getEstoque()-1);
        return nota;
    }
}
