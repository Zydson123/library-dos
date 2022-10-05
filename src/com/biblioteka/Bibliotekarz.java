package com.biblioteka;

public class Bibliotekarz extends Osoba{
    private String dataZatrudnienia;
    public Bibliotekarz(String imie, String nazwisko, String urodziny, String dataZatrudnienia) {
        super(imie, nazwisko, urodziny);
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public String getDataZatrudnienia() {return dataZatrudnienia;}

    public void setDataZatrudnienia(String dataZatrudnienia) {this.dataZatrudnienia = dataZatrudnienia;}

    @Override
    public String toString() {
        return getImie() + " " + getNazwisko() + " urodzony:" + getUrodziny() + " zatrudniony: " + getDataZatrudnienia();
    }
}
