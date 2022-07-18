public class Main {
    public static void main(String[] args){
        IPilha pilha = new Pilha(5);
        

        for(int i = 0; i < 5; i++){
            pilha.Push("Prometheus");
        }

        pilha.top();
    }
}
