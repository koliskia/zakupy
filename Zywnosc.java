import java.awt.Color;

public class Zywnosc extends Towary {
    private int dniwaznosci;
    private String krajpoch;

    public Zywnosc(int x1, int y1, int szerokosc, int wysokosc, int id, String nazwa, int cena, int waga, int dniwaznosci, String krajpoch, Color kolor) {
        super(x1, y1, szerokosc, wysokosc, id, nazwa, cena, waga, kolor);
        this.dniwaznosci = dniwaznosci;
        this.krajpoch = krajpoch;
    }
}