public interface Lista{
    public void insereInicio(aluno info);
    public void insereFim(aluno info);
    public boolean estahVazia();
    public boolean remove(String info);
    public Noh busca(String info);
    public int tamanho();
    public void listarprox();
    public void listarant();
}