public class vetor implements IVetor{
    private aluno alunos[] = new aluno[5];
    private int totalAlunos = 0;

    public void adiciona(aluno newalunos) {
        this.garanteespaco();
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

    public boolean cheio(){
        if (totalAlunos == this.alunos.length){
            return true;
        }
        return false;
    }

    private void garanteespaco(){
        if (this.cheio()){
            aluno novosAlunos[] = new aluno[this.alunos.length * 2];
            for(int i = 0; i < this.alunos.length; i++){
                novosAlunos[i] = this.alunos[i];
            }
            this.alunos = novosAlunos;
        }
    }

    public boolean remove(aluno newaluno){
        int indice = -1;
        for(int i = 0; i < totalAlunos; i++){ //faz a busca
            if (newaluno == this.alunos[i]){  
                indice = i; 
                break; 
            }
        }
        if (indice != -1){ //achou o elemento
            for(int i = indice; i < (alunos.length-1); i++){
                alunos[i] = alunos[i+1];
            }
        totalAlunos--;
        return true;
        }
        return false;
    }

    
}
