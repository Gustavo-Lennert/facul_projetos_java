//Importação de biblioteca para scanear dados
import java.util.Scanner;

//Criação da classe main
public class atividade2 {

    public static void main(String[] args){

        //Instância do objeto para receber os dados
        Scanner recebe = new Scanner(System.in);

        //Criação das variáveis
        float x, y;
  
        //Comando de apresentação de informações 
        System.out.println("\nEste codigo calcula em base da formula y(x)3x+2\n");

        //Recepção do dado a ser calculado
        System.out.println("Insira o valor de X: ");
        x = recebe.nextInt();

        //Calculo e atribuição
        y = (3 * x) + 2;

        //Apresentação do resultado
        System.out.printf("\ny(x) = %.2f", y);
    }
}
