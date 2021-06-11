package Util;

/**
 *
 * @author claud
 */
public class salesman extends employee {
    private double comissao;
    
   public salesman() {
        super();
        this.comissao=0.0;
    }

    public salesman(double comissao,double salario,int ramal,String nome,
    String documento){
        super(salario, ramal, nome, documento);
        this.setComissao(comissao);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
    @Override
    public void exibeDados() {
        System.out.println("Função: Vendedor.\n");
        System.out.println("Nome: " + nome
                + "\nDocumento: " + documento);
    }
    
    public double salarioMesComComissao(){
        return comissao+salario;
    }
}
