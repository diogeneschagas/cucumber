package br.com.entidades;

public class Filme {
    private int estoque;
    private int valorAluguel;

    public void setEstoque(int qtdFilmesDisponiveis) {
        this.estoque = qtdFilmesDisponiveis;
    }

    public void setAluguel(int precoAluguel) {
        this.valorAluguel = precoAluguel;
    }

    public int getAluguel() {
        return valorAluguel;
    }

    public int getEstoque() {
        return estoque;
    }
}
