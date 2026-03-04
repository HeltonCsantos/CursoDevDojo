package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {      // para definir que essa classe não pde ser extendida, adicionamos o ( final )

    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;   //(final)constante   (uma vez que definida deve obrigatoriamente inicializa-la)
    public final Comprador COMPRADOR = new Comprador();  //objeto final

    public final void imprime(){      //Adicinando final no metodo ele não vai poder ser sobrescrito
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
