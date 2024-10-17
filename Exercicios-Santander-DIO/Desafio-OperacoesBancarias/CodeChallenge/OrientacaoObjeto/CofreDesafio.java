package CodeChallenge.OrientacaoObjeto;
import java.util.Scanner;
/** Desafio - 05
 Desenvolver um sistema de cofres seguros. O objetivo é criar dois tipos de cofres: 
      um Cofre Digital, que é aberto por senha, e um Cofre Físico, que é aberto por chave.

 ENTRADA: O programa irá solicitar ao usuário que digite o tipo de cofre a ser criado: 
              "digital" ou "físico". Se for escolhido o tipo "digital", o programa irá solicitar a 
                  senha e a confirmação de senha do cofre digital (ambas com apenas números). 
                      Caso seja escolhido o tipo "físico", não é necessário nenhuma outra entrada.     
                      
 SAÍDA: O programa irá exibir as informações do cofre criado. Para o Cofre Digital, 
             será exibido o tipo e o método de abertura (senha). Para o Cofre Físico, 
                 será exibido apenas o tipo e o método de abertura (chave).                    
*/

abstract class DesafioCofre {
    protected String tipo;
    protected String metodoAbertura;

    public DesafioCofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends DesafioCofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends DesafioCofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}

public class CofreDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {

            int senha1 = scanner.nextInt();
            int senha2 = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha1);
            cofreDigital.imprimirInformacoes();
            if (cofreDigital.validarSenha(senha2) == true){
                System.out.println("Cofre aberto!");
            }else{
                System.out.println("Senha incorreta!");
            }
        }else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }

    }
}