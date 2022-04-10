package estruturas.lista.duplamente;

import notipos.NoDuplo;

public class ListaDupla<T>{
    private Integer size;
    private NoDuplo<T> primeiro;
    private NoDuplo<T> ultimo;

    public ListaDupla() {
        this.primeiro=null;
        this.ultimo=null;
        this.size = 0;
    }

    public ListaDupla(T primeiro, T ultimo) {
        this.primeiro = new NoDuplo<>(primeiro);
        this.ultimo = new NoDuplo<>(ultimo);
        this.ultimo.setAnterior(this.primeiro);
        this.primeiro.setPosterior(this.ultimo);
        this.size=2;
    }

    public Integer size(){
        return this.size;
    }

    private NoDuplo<T> getNo(Integer index){
        NoDuplo<T> aux = this.primeiro;
        for(Integer i = 0; (i<index)&&(aux!=null);i++){
            aux=aux.getPosterior();
        }
        return aux;
    }

    public T get(Integer index){
        return this.getNo(index).getConteudo();
    }

    public void add(T conteudo){
        NoDuplo<T> no = new NoDuplo<>(conteudo);
        no.setAnterior(this.ultimo);
        if(this.primeiro==null){
            this.primeiro=no;
        }
        if(this.ultimo!=null){
            this.ultimo.setPosterior(no);
        }
        this.ultimo=no;
        this.size++;
    }

    public void add(Integer index,T conteudo){
        NoDuplo<T> aux = getNo(index);
        NoDuplo<T> no = new NoDuplo<>(conteudo);
        no.setPosterior(aux);
        if(no.getPosterior()!=null){
            no.setAnterior(aux.getAnterior());
            no.getPosterior().setAnterior(no);
        } else {
            no.setAnterior(this.ultimo);
            this.ultimo=no;
        }

        if(index == 0){
            this.primeiro=no;
        } else {
            no.getAnterior().setPosterior(no);
        }

        this.size++;

    }

    public void remove(Integer index){
        if(index==0){
            this.primeiro=this.primeiro.getPosterior();
            if(this.primeiro!=null){
                this.primeiro.setAnterior(null);
            }
        } else {
            NoDuplo<T> aux = getNo(index);
            aux.getAnterior().setPosterior(aux.getPosterior());
            if(aux!=this.ultimo){
                aux.getPosterior().setAnterior(aux.getAnterior());
            } else {
                this.ultimo=aux;
            }
        }
        this.size--;
    }

    @Override
    public String toString() {
        String st = "--- Lista Duplamente Encadeada ---\nnull";

        NoDuplo<T> aux = this.primeiro;
        for(int i=0;i<this.size;i++){
            st+=aux;
            aux=aux.getPosterior();
        }

        st+="null\n--- Lista Duplamente Encadeada ---";
        return st;
    }
}
