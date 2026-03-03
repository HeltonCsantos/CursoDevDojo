package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estatico de funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do contrutor de funcionario");
    }

    public void imprime(){  // sobreescrevendo metodo imprime de pessoa para imprimir o salario
        super .imprime();       // se refere ao objeto mais generico
        System.out.println(this.salario);

    }

    public void relatorioPagamento(){
        System.out.println("EU " + this.nome + "recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
