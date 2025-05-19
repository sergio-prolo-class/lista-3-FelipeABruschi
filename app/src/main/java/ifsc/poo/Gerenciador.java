package ifsc.poo;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class Gerenciador {
    static Set<Usuario> usuarios = new LinkedHashSet<>();

    public static void criar(String login, String senha){
        Usuario user = new Usuario(login.toLowerCase(), senha);
        usuarios.add(user);
    }

//    public static boolean remover(String login){
//        if(usuarios.removeIf(user->)){
//
//        }
//    }
}
