package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("\nDigite sua idade: ");
        int idade = entrada.nextInt();
        System.out.print("\nDigite M ou F para sue sexo: ");
        char sexo = entrada.next().charAt(0);
        System.out.println("------------------------------");
        System.out.print("\nNome: " + nome);
        System.out.print("\nIdade: " + idade);
        System.out.print("\nSexo: " + sexo);

    }
}
