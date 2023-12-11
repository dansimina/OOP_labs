public class PerecheInt {
    private int first;
    private int second;

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public PerecheInt(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "PerecheInt{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
