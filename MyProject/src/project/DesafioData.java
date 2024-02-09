package project;

import java.util.Scanner;

public class DesafioData {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        boolean dataValida = false;

        while (!dataValida) {
            System.out.println("Digite um dia: ");
            int diaValido = enter.nextInt();

            System.out.println("Digite um mês: ");
            int mesValido = enter.nextInt();

            System.out.println("Digite um ano: ");
            int anoValido = enter.nextInt();

            Desafio d1 = new Desafio();

            d1.dia = diaValido;
            d1.mes = mesValido;
            d1.ano = anoValido;

            // Check if day and month are within valid ranges
            if ((d1.dia >= 1 && d1.dia <= 31) && (d1.mes >= 1 && d1.mes <= 12)) {
                dataValida = true;
                System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
            } else {
                System.out.println("Data Inválida. Por favor, digite novamente!");
            }
        }

        enter.close();
    }
}