package Atendimento;

import java.util.ArrayList;
import java.util.List;

public class Solicitacao {
    private String descricao;
    private static List<String> categoria = new ArrayList<>();

    static {
        categoria.add("Suporte Tecnico");
        categoria.add("Informacao");
        categoria.add("Atendimento financeiro");
    }

    public Solicitacao(String descricao, String categoria){

    }
}
