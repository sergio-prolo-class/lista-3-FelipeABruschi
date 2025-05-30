package Biblioteca;

public class Emprestimo {
    private Leitor leitor;
    private Livro livro;
    private String data_emprestimo;

    public Emprestimo(Leitor leitor, Livro livro, String data) {
        this.leitor = leitor;
        this.livro = livro;
        this.data_emprestimo = data;
    }

    public Livro getLivro() {
        return livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public String getData() {
        return this.data_emprestimo;
    }
}
