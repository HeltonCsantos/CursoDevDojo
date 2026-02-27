package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private int[] episodios;
    private String nome;

    //bloco de inicialização
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {   // construtor com parametro String
        this.nome = nome;
    }

    public Anime() {  // construtor sem parametros
        for(int epsodio : this.episodios){
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
