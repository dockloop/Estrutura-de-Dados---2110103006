public class Main {
    public static void main (String... args){
        IFila fila = new Fila();

        fila.add(01);
        fila.add("Olá");
        fila.add(22);
        fila.remove();
        System.out.println(fila.isEmpty());
        System.out.println(fila.size());
        fila.print();
    }
}
