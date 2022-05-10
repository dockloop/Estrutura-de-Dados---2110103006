public class Main {
    public static void main(String[] args) {
        IVetor vetAluno = new vetorotimo();
       
        aluno Teste = new aluno("Marcos", 15, 5.0);
        vetAluno.adiciona(Teste);
        vetAluno.remove(Teste);
        vetAluno.tamanho();
        vetAluno.cheio();
        System.out.println(vetAluno.contem(Teste));
        vetAluno.imprime();

    }
}
