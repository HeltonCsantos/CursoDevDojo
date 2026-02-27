package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;
    private String estudio;

    //construtor
    public Anime(String nome, String tipo, int epsodios, String genero){  //força a seguir regras
        this();
        this.nome = nome;  //obriga a passar um nome para rodar
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;
    }

    //sobrecarga de construtores
    public Anime(String nome, String tipo, int epsodios, String genero, String estudio){
        this(nome, tipo, epsodios, genero);  // deve ser obrigatoriamente a primeira linha
        this.estudio = estudio;
    }

    //sobrecarga de construtores
    public Anime(){
        System.out.println("Dentro do contrutor sem argumentos");
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
        System.out.println("\n");
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpsodios(int epsodios){
        this.epsodios = epsodios;
    }

    public int getEpsodios(){
        return this.epsodios;
    }
}






