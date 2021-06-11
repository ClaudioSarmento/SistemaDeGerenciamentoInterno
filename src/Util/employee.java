package Util;

/**
 *
 * @author claud
 */
public abstract class employee extends person{
    protected double salario;
    protected int ramal;
    
    public employee() {
        super();
        this.salario=0.0;
        this.ramal=0;
    }

    public employee(double salario,int ramal,String nome,String documento) {
        super(nome, documento);
        this.setSalario(salario);
        this.setRamal(ramal);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Integer getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    public double calculaSalarioAnual (){
        return this.salario*13;
    }
}
