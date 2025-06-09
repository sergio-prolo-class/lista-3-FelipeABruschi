package Biblioteca;

public class Leitor {
    private String nome;
    private String endereco;
    private String telefone;
    private int id;
    private static int aux = 1;


    public Leitor(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.id = aux;
        aux++;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
}
