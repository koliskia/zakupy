import java.awt.Color;

/**
 * Klasa przechowujaca napoje
 */
public class Napoje extends Towary {
    private int dniwaznosci;
    private String czygaz;
    private String czyplastik;

    /**
     * Tworzenie obiektow klasy napoje
     *
     * @param x1          wspolrzedna x
     * @param y1          wspolrzedna y
     * @param szerokosc   szerokosc graficznego obiektu
     * @param wysokosc    wysokosc graficznego obiektu
     * @param id          id obiektu
     * @param nazwa       nazwa obiektu
     * @param cena        cena obiektu
     * @param waga        waga obiektu
     * @param dniwaznosci dni waznosci obiektu
     * @param czygaz      czy gazowany obiekt
     * @param czyplastik  czy plastikowy obiekt
     * @param kolor       kolor graficznego przedstawienia obiektu
     */
    public Napoje(int x1, int y1, int szerokosc, int wysokosc, int id, String nazwa, int cena, int waga, int dniwaznosci, String czygaz, String czyplastik, Color kolor) {
        super(x1, y1, szerokosc, wysokosc, id, nazwa, cena, waga, kolor);
        this.dniwaznosci = dniwaznosci;
        this.czygaz = czygaz;
        this.czyplastik = czyplastik;
    }
}
