import java.awt.Color;

/**
 * Klasa przechowujaca obiekty towary
 */
public class Towary {
    private int id;
    private String nazwa;
    private int cena;
    private int waga;
    private Color kolor;
    int x1, y1, szerokosc, wysokosc;

    /**
     * Tworzenie obiektów klasy towary
     *
     * @param x1        wspolrzedna x
     * @param y1        wspolrzedna y
     * @param szerokosc szerokosc graficznego obiektu
     * @param wysokosc  wysokosc graficznego obiektu
     * @param id        id obiektu
     * @param nazwa     nazwa obiektu
     * @param cena      cena obiektu
     * @param waga      waga obiektu
     * @param kolor     kolor graficznego przedstawienia obiektu
     */
    public Towary(int x1, int y1, int szerokosc, int wysokosc, int id, String nazwa, int cena, int waga, Color kolor) {
        this.x1 = x1;
        this.y1 = y1;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        this.id = id;
        this.nazwa = nazwa;
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    //sprawdzanie kolozji postaci z towarami

    /**
     * sprawdzanie kolozji postaci z towarami
     *
     * @param x wspolrzedna x
     * @param y wspolrzedna y
     * @return czy jest kolizja
     */
    public boolean hitbox(int x, int y) {
        if (x1 - 20 <= x && x <= x1 + szerokosc + 20 && y1 - 20 <= y && y <= y1 + wysokosc + 20) {
            return true;
        } else return false;
    }

    /**
     * pobieranie koloru obiektu
     *
     * @return kolor obiektu
     */
    public Color getColor() {
        return kolor;
    }

    /**
     * pobieranie nazwy obiektu
     *
     * @return nazwa obiektu
     */
    public String getNazwa() {
        return nazwa;
    }
}
