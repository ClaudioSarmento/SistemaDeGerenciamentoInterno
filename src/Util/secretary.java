package Util;

/**
 *
 * @author claud
 */
public class secretary extends employee {
     public secretary() {
        super();
    }

    public secretary(double salario,int ramal,String nome,String documento){
        super(salario, ramal, nome, documento);
    }

    
    @Override
    public void exibeDados() {
        System.out.println("Fun��o: Secret�ria.\n");
        System.out.println("Nome: " + nome
                + "\nDocumento: " + documento);
    }
}
