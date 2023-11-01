public class Balok {
    private double Volume;
    private double Luas;
    public Balok(double P, double L, double T){
        Volume = P * L * T;
        Luas = 2 * ((P * L) + (P * T) + (L * T));
    }
    public double getVolume () {
        return Volume;
    }
    public double getLuas () {
        return Luas;
    }
}
