public class zywnosc extends towary {
    private int dniwaznosci;
    private String krajpoch;

    public zywnosc(int id, String nazwa, int cena, int waga, int dniwaznosci, String krajpoch){
        super(id, nazwa, cena, waga);
        this.dniwaznosci = dniwaznosci;
        this.krajpoch = krajpoch;
    }
}