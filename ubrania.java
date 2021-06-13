import java.awt.Color;

public class ubrania extends towary {
    private String rozmiar;

    public ubrania(int x1, int y1, int szerokosc, int wysokosc, int id, String nazwa, int cena, int waga, String rozmiar, Color kolor) {
        super(x1, y1, szerokosc, wysokosc, id, nazwa, cena, waga, kolor);
        this.rozmiar = rozmiar;
    }
}
