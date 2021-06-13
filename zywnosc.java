public class zywnosc extends towary {
    private int dniwaznosci;
    private String krajpoch;

    public zywnosc(int x1, int y1, int szerokosc, int wysokosc, int id, String nazwa, int cena, int waga, int dniwaznosci, String krajpoch) {
        super(x1, y1, szerokosc, wysokosc, id, nazwa, cena, waga);
        this.dniwaznosci = dniwaznosci;
        this.krajpoch = krajpoch;
    }
}