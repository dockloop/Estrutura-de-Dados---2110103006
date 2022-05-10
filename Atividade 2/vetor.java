public class vetor {
    private aluno alunos[] = new aluno[5];
    private int totalAlunos = 0;

    public void adiciona(aluno newalunos) {
        this.alunos[this.totalAlunos] = newalunos;
        this.totalAlunos++;
    }

    public int tamanho(){
        return this.totalAlunos;
    }

    public boolean contem(aluno newaluno){
        for(int i = 0; i < this.totalAlunos; i++) {
            if(newaluno == this.alunos[i]){
                return true;
            }
        }
        return false;
    }

    
}
