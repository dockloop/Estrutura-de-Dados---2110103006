public class Pilha implements IPilha{
    private String[] pilha;
    private int eNum;

    public Pilha(int tamanhoVet){
        this.pilha = new String[tamanhoVet];
        this.eNum = 0;
    }

    public boolean Push(String info){
        if(this.eNum == pilha.length){
            System.out.println("Stackoverflow!");
            return false;
        }
        this.pilha[this.eNum] = info;

        this.eNum ++;
        return true;
    }

    public boolean isEmpty(){
        if(eNum == 0)
            return true;
        return false;
    }


    public String pop(){
        String o = null;
        if(this.isEmpty()){
            System.out.println("Pilha vazia!");
            return null;
        }
        o = this.pilha[eNum -1 ];
        this.pilha[eNum - 1] = null;
        this.eNum --;
        return o;
    }

    public int size(){
        return eNum;
    }

    public boolean top(){
        System.out.println(pilha[eNum - 1]);
        return true;
    }


}
