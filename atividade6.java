import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args){

        Scanner recebe = new Scanner(System.in);

        double qtd, ingresso, custo;

        System.out.println("\nEste programa calcula quantos ingressos precisam ser vendidos para cobrir um custo total x\n");

        System.out.println("Insira o valor do ingresso: ");
        ingresso = recebe.nextInt();

        System.out.println("\nInsira o valor de custos total: ");
        custo = recebe.nextInt();

        qtd = custo / ingresso;

        System.out.printf("A quatidade de ingressos que devem ser vendidos é: %.2f", qtd);
    }
}
