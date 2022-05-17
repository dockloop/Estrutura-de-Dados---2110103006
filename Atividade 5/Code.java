package LSE;

public class Code {
    public static void main(String[] args){
        Lista l = new LSE();
        aluno newaluno = new aluno("Marcos",15, 1.2);
        l.insereInicio(newaluno);
        System.out.println(l.estahVazia());
        l.imprime();
    }
}
