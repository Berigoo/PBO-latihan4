public class Kubus {
    private double Volume;
    private double Luas;
    public Kubus(float S){
        Volume = Math.pow(S, 3);
        Luas = 6 * Math.pow(S, 2);
    }
    public double getLuas () {
        return Luas;
    }
    public double getVolume () {
        return Volume;
    }
}
