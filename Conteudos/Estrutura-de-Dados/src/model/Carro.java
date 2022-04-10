package model;

public class Carro {
    private String modelo;
    private Double consumoLitro;

    public Carro(String modelo, Double consumoLitro) {
        this.modelo = modelo;
        this.consumoLitro = consumoLitro;
    }

    public Carro() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getConsumoLitro() {
        return consumoLitro;
    }

    public void setConsumoLitro(Double consumoLitro) {
        this.consumoLitro = consumoLitro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", consumoLitro=" + consumoLitro +
                '}';
    }
}
