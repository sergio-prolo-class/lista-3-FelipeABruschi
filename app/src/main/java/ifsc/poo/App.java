/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//        System.out.println("Digite o nome de um usuario");
//        Scanner teclado = new Scanner(System.in);
//        String login = teclado.nextLine();

        Usuario user = new Usuario("felipe", "123");
        Usuario user1 = new Usuario("joao", "321");
        Usuario user2 = new Usuario("fred", "ads");

        Gerenciador.listar();

        Gerenciador.autenticar("felipe", "22");
    }
}
