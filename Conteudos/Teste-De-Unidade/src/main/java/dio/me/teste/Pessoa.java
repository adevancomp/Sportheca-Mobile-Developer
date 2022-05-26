package dio.me.teste;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String pessoa;
    private LocalDate data_nasc;

    public Pessoa(String pessoa, LocalDate data_nasc) {
        this.pessoa = pessoa;
        this.data_nasc = data_nasc;
    }

    public Pessoa(){

    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public LocalDate getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }

    public int calculaIdade(){
        //estudar essa parte do código novamente
        return  (int) ChronoUnit.YEARS.between(this.data_nasc,LocalDate.now());
    }

    public boolean ehMaiorDeIdade(){
        return this.calculaIdade()>18;
    }

}
