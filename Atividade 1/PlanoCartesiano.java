public class PlanoCartesiano {
    private double x;
    private double y;

    public PlanoCartesiano (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanciaEucli(PlanoCartesiano p){
        return Math.sqrt(Math.pow((p.x - this.x), 2) + 
        Math.pow((p.y - this.y), 2));
    }
    
}
