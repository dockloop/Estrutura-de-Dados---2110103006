public class Main {
    public static void main(String[] args){
        Lista l = new LDE();

        aluno newaluno = new aluno("Marcos",15, 1.2);
        l.insereInicio(newaluno);
        l.insereFim(new aluno("Maria Julia", 20, 10));
        l.busca("Maria Julia");
        System.out.println(l.estahVazia());
        l.listarant();
        l.remove("Maria Julia");
        l.listarprox();
    }
}