package notipos;

public class NoArvore<T extends Comparable<T>> {
    //Todo objeto que entrar nesse nó é "comparável"
    private T conteudo;
    private NoArvore<T> noDir;
    private NoArvore<T> noEsq;

    public NoArvore(T conteudo) {
        this.noDir=null;
        this.noEsq=null;
        this.conteudo = conteudo;
    }

    public NoArvore() {
        this.noDir=null;
        this.noEsq=null;
    }


    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoArvore<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(NoArvore<T> noDir) {
        this.noDir = noDir;
    }

    public NoArvore<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(NoArvore<T> noEsq) {
        this.noEsq = noEsq;
    }

    @Override
    public String toString() {
        return conteudo.toString();
    }
}
