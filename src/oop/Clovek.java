package oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Clovek {

    public Clovek() {}

    public Clovek(String jmeno, String prijmeni,
                  String datumNarozeni, String mistoNarozeni,
                  String pohlavi) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.mistoNarozeni = mistoNarozeni;
        this.pohlavi = pohlavi;
    }

    private String jmeno;
    private String prijmeni;
    private String datumNarozeni;
    private String mistoNarozeni;
    private String pohlavi;

    public String vypisCeleJmeno() {
        String celeJmeno = this.jmeno + " " + this.prijmeni;
        return celeJmeno;
    }

    public long spocitejVek() {
        LocalDate vekParsed = LocalDate.parse(this.getDatumNarozeni(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        long vek = ChronoUnit.YEARS.between(vekParsed, LocalDate.now());
        return vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String noveJmeno) {
        this.jmeno = noveJmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(String datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getMistoNarozeni() {
        return mistoNarozeni;
    }

    public void setMistoNarozeni(String mistoNarozeni) {
        this.mistoNarozeni = mistoNarozeni;
    }

    public String getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(String pohlavi) {
        this.pohlavi = pohlavi;
    }
}
