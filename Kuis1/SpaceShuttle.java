package Kuis1;

public class SpaceShuttle {
    private String kode;
    private int berat;
    private Roket rkt;
    private Generator generator;

    public SpaceShuttle(String kode, int berat, Roket rkt, Generator generator) {
        this.kode = kode;
        this.berat = berat;
        this.rkt = rkt;
        this.generator = generator;
    }
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public Roket getRkt() {
        return rkt;
    }

    public void setRkt(Roket rkt) {
        this.rkt = rkt;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }
}
