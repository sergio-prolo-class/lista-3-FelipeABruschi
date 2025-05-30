package Atendimento;

public class App {
    public static void main(String[] args) {

        Gerenciador gerenciador = new Gerenciador();

        //Cliente cliente1 = new Cliente("felipe", "2312823", "preco da agua", "atendimento financeiro");
        Cliente cliente2 = new Cliente("Bruno", "987632", "Erro na conta", "Atendimento Financeiro");

        //gerenciador.adiciona_cliente(cliente1);
        gerenciador.adiciona_cliente(cliente2);

        gerenciador.getNome();
        gerenciador.atenderProximo();
        gerenciador.clientesAtendidos();
        gerenciador.clientesEspera();
    }
}