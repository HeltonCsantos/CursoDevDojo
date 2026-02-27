package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++){
            if (i > 25){
                break; // devge estar dentro de um shitch ou loop
            }
            System.out.println(i);
        }
    }
}
