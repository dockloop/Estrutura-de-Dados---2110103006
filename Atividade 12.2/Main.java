public class Main{
    public static void main(String... args){
    IFila f = new Fila();
    IPilha p = new Pilha();

    Aluno x = new Aluno("João");
    Aluno j = new Aluno("Pedro");

    f.add(x);

    f.add(j);

    if(f.size() > 0){
        Object o[] = f.getFila();
        int tamanho = f.size();

        for (int i = 0;i < tamanho; i++) {
            p.push(o[i]);
            f.remove();
        }
        for (int i = 0;i < tamanho; i++) {
            f.add(p.pop());
        }
        
    }
    f.print();
}
}