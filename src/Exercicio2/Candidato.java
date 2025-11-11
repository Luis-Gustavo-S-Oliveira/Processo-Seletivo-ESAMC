package Exercicio2;

public class Candidato {
    private String nome;
    private int anosExperiencia;
    private int quantidadeProjeto;
    private boolean conheceSpring;

    public Candidato(String nome, int anosExperiencia, int quantidadeProjeto, boolean conheceSpring) {
        this.nome = nome;
        this.conheceSpring = conheceSpring;
        this.quantidadeProjeto = quantidadeProjeto;
        this.anosExperiencia = anosExperiencia;

    }

    public Candidato(String nome, int anosExperiencia, int quantidadeProjeto) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.quantidadeProjeto = quantidadeProjeto;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public boolean isConheceSpring() {
        return conheceSpring;
    }

    public void setConheceSpring(boolean conheceSpring) {
        this.conheceSpring = conheceSpring;
    }

    public int getQuantidadeProjeto() {
        return quantidadeProjeto;
    }

    public void setQuantidadeProjeto(int quantidadeProjeto) {
        this.quantidadeProjeto = quantidadeProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
