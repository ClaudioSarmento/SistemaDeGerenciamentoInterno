package Application;

import Util.client;
import Util.president;
import Util.secretary;
import Util.salesman;
import java.io.IOException;

/**
 *
 * @author claudio
 */

/*
 * 1 - Pontos de destaque a serem implementados:
 1.1 - Lembre-se de que métodos e classes com o nome em itálico são abstratos e, que no diagrama de classes não constam os métodos acessores.
1.2 - O método "exibeDados" deve listar o nome e, o documento da pessoa, assim como qual é o papel da pessoa na organização (presidente, secretária, vendedor ou cliente).
1.3 - O método "verificarSenha" recebe uma senha como parâmetro e, compara com a senha armazenada para o cliente. Não se preocupe com criptografia, a senha vai estar em texto comum e, vai ser comparada com a que for passada com parâmetro.
1.4 - O método "calculaSalarioAnual" retornará o salário somado dos 12 meses, mais o décimo terceiro. Conta simples, mesmo.
1.5 - O método "salarioMesComComissao" vai retornar o salário do vendedor, somado à comissão dele que for cadastrada. Como a comissão é aplicada ao valor de vendas e, essa parte ainda não consta no diagrama, considere que a comissão cadastrada já é o valor final da comissão em reais.
1.6 - Todas as classes (que precisarem dos construtores) devem ter apenas um construtor vazio (sem parâmetros) e, um construtor com todos os parâmetros para já adicionar os valores na criação.
 
2 - Para garantir que o sistema funciona como esperado, seu chefe pediu para realizar as seguintes ações:
2.1 - Cadastre o presidente da empresa, que é o Asdrubal Leôncio Correa.
2.2 - Cadastre as duas secretárias, a Fátima e, a Ana.
2.3 - Cadastre os vendedores João, Vanessa e, Carlos.
2.4 - Cadastre os clientes Marcos, Joana, Elisa e, Lucas.
2.5 - Defina as comissões dos vendedores
2.6 - Calcule o salário anual do Asdrubal e, da Ana.
2.7 - O usuário Lucas esqueceu a senha dele. Verifique se a senha dele é "123456", "segredo" ou "teste".
2.8 - Mande exibir os dados de todas as pessoas (uma por uma).
 
Essas ações devem ficar em sua classe principal para que, ao executar, as ações já sejam executadas.
 
* Os detalhes que você não tiver sobre as pessoas você pode inventar.
 */
public class application {
    public static void main(String[] args) throws IOException{
    	
        /* inicializando os objetos */
        president presi = new president(20000.0, 10, "Asdrubal Leôncio"
                + " Correa", "123456");
        secretary secre1 = new secretary(4200.0, 11, "Fátima", "654821796");
        secretary secre2 = new secretary(4200.0, 12, "Ana", "659845447");
        salesman vend1 = new salesman(0.0, 2500.0, 13, "João", "698752146");
        salesman vend2 = new salesman(0.0, 2500.0, 14, "Vanessa", "165954842");
        salesman vend3 = new salesman(0.0, 2500.0, 15, "Carlos", "369548452");
        client cli1 = new client("001", "6954", "Marcos", "14598763");
        client cli2 = new client("002", "4874", "Joana", "985621478");
        client cli3 = new client("003", "986544", "Elisa", "236548972");
        client cli4 = new client("004", "teste", "Lucas", "1569548");

        /*comissÃµes vendedores*/
        vend1.setComissao(350.0);
        vend2.setComissao(800.0);
        vend3.setComissao(1850.0);

        //salario anual de Asdrubal e Ana
        System.out.println("==== SISTEMA DE GERENCIAMENTO INTERNO ====");
        System.out.println("O Salario Anual do Presidente Asdrubal é: R$ " 
                + presi.calculaSalarioAnual());
        System.out.println("\nO Salario Anual da Secretária Ana é: R$ " 
                + secre2.calculaSalarioAnual());
        System.out.println("\n--PRESSIONE A TECLA 'ENTER' PARA CONTINUAR--");
        System.in.read();
        System.out.println("===VERIFICAÇÃO DE SENHA===");
        if(cli4.getSenha()=="123456"){
            System.out.println("A senha de Lucas é: '123456'");
        }
        else if (cli4.getSenha()=="segredo"){
            System.out.println("A senha de Lucas é: 'segredo'");
        }
        else if (cli4.getSenha()=="teste"){
            System.out.println("A senha de Lucas é: 'teste'");
        }
        else{
            System.out.println("A senha de Lucas está errada");
        }
         System.out.println("\n--PRESSIONE A TECLA 'ENTER' PARA CONTINUAR--");
        System.in.read();
        
        /* exibe dados de todos */ 
        System.out.println("\n====================================\n");
        System.out.println("\n         EXIBIÇÃO DE DADOS:         \n");
        presi.exibeDados();
        System.out.println("\n================\\===================\n");
        secre1.exibeDados();
        System.out.println("\n================\\===================\n");
        secre2.exibeDados();
        System.out.println("\n================\\===================\n");
        vend1.exibeDados();
        System.out.println("\n================\\===================\n");
        vend2.exibeDados();
        System.out.println("\n================\\===================\n");
        vend3.exibeDados();
        System.out.println("\n================\\===================\n");
        cli1.exibeDados();
        System.out.println("\n================\\===================\n");
        cli2.exibeDados();
        System.out.println("\n================\\===================\n");
        cli3.exibeDados();
        System.out.println("\n================\\===================\n");
        cli4.exibeDados();
        
    }
    
}
