//Importação de biblioteca para scanear dados
import java.util.Scanner;

//Criação da classe main
public class atividade4 {
    public static void main(String[] args){

        //Instância do objeto para receber os dados
        Scanner recebe = new Scanner(System.in);

        //Criação das variáveis
        int idade, idadeh, nasc, atual;

        System.out.println("\nEste programa calcula a idade de uma pessoa baseada no ano atual, e quanto terá em 2040\n");

        System.out.println("Insira seu ano de nscimento: ");
        nasc = recebe.nextInt();

        System.out.println("Insira o ano atual: ");
        atual = recebe.nextInt();

        idadeh = atual - nasc;
        idade = 2040 - nasc;

        System.out.printf("\nSua idade atual é %d anos, e sua idade em 2040 será %d anos\n", idadeh,idade);
    }
}
