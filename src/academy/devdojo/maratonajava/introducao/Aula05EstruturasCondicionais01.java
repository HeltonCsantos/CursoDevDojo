package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoCompraBebida = idade >= 18;
        if (isAutorizadoCompraBebida) {
            System.out.println("Altorizado a comprar Bedida alcolica");
        }
        //!
        if(!isAutorizadoCompraBebida){
            System.out.println("Não altorizado a comprar bebida alcolica");
        }

        //Maneira com else
        if (isAutorizadoCompraBebida) {
            System.out.println("Altorizado a comprar Bedida alcolica");
        }else {
            System.out.println("Não altorizado a comprar bebida alcolica");
        }

    }
}
