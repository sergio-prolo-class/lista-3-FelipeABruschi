package Biblioteca;

public class Autor {
    private String nome;
    private String idioma;

    public Autor(String nome, String idiomaNativo) {
        this.nome = nome;
        this.idioma = idiomaNativo;
    }

    public String getNome() {
        return this.nome;
    }
}
