package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        //condição valorParcela >= 1000;

        double valorTotal = 50000;
        double valorPacela;

        for(int parcela = 1; parcela <= valorTotal; parcela++){
            valorPacela = valorTotal / parcela;

            if(valorPacela < 1000){
                break; // usado para interroper, se não o FOR rodaria 50000 VEZES
            }
            System.out.println("Parcela " + parcela + " R$ " + valorPacela);
        }
    }
}
