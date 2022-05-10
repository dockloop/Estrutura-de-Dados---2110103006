public class Main {
    public static void main(String[] args){
        vetor vetAluno = new vetor();
        aluno a1 = new aluno("Maria", 17, 10.0);
        aluno a2 = new aluno("Marcos", 19, 10.0);

        vetAluno.adiciona(a1);
        vetAluno.adiciona(a2);
        vetAluno.adiciona(new aluno("Peixe", 20, 5.09));
        vetAluno.adiciona(new aluno("Renato", 15, 5.09));
        vetAluno.adiciona(new aluno("Lucas", 3, 5.09));
        vetAluno.adiciona(new aluno("Fernando", 55, 52.67));

        System.out.println(vetAluno.contem(a1));
        //System.out.println(vetAluno.tamanho());
        vetAluno.remove(a1);
        System.out.println(vetAluno.contem(a1));
        System.out.println(vetAluno.tamanho());
        
    }
}
