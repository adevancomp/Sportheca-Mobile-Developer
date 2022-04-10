package notipos;

public class No<T> {
    /* Utilizando o conceito de generics em Java */
    private T conteudo;
    private No<T> proximo;

    public No(T conteudo) {
        this.proximo=null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No<T> proximo) {
        this.conteudo = conteudo;
        this.proximo = proximo;
    }

    public No(){
        this.proximo=null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return conteudo.toString();
    }
}
