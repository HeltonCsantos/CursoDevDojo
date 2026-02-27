package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float, e double   0
        // char 'u\oooo' ' '
        //boolean false
        //String null

        String[] nomes = new String[3];
        nomes[0] = "Helton";
        nomes[1] = "Juciele";
        nomes[2] = "Luciana";

        for (int i = 0; i < nomes.length; i++){
            System.out.print(nomes[i] + " ");
        }
    }
}
