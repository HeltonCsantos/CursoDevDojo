package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Helton");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[]{1500.00, 5000.00, 1200.00});

        funcionario.imprime();
        System.out.println("Média: " + funcionario.getMedia());

    }
}
