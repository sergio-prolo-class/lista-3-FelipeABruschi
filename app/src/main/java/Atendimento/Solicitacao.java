package Atendimento;

import java.util.ArrayList;
import java.util.List;

public class Solicitacao {
    private String descricao;
    private String categoria;
    private static String[] categorias = new String[]{"Suporte tecnico", "Informacao", "Atendimento Financeiro"};

    public Solicitacao(String descricao, String categoria){
        Boolean categoria_valida = false;
        this.descricao = descricao;
        for(int i = 0; i < 3; i++)
            if(categoria.equals(categorias[i])){
                categoria_valida = true;
                break;
            }
        if(categoria_valida)
            this.categoria = categoria;
        else{
            System.out.println("Categoria inválida");
            System.exit(0);
        }
    }
}
