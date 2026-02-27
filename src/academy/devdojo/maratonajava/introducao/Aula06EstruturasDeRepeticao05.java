package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        //condição valorParcela >= 1000;

        double valorTotal = 50000;
        double valorPacela;

        for(int parcela = (int)valorTotal; parcela >= 1; parcela--){
            valorPacela = valorTotal / parcela;

            if(valorPacela < 1000){
                continue;
            }

            System.out.println("Parcela " + parcela + " R$ " + valorPacela);
        }
    }
}
