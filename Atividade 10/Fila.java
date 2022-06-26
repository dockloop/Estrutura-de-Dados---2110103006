public class Fila implements IFila{
    private int nElem;
    private int inicio;
    private Object[] vetFila;
    private Aluno aluno;

    public Fila(int tamFila){
        this.nElem = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    public boolean add(Object info){
        if(this.nElem == vetFila.length){
            System.out.println("Fila esgotada, aguarde...");
            return false;
        }
        int fim = (this.inicio + this.nElem) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElem ++;
        return true;
    }

    public boolean isEmpty(){
        int verifica = (this.inicio + this.nElem) % this.vetFila.length;

        if(verifica == 0)
            return true;
        else
            return false;
    }

    public boolean remove(){
        if(this.isEmpty()){
            System.out.println("Fila vazia");
            return false;
        }

        this.inicio = (this.inicio + 1) % this.vetFila.length;
        nElem --;
        return true;
    }

    public int size(){
        return nElem;
    }


    public void print(){
        int fim = (this.inicio + this.nElem) % this.vetFila.length;

        for(int i = inicio; i >= fim; i++){
                System.out.println(aluno.getMatricula());
        }
    }

}
