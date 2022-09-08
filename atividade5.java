import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args){

        Scanner recebe = new Scanner(System.in);

        //Criação das variáveis
        double salary, newSalary, reaj; 

        //Apresentação do programa
        System.out.println("\nEste programa executa o calculo de um salário com reajuste\n");

        //Recepção do dado a ser calculado
        System.out.println("Insira o valor do salário: ");
        salary = recebe.nextInt();

        System.out.println("\nInsira o valor do reajuste: ");
        reaj = recebe.nextInt();

        reaj = reaj / 100;
        newSalary =  (salary * reaj) + salary;

        System.out.printf("Salário reajustado: %.2f", newSalary);
     
    }
}
