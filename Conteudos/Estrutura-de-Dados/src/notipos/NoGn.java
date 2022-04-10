package notipos;

public class NoGn {
    /**
     * Utilizando a classe Object do java lang
     * Todas as classes do Java são descendentes desta classe Object
     *
     * O grande problema deste tipo de No é que quando eu utilizar nas
     * minhas estruturas de dados, eu posso ter vários tipos diferentes,
     * pois todos são object
     * Isso pode causar problemas nos meus códigos.
     *
     */
    private Object conteudo;
    private NoGn proximo;

    public NoGn (){
        this.proximo=null;
    }

    public NoGn(Object conteudo) {
        this.proximo=null;
        this.conteudo = conteudo;
    }

    public Object getConteudo() {
        return conteudo;
    }

    public void setConteudo(Object conteudo) {
        this.conteudo = conteudo;
    }

    public NoGn getProximo() {
        return proximo;
    }

    public void setProximo(NoGn proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return conteudo.toString();
    }
}
