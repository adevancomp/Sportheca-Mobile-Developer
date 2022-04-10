package estruturas.lista.circular;

import notipos.No;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private Integer tamanho;

    public ListaCircular(){
        this.cauda=null;
        this.cabeca=null;
        this.tamanho=0;
    }

    public boolean isEmpty(){
        return this.tamanho==0;
    }

    public void remove(int index){
        if(index>=this.tamanho){
            throw  new IndexOutOfBoundsException("Este índice não exista na lsita !");
        }
        No<T> aux = this.cauda;
        if(index==0){
            this.cauda=this.cauda.getProximo();
            this.cabeca.setProximo(this.cauda);
        } else if(index == 1){
            this.cauda.setProximo(this.cauda.getProximo().getProximo());
        } else{
            for(int i=0;i<index-1;i++){
                aux=aux.getProximo();
            }
            aux.setProximo(aux.getProximo().getProximo());
        }
        this.tamanho--;
    }

    public void add(T conteudo){
        No<T> no = new No<>(conteudo);
        if(this.isEmpty()){
            this.cabeca=no;
            this.cauda=no;

            this.cabeca.setProximo(cauda);
        } else {
            no.setProximo(this.cauda);
            this.cabeca.setProximo(no);
            this.cauda=no;
        }
        this.tamanho++;
    }

    public Integer size(){
        return this.tamanho;
    }

    private No<T> getNo(Integer index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("A lista está vazia");
        }
        if(index == 0 ){
            return this.cauda;
        }
        No<T> aux = this.cauda;
        for(int i=0;(i<index)&&(aux!=null);i++){
            aux=aux.getProximo();
        }
        return aux;
    }


    public T get(Integer index){
        return this.getNo(index).getConteudo();
    }

    @Override
    public String toString() {
        String st ="--- Lista Circular ---\n";

        No<T> aux = this.cauda;
        for(int i=0;i<this.size();i++){
            st+="["+aux.toString()+"]";
            aux=aux.getProximo();
        }
        st+= this.tamanho != 0 ? "(Retorna ao início)" : "[]";
        st+="\n--- Lista CIrcular ---";
        return st;
    }
}
