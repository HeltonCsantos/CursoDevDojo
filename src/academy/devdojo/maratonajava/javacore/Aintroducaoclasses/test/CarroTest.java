package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fusca";
        carro1.modelo = "Sport";
        carro1.ano = 1987;

        Carro carro2 = new Carro();
        carro2.nome = "Gol";
        carro2.modelo = "Seleção";
        carro2.ano = 2014;

        carro1 = carro2;  // trocando a referência, o Carro 1 antigo ficara perdido na memoria

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
        System.out.println("\nCarro 2");
        System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
    }
}
