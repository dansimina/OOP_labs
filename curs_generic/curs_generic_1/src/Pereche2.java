public class Pereche2 <T extends Number>{
    private T first;
    private T second;

    public Pereche2(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pereche2{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
