

public class vetorotimo implements IVetor{
    
    private Object[] elementos = new Object[5];
    private int totalAlunos = 0;


    public int tamanho() {
        return this.totalAlunos;
    }

    public void adiciona(Object newelemento) {
        garanteEspaco();
        this.elementos[this.totalAlunos] = newelemento;
        this.totalAlunos++;
    }

    public boolean contem(Object newelemento){
        for(int i = 0; i < this.totalAlunos; i++){
            if (newelemento == this.elementos[i]){
            	return true;
            }
        }
        return false;
    }


    public boolean cheio(){
        if (totalAlunos == this.elementos.length){
            return true;
        }
        return false;
        }

    private void garanteEspaco(){
        if (this.cheio()){
            Object[] novosalunos = new Object[this.elementos.length * 2];
            for (int i=0; i < this.elementos.length; i++){
                novosalunos[i] = this.elementos[i];
                this.elementos = novosalunos;
            }
        }
    }

    public boolean remove(Object newelemento){
        int indice = -1;
    
        for(int i=0; i < totalAlunos; i++) //faz a busca
        if (newelemento == this.elementos[i]){
            indice = i; 
            break;
        }
        if (indice != -1){ //achou o elemento
            for(int i = indice; i < (elementos.length-1); i++){
                elementos[i] = elementos[i+1];
                totalAlunos--;
                return true;
            }
        }
        return false;
    }
    
    public void imprime() {
    	for(int i = 0; i < totalAlunos; i++) {
    		System.out.print(elementos[i] + "");
    	}
    }
    

}
