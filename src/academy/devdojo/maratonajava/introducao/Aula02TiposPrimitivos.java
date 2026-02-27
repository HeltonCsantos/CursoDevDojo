package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'H';
        String nome = "Helton César";
        System.out.println("a idade é " + idade + " anos.");
        System.out.println(falso);

        int numero = (int)100000000000L; //casting força o numero a caber em um tipo de tamanho menor(incompativel)
        System.out.println(numero);
        System.out.println("Oi meu nome é " + nome);
    }
}
