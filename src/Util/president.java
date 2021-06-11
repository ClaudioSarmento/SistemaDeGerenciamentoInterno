package Util;

/**
 *
 * @author claud
 */
public class president extends employee{
    public president(double salario,int ramal,String nome,String documento) {
        super(salario, ramal, nome, documento);
    }

    public president() {
        super();
    }

    @Override
    public void exibeDados() {
        System.out.println("Função: Presidente.\n");
        System.out.println("Nome: " + nome
                + "\nDocumento: " + documento);
    }
}