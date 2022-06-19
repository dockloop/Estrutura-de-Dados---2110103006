public class Noh{
    private aluno info;
    private Noh prox;
    private Noh ant;

    public Noh (aluno info){
        this.info = info;
        this.prox = null;
        this.ant = null;
    }

    

    /**
     * @return int return the info
     */
    public aluno getInfo() {
        return info;
    }

    /**
     * @return Noh return the prox
     */
    public Noh getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(Noh prox) {
        this.prox = prox;
    }

    public Noh getAnt (){
        return ant;
    }

    public void setAnt(Noh ant){
        this.ant = ant;
    }

    
}