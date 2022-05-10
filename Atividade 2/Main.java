public class Main {
    public static void main(String[] args){
        vetor vetAluno = new vetor();
        aluno a1 = new aluno("Maria", 17, 10.0);
        aluno a2 = new aluno("Marcos", 19, 10.0);

        vetAluno.adiciona(a1);
        vetAluno.adiciona(a2);
        System.out.println(vetAluno.contem(a2));
        System.out.println(vetAluno.tamanho());
    }
}
