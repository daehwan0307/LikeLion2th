package study.day1007;

public class PopulationMove {
    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    private int fromSido;
    private int toSido;

    public PopulationMove(int fromSido,int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }


}
