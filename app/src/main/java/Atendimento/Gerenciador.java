package Atendimento;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private List<Cliente> clientes = new ArrayList<>();

    public Gerenciador(String nome, String telefone, String pedido, String categoria){
        Cliente cliente = new Cliente(nome, telefone, pedido, categoria);
        this.clientes.add(cliente);
    }

    public String[] get_telefones(){
        this.clientes->getTelefone();
    }
}
