package com.biblioteka;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String urodziny;

    public Osoba(String imie, String nazwisko,String urodziny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.urodziny = urodziny;
    }

    public String getImie() {return imie;}

    public String getNazwisko() {return nazwisko;}

    public String getUrodziny() {return urodziny;}

    public void setImie(String imie) {this.imie = imie;}

    public void setNazwisko(String nazwisko) {this.nazwisko = nazwisko;}

    public void setUrodziny(String urodziny) {this.urodziny = urodziny;}

    @Override
    public String toString() {
        return imie + " " + nazwisko + " Urodzony: " + urodziny;
    }
}
