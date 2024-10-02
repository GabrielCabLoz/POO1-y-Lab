
public class Punto {
    
    private int X, Y;

    public Punto() {
        
    }

    public Punto(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public double getDistancia(Punto otroPunto) {
        int diferenciaX = otroPunto.getX() - this.X;
        int diferenciaY = otroPunto.getY() - this.Y;

        return Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY);
    }

    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }

}
