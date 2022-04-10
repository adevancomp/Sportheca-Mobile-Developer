package estruturas.fila;

import notipos.No;
import notipos.NoGn;

public class Fila<T> {
    /**
     * FIFO : First in, First out.
     */
    private No<T> refNo;//este é o nó no final da fila
    public Fila(){
        this.refNo=null;
    }

    public void enqueue(T object){
        No<T> no = new No<>(object);
        no.setProximo(this.refNo);
        this.refNo=no;
    }

    public T first(){
        if(!this.isEmpty()){
            No<T> aux = this.refNo;
            while(aux.getProximo()!=null){
                    aux=aux.getProximo();
                }
            return aux.getConteudo();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            No<T> aux = this.refNo;

            if(aux.getProximo()==null){
                //estou eliminando o único elemento, o primeiro.
                this.refNo=null;
                return aux.getConteudo();
            }
            No<T> atual=aux;
            aux=atual.getProximo();
            // A lógica é percorrer a fila até encontrar o penúltimo elemento,
            // realizando o setProximo dele para null
            while(atual.getProximo()!=null){
                aux=atual;
                atual=atual.getProximo();
            }
            aux.setProximo(null);
            return atual.getConteudo();
        }
        return null;
    }

    public boolean isEmpty(){
        return this.refNo == null;
    }

    @Override
    public String toString() {
        String st="---  Fila ---\n";
        No<T> auxNo=this.refNo;
        if(!this.isEmpty()){
            while(auxNo!=null){
                st+="["+auxNo.getConteudo().toString()+"] -->  ";
                auxNo=auxNo.getProximo();
            }

        }
        st+="null";
        st+="\n---  Fila ---";
        return st;
    }
}
