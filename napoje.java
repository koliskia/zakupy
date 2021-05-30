public class napoje extends towary {
    private int dniwaznosci;
    private boolean czygaz;
    private boolean czyplastik;

    public napoje(int id, String nazwa, int cena, int waga, int dniwaznosci, boolean czygaz, boolean czyplastik) {
        super(id, nazwa, cena, waga);
        this.dniwaznosci = dniwaznosci;
        this.czygaz = czygaz;
        this.czyplastik = czyplastik;
    }
}
