import java.util.Scanner;

public class atividade7{
    public static void main(String[] args){

        Scanner recebe = new Scanner(System.in);

        int gato1, gato2, pesoKg, pesoG, total, resto;

        System.out.println("\nEste programa calcula a quantidade de ração em gramas consumida por dois gatos após 5 dias de consumo\n");

        System.out.println("Insira quantos Kg tem saco de ração: ");
        pesoKg = recebe.nextInt();

        pesoG = pesoKg * 1000;

        System.out.println("Insira o consumo diário do primeiro gato: ");
        gato1 = recebe.nextInt();

        System.out.println("Insira o consumo diário do segundo gato: ");
        gato2 = recebe.nextInt();

        total = 5 * (gato1 + gato2);

        resto = pesoG - total;
        resto = resto / 1000; 
        
        System.out.printf("A quantidade restante de ração no saco após 5 dias será de: %dKg", resto);

    }
}
