
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;


//Criação da classe main
public class atividade3 {
    public static void main(String[] args){

        //Instância do objeto para receber os dados
        Scanner recebe = new Scanner(System.in);

        //Criação das variáveis
        double salary, newSalary; 

        //Apresentação do programa
        System.out.println("\nEste programa executa o calculo de um salário com reajuste de 15%\n");

        //Recepção do dado a ser calculado
        System.out.println("\nInsira o valor do salário: ");

        salary = recebe.nextInt();

        newSalary =  (salary * 0.15) + salary;

        System.out.printf("Salário reajustado: %.2f", newSalary);
        
    }
}
