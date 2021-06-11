package Util;

/**
 *
 * @author claud
 */
public class client extends person {
    private String usuario;
    private String senha;
    
    public client(){
        super();
        this.usuario = "";
        this.senha = "";
    }
    public client(String usuario, String senha, String nome, String documento) {
        super(nome, documento);
        this.setUsuario(usuario);
        this.setSenha(senha);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean verificaSenha(String senha){
        if(senha != this.senha){
            return false;
        }
        else{
            return true;
        }
    }

    @Override /* @Override : forma de garantir que você está sobrescrevendo 
    um método e não criando um novo. */
    public void exibeDados() {
        System.out.println("Dados Cliente:\n");
        System.out.println("Nome: " + nome
                + "\nDocumento: " + documento);
    }
    
}
