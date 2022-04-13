package model;

import java.util.Objects;

public class Gato implements Comparable<Gato>{
    private String cor;
    private Integer idade;

    public Gato(String cor, Integer idade) {
        this.cor = cor;
        this.idade = idade;
    }

    public Gato() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, idade);
    }

    @Override
    public int compareTo(Gato gato) {
        if(this.idade.compareTo(gato.idade)!=0){
            return this.idade.compareTo(gato.idade);
        }

        return this.cor.compareTo(gato.cor);
    }
}
