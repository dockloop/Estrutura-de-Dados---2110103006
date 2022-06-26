public class Main {
    public static void main(String[] args){
        IFila fila = new Fila(5);

        System.out.println(fila.isEmpty());
        fila.add(new Aluno("Marcos", 2110103006));
        System.out.println(fila.isEmpty());
        fila.add(new Aluno("Maria", 2034523145));
        fila.remove();
        fila.print();
    }
}
