public interface Lista{
    public void insereInicio(int info);
    public void insereFim(int info);
    public boolean estahVazia();
    public boolean remove(int info);
    public Noh busca(int info);
    public int tamanho();
    public void listarprox();
    public void listarant();
    public int nroPares();
    public void add_ordenado(int info);
}