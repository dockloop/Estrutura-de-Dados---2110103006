public class Main {
    public static void main(String[] args){
        Lista l = new LDE();
        l.insereInicio(120);
        l.insereFim(2);
        l.busca(20);
        System.out.println(l.estahVazia());
        l.listarant();
        l.remove(120);
        l.listarprox();
    }
}