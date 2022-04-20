package dio.me.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Banco {
    private String nome;
    private List<IConta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void addConta(IConta novaConta){
        contas.add(novaConta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<IConta> getContas() {
        return contas;
    }

    public void setContas(List<IConta> contas) {
        this.contas = contas;
    }

    public String mostrarContas(){
        final String[] st = {"\n"};

        this.contas.forEach(it->{
            st[0] = st[0] +it.toString();
        });

        return st[0];
    }

}
