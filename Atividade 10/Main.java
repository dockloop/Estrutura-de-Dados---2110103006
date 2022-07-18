public class Main {
    public static void main(String[] args){
        IFila fila = new Fila(6);

       // System.out.println(fila.isEmpty());
        fila.add(55);
       // System.out.println(fila.isEmpty());
        fila.add(8);
        fila.add(new Aluno("Marcos", 12345));
        fila.add(29);
        fila.add(30);
        //fila.remove();
        fila.print();
    }
}
