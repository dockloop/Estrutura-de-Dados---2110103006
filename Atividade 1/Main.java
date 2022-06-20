public class Main {
    public static void main(String[] args) {
        PlanoCartesiano plano = new PlanoCartesiano(12, 7);
        PlanoCartesiano plano2 = new PlanoCartesiano(10, 5);

        //System.out.println(" "  +plano.getX());

        
    System.out.printf("Distancia: %.2f m", plano.distanciaEucli(plano2));
    }
}