package ifsc.poo;

public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public String getlogin(){
        return this.login;
    }

}
