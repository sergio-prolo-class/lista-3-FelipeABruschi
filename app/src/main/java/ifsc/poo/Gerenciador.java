package ifsc.poo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Gerenciador {
    static Set<Usuario> usuarios = new LinkedHashSet<>();

    public static void cadastrar(Usuario usuario) {

        for (Usuario user : usuarios)
            if (user.getlogin().equalsIgnoreCase(usuario.getlogin())){
                System.out.println("usuario ja existe");
                return;
            }
        usuarios.add(usuario);
    }

    public static boolean remover(String login){
        for (Usuario user : usuarios)
            if(user.getlogin().equalsIgnoreCase(login)){
                usuarios.remove(user);
                return true;
            }
        return false;
    }

    public static void listar(){
        for (Usuario user : usuarios){
            System.out.println(user.getlogin());
            System.out.println(user.getSenha());
        }
    }

    public static void autenticar(String login, String senha){
        boolean autenticado;
        for(Usuario user : usuarios) {
            if (!user.getlogin().equalsIgnoreCase(login))
                continue;
            if(user.getSenha().equals(senha))
                System.out.println("usuario autenticado");
            else
                System.out.println("login ou senha incorreta");
            break;
        }
    }
}
