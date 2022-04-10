package estruturas.lista.encadeada;

import notipos.No;

public class Lista<T>{
    public Integer size;
    public No<T> entrada;

    public Lista(){
        this.size=0;
        this.entrada=null;
    }

    public Lista(T conteudo){
        this.entrada=new No<>(conteudo);
        this.size=1;
    }
    public boolean isEmpty() {
        return this.entrada==null;
    }

    public Integer size() {
        return this.size;
    }

    public void add(T conteudo){
        No<T> no = new No<>(conteudo);
        if(this.isEmpty()){
            this.entrada=no;
        } else {
            No<T> aux = this.entrada;
            while(aux.getProximo()!=null){
                aux=aux.getProximo();
            }
            aux.setProximo(no);
        }
        this.size++;
    }

    public void add(T conteudo, int index) {

        No<T> no = new No<>(conteudo);
        if(!this.isEmpty()){
            if(index==0){
                no.setProximo(this.entrada);
                this.entrada=no;
            } else {
                No<T> noAnterior=getNo(index-1);
                no.setProximo(noAnterior.getProximo());
                noAnterior.setProximo(no);
            }
        } else {
            this.entrada=no;
        }
        this.size++;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }


    public T remove(int index) {
        //Posso estar eliminando o elemento de indice 0
        if(!this.isEmpty()){
            if(index==0){
                No<T> removido = this.entrada;
                this.entrada=this.entrada.getProximo();
                return removido.getConteudo();
            } else {
                No<T> noAnterior=getNo(index-1);
                noAnterior.setProximo(noAnterior.getProximo().getProximo());
            }
            this.size--;
        }
        return null;
    }

    private void validaIndice(int index){
        if((index>=this.size)||index<0){
            throw new IndexOutOfBoundsException("O índice "+index+" não existe na lista atualmente !");
        }
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> aux = this.entrada;
        for(int i=0;i<index;i++){
            aux=aux.getProximo();
        }
        return aux;
    }

    @Override
    public String toString() {
        String st = "--- Lista ---\n";

        for (int i=0;i<this.size();i++){
            st+="["+getNo(i).getConteudo().toString()+"] -->";
        }

        st+="null\n--- Lista ---";
        return st;
    }
}
