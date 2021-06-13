import java.awt.Color;

public class Towary {
    private int id;
    private String nazwa;
    private int cena;
    private int waga;
    private Color kolor;
    int x1, y1, szerokosc, wysokosc;

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

    public boolean hitbox(int x, int y) {
        if (x1 - 20 <= x && x <= x1 + szerokosc + 20 && y1 - 20 <= y && y <= y1 + wysokosc + 20) {
            return true;
        } else return false;
    }

    public Color getColor() {
        return kolor;
    }

    public String getNazwa() {
        return nazwa;
    }
}
