package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 1;
        idades[1] = 2;
        idades[2] = 3;
        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}
