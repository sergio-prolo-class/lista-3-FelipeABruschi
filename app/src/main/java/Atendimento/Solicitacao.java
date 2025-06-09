package Atendimento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solicitacao {
    private String descricao;
    private String categoria;
    private static List<String> categorias = Arrays.asList("Suporte tecnico", "Informacao", "Atendimento Financeiro");

    public Solicitacao(String descricao, String categoria){
        Boolean categoria_valida = false;
        this.descricao = descricao;
        if (!categorias.contains(categoria)) {
            throw new IllegalArgumentException("Categoria inválida: " + categoria);
        }
        this.categoria = categoria;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getCategoria() {
        return this.categoria;
    }
}
