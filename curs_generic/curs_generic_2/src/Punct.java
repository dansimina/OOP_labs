public class Punct<T extends Number> {
    T x;
    T y;

    public Punct(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punct{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public <T extends Number> double distanta(Punct<T> p) {
        return Math.sqrt(Math.pow(this.x.doubleValue() - p.getX().doubleValue(), 2) + Math.pow(this.y.doubleValue() - p.getY().doubleValue(), 2));
    }
}
