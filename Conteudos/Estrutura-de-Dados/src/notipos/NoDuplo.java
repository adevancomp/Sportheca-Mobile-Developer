package notipos;

public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> anterior;
    private NoDuplo<T> posterior;

    public NoDuplo(T conteudo) {
        this.anterior=null;
        this.posterior=null;
        this.conteudo = conteudo;
    }

    public NoDuplo() {
        this.anterior=null;
        this.posterior=null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    public NoDuplo<T> getPosterior() {
        return posterior;
    }

    public void setPosterior(NoDuplo<T> posterior) {
        this.posterior = posterior;
    }

    @Override
    public String toString() {
        return " <-- ["+this.conteudo.toString()+"] --> ";
    }
}
