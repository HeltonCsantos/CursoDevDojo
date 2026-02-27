package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;

        //operador ternario (coondição) ? verdadeiro : falso;
        String resutado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Eu ainda não tenho condições";
        System.out.println(resutado);
    }
}
