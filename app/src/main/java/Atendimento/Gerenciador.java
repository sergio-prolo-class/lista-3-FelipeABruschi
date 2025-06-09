package Atendimento;

import java.util.LinkedList;
import java.util.List;

public class Gerenciador {
    private List<Cliente> atendimento;

    public Gerenciador(){
        this.atendimento = new LinkedList<>();
    }
    public void adiciona_cliente(Cliente cliente){
        this.atendimento.add(cliente);
    }


    public void getTelefones() {
        for (Cliente c : this.atendimento) {
            System.out.println(c.getTelefone());
        }
    }

    public void getNome() {
        for (Cliente c : this.atendimento) {
            if (!c.isAtendido()) {
                System.out.println(c.getNome());
                break;
            }
        }
    }

    public void atenderProximo() {
        for (Cliente c : this.atendimento) {
            if (!c.isAtendido()) {
                c.Atendido();
                break;
            }
        }
    }

    public void clientesAtendidos() {
        for (Cliente c : this.atendimento) {
            if (c.isAtendido()) {
                System.out.println(c.getNome());
            }
        }
    }

    public void clientesEspera() {
        for (Cliente c : this.atendimento) {
            if (!c.isAtendido()) {
                System.out.println(c.getNome());
            }
        }
    }
}
