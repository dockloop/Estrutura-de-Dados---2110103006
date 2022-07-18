public class Noh{
    private Object info;
    private Noh prox;
    private Noh ant;

    public Noh (Object info){
        this.info = info;
        this.prox = null;
        this.ant = null;
    }

    

    /**
     * @return int return the info
     */
    public Object getInfo() {
        return info;
    }

    /**
     * @return Noh return the prox
     */
    public Noh getProx() {
        return prox;
    }

    public Object getInfoA(){
        return info;
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
