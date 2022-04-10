package estruturas.pilha;

import notipos.No;

public class Pilha<T> {
    /**
     * FIFO : First in, First out. Primeiro a entrar, primeiro a sair.
     */
    private No<T> refNo;

    public Pilha() {
        this.refNo=null;
    }

    public void push(T conteudo){
        No<T> no = new No<>(conteudo);
        No<T> antigoRefNo=this.refNo;
        this.refNo=no;
        this.refNo.setProximo(antigoRefNo);
    }

    public T pop(){
        if(!this.isEmpty()){
            No<T> no = this.refNo;
            this.refNo=this.refNo.getProximo();
            return no.getConteudo();
        }
        return null;
    }

    public T top(){
        return this.refNo.getConteudo();
    }

    public boolean isEmpty(){
        return this.refNo == null;
    }

    @Override
    public String toString() {
        String st = "---  Pilha ---";
        No<T> aux = this.refNo;
        if(!this.isEmpty()){
            while(aux!=null){
                st+="\n["+aux.getConteudo().toString()+"]\n  |\n  o";
                aux=aux.getProximo();
            }
        }
        st+="\nnull";
        st+="\n---  Pilha ---\n";

        return st;
    }
}
