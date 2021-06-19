import java.awt.Color;

/**
 * klasa przechowujaca ubrania
 */
public class Ubrania extends Towary {
    private String rozmiar;

    /**
     * Tworzenie obiektow klasy ubrania
     *
     * @param x1        wspolrzedna x
     * @param y1        wspolrzedna y
     * @param szerokosc szerokosc graficznego obiektu
     * @param wysokosc  wysokosc graficznego obiektu
     * @param id        id obiektu
     * @param nazwa     nazwa obiektu
     * @param cena      cena obiektu
     * @param waga      waga obiektu
     * @param rozmiar   rozmiar obiektu
     * @param kolor     kolor graficznego przedstawienia obiektu
     */
    public Ubrania(int x1, int y1, int szerokosc, int wysokosc, int id, String nazwa, int cena, int waga, String rozmiar, Color kolor) {
        super(x1, y1, szerokosc, wysokosc, id, nazwa, cena, waga, kolor);
        this.rozmiar = rozmiar;
    }
}
