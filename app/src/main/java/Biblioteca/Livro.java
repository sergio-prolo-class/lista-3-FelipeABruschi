package Biblioteca;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String codigo;
    private int copias;
    private ArrayList<Autor> autores;

    public Livro(String titulo, String codigo, ArrayList<Autor> autores, int copias) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autores = autores;
        this.copias = copias;
    }

    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public ArrayList<Autor> getAutores() {
        return this.autores;
    }

    public int getCopias() {
        return this.copias;
    }

    public void emprestar() {
        if (copias > 0)
            copias--;
    }

    public void devolver() {
        copias++;
    }

}
