import java.awt.Color;

/**
 * Klasa przechowuja zywnosc
 */
public class Zywnosc extends Towary {
    private int dniwaznosci;
    private String krajpoch;

    /**
     * Tworzenie obiektu klasy zywnosc
     *
     * @param x1          wspolrzedna x
     * @param y1          wspolrzedna y
     * @param szerokosc   szerokosc graficznego obiektu
     * @param wysokosc    wysokosc graficznego obiektu
     * @param id          id obiektu
     * @param nazwa       nazwa obiektu
     * @param cena        cena obiektu
     * @param waga        waga obiektu
     * @param dniwaznosci dniwaznosci obiektu
     * @param krajpoch    kraj pochodzenia obiektu
     * @param kolor       kolor graficznego przedstawienia obiektu
     */
    public Zywnosc(int x1, int y1, int szerokosc, int wysokosc, int id, String nazwa, int cena, int waga, int dniwaznosci, String krajpoch, Color kolor) {
        super(x1, y1, szerokosc, wysokosc, id, nazwa, cena, waga, kolor);
        this.dniwaznosci = dniwaznosci;
        this.krajpoch = krajpoch;
    }
}