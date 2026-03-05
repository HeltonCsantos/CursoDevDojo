package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

import java.util.Scanner;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do gerente: ");
        String nomeGerente = sc.nextLine();
        System.out.print("Digite o salario do gerente: ");
        double salarioGerente = sc.nextDouble();

        Gerente gerente = new Gerente(nomeGerente, salarioGerente);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 10000);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
