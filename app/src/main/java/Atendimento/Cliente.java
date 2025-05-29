package Atendimento;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private Boolean atendido;
    private List<Solicitacao> pedido = new ArrayList<>();

    public Cliente(String nome, String telefone, String pedido, String categoria){
        this.nome = nome;
        this.telefone = telefone;
        this.atendido = false;
        Solicitacao meu_pedido = new Solicitacao(pedido, categoria);
        this.pedido.add(meu_pedido);
    }

    public void nova_solicitacao(String pedido, String categoria){
        Solicitacao meu_pedido = new Solicitacao(pedido, categoria);
        this.pedido.add(meu_pedido);
    }

    public String getTelefone(){
        return this.telefone;
    }


}
