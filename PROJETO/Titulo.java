package PROJETO;
public class Titulo {
    private String nome;
    private int duracaoEmMinutos;
    private int numeroDeVisualisacoes;
    private int anoDeLancamento;

    public Titulo(String nome, int duracao,  int ano){
        this.nome = nome;
        this.duracaoEmMinutos = duracao;
        this.anoDeLancamento = ano;

    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public int getNumeroDeVisualisacoes(){
        return numeroDeVisualisacoes;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void visualizar(){
        this.numeroDeVisualisacoes += 1;
    }

    @Override
    public String toString(){
        return "("+this.nome+", "+this.duracaoEmMinutos+" min"+"("+this.duracaoEmMinutos+")"+")";
    }
}

