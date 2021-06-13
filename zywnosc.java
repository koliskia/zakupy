import java.awt.Color;

public class zywnosc extends towary {
    private int dniwaznosci;
    private String krajpoch;

    public zywnosc(int x1, int y1, int szerokosc, int wysokosc, int id, String nazwa, int cena, int waga, int dniwaznosci, String krajpoch, Color kolor) {
        super(x1, y1, szerokosc, wysokosc, id, nazwa, cena, waga, kolor);
        this.dniwaznosci = dniwaznosci;
        this.krajpoch = krajpoch;
    }
}