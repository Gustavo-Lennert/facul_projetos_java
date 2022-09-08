//Importação de biblioteca para scanear dados
import java.util.Scanner;

//Criação da classe main
public class atividade1 {
    public static void main(String[] args){

        //Instância do objeto para receber os dados
        Scanner recebe = new Scanner(System.in);

        //Criação das variáveis
        int nota1, nota2, nota3;
        double media;
        
        //Comando de apresentação de informações (printar)
        System.out.println("Informe a primeira nota: ");
        //Recepção de dados digitados
        nota1 = recebe.nextInt();
        
        System.out.println("Informe a segunda nota: ");
        nota2 = recebe.nextInt();
        
        System.out.println("Informe a terceira nota: ");
        nota3 = recebe.nextInt();
        
        //Calculo e atribuição
        media =  (nota1 + nota2 + nota3) / 3 ;
        
        System.out.printf("A media é: %.2f \n\n", media);
        

        //Estrutura de condição
        if(media >= 6){
            System.out.println("Aluno aprovado!");
        }
        if(media <=5){
            System.out.println("Aluno reprovado!");
        }
    }
}