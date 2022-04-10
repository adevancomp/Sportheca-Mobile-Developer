package model;

public class Gato {
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


}
