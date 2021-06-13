import java.awt.Color;

public class Napoje extends Towary {
    private int dniwaznosci;
    private String czygaz;
    private String czyplastik;

    public Napoje(int x1, int y1, int szerokosc, int wysokosc, int id, String nazwa, int cena, int waga, int dniwaznosci, String czygaz, String czyplastik, Color kolor) {
        super(x1, y1, szerokosc, wysokosc, id, nazwa, cena, waga, kolor);
        this.dniwaznosci = dniwaznosci;
        this.czygaz = czygaz;
        this.czyplastik = czyplastik;
    }
}
