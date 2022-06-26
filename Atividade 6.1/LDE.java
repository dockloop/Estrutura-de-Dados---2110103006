public class LDE implements Lista{
    
    private Noh inicio;
    private Noh ultimo;
    private int totalNohs;

    public LDE(){
        this.inicio = null;
        this.ultimo = null;
    }

    public void insereInicio(int a){
        Noh novo = new Noh(a);
        if (inicio == null){
            inicio = novo;
            ultimo = novo;
        }else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
        totalNohs++;
    }
    public int nroPares(){
        int retorno = 0;
        //Noh retorno1 = null;
        for(Noh i = inicio; i != null; i = i.getProx()){
            if(i.getInfo()%2 == 0){
                System.out.println("Num: " +i.getInfo());
                retorno++;
            }
        }
        return retorno;
    }

    public void add_ordenado(int a){
        Noh novo = new Noh(a);
        if(inicio == null){
            inicio = novo;
            ultimo = novo;
        }else {
            for(novo = inicio; novo != null; novo = novo.getProx()){
                if(novo.getInfo() > a){
                    novo.setProx(inicio);
                    inicio.setAnt(novo);
                    inicio = novo;
                }
            }
        }
        
    }

    public void insereFim(int a) { 
        Noh novo = new Noh(a);
        if (ultimo == null){
            inicio = novo;
            ultimo = novo;
        } else {
            novo.setAnt(ultimo);
            ultimo.setProx(novo);
            ultimo = novo;
        }
    }

    public int tamanho(){
        return this.totalNohs;
    }

    
	public Noh busca(int a) {
		Noh retorno = null;
		for(Noh i = inicio; i != null; i = i.getProx()){
            if(i.getInfo() == a){
                retorno = i;
            }
        }
		return retorno;
	}


    public boolean remove(int a){
        Noh p = busca(a);
        if (p == null){
            return false;
        }if (p.getAnt() == null){
            inicio = p.getProx();
            if(inicio != null)
                inicio.setAnt(null);
        }else if (p.getProx() == null){ //info estah no fim
            p.getAnt().setProx(null);
            ultimo = p.getAnt();
        } else { //info estah no meio
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;
    }

    public boolean estahVazia(){
        if(inicio == null){
            return true;
        }
        return false;
    }

    public void listarprox() {
    	for(Noh i = inicio; i != null; i = i.getProx()) {
            System.out.println(i.getInfo());
    	}
    }

    public void listarant(){
        for(Noh i = ultimo; i != null; i = i.getAnt()){
            System.out.println(i.getInfo());
        }
    }
}