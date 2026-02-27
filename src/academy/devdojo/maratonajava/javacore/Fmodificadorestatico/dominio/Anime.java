package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //bloco de inicialização
    static { //apos o static o bloco é inicializado apenas uma vez
        System.out.println("Dentro do bloco de inialização");
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inialização");
    }

    public Anime(String nome) {   // construtor com parametro String
        this.nome = nome;
    }

    public Anime() {  // construtor sem parametros
        for(int epsodio : Anime.episodios){
            System.out.print(epsodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
