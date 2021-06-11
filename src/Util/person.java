package Util;

/**
 *
 * @author claud
 */
public abstract class person {
    protected String nome;
    protected String documento;
    
    public abstract void exibeDados();
    
     public person(){
        this.setNome("");
        this.setDocumento("");
    }
    public person(String nome, String documento) {
        this.setNome(nome);
        this.setDocumento(documento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }   
}