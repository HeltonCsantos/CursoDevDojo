package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua JK");
        endereco.setCep("39765000");

        Pessoa pessoa = new Pessoa("helton");
        pessoa.setCpf("13911193645");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("------------------------------");

        Funcionario funcionario = new Funcionario("Maria");

        funcionario.setCpf("123456788990");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();

    }
}
