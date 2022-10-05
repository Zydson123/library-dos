package com.biblioteka;

import java.util.ArrayList;

public class Ksiegarnia {
    private static final Ksiegarnia Ksiegarnia = new Ksiegarnia();

    private static ArrayList<Ksiazka>Ksiazki = new ArrayList<Ksiazka>();
    private static ArrayList<Bibliotekarz>Pracownicy = new ArrayList<Bibliotekarz>();

    public static ArrayList<Bibliotekarz> getPracownicy() {return Pracownicy;}

    public static void setPracownicy(ArrayList<Bibliotekarz> pracownicy) {Pracownicy = pracownicy;}

    private static ArrayList<Czytelnik> czytelnicy = new ArrayList<Czytelnik>();

    public static ArrayList<Ksiazka> getKsiazki() {return Ksiazki;}
    public static ArrayList<com.biblioteka.Czytelnik> getCzytelnicy() {return czytelnicy;}

    public static void setCzytelnik(ArrayList<com.biblioteka.Czytelnik> czytelnik) {czytelnicy = czytelnik;}

    public static void dodajKsiazke(String tytul, Osoba autor){
        Ksiazki.add(new Ksiazka(tytul,autor));
        System.out.println("Dodano ksiazke o tytule: " + tytul + " Autorstwa: " + autor);
    }

    public static void dodajCzytelnika(Osoba o){
        czytelnicy.add(new Czytelnik(o.getImie(), o.getNazwisko(), o.getUrodziny()));
        System.out.println("Czytelnik " + o.getImie() + " " + o.getNazwisko() + " Został dodany do księgarni");
    }

    public static void dodajPracownika(Osoba o, String DataZatrudnienia){
        Pracownicy.add(new Bibliotekarz(o.getImie(), o.getNazwisko(), o.getUrodziny(), DataZatrudnienia));
        System.out.println("Pracownik " + o.getImie() + " " + o.getNazwisko() + " Został zatrudniony dnia: " + DataZatrudnienia);
    }
}
