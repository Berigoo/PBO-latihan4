// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String[] args) {
        Kubus kubus1 = new Kubus(3);
        Kubus kubus2 = new Kubus(5.2f);
        System.out.println("Kubus 1");
        System.out.println("Luas\t: " + kubus1.getLuas());
        System.out.println("Volume\t: " + kubus1.getVolume());
        System.out.println("\nKubus 2");
        System.out.println("Luas\t: " + kubus2.getLuas());
        System.out.println("Volume\t: " + kubus2.getVolume());

        Balok balok1 = new Balok(2, 4, 5);
        Balok balok2 = new Balok(4.2, 4, 6);
        System.out.println("\n\nBalok 1");
        System.out.println("Luas\t: " + balok1.getLuas());
        System.out.println("Volume\t: " + balok1.getVolume());
        System.out.println("\nBalok 2");
        System.out.println("Luas\t: " + balok2.getLuas());
        System.out.println("Volume\t: " + balok2.getVolume());
    }
}