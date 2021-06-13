public class napoje extends towary {
    private int dniwaznosci;
    private String czygaz;
    private String czyplastik;

    public napoje(int x1, int y1, int szerokosc, int wysokosc, int id, String nazwa, int cena, int waga, int dniwaznosci, String czygaz, String czyplastik) {
        super(x1, y1, szerokosc, wysokosc, id, nazwa, cena, waga);
        this.dniwaznosci = dniwaznosci;
        this.czygaz = czygaz;
        this.czyplastik = czyplastik;
    }
}
