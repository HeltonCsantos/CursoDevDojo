package academy.devdojo.maratonajava.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
EU <nome>, morando no endereço <endereço>,
confirmo que recebi o sálario de <sálario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "helton César";
        String endereco = "JK, 315, centro, Paulistas, MG";
        double salario = 5500.00;
        String dataRecebimento = "20/12/2025";
        String relatorio = "Eu " + nome + " morando no endereço " + endereco + "Confirmo que recebi o sálario de " +
                salario + ", na data " + dataRecebimento;

        System.out.println(relatorio);
    }

}
