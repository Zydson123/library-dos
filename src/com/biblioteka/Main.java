package com.biblioteka;

public class Main {
    public static void main(String[] args) {
        Osoba kubaBed = new Osoba("Jakub", "Bedlinski", "04.07.2005");
        Osoba piesPsi = new Osoba("Pies", "Psi", "07.04.5002");
        Osoba kotKoci = new Osoba("Kot", "Koci", "05.02.542");
        Osoba JRRTolkien = new Osoba("John Ronald Reuel", "Tolkien", "03.01.1892"); //id ksiazki = 0
        Osoba JKRowling = new Osoba("Joanne", "Murian", "31.07.1965"); // id ksiazki = 1
        Ksiegarnia.dodajKsiazke("Władcy pierścieni i drużyna pierścienia", JRRTolkien);
        Ksiegarnia.dodajKsiazke("Harry Potter i kamień filozoficzny", JKRowling);

        Ksiegarnia.dodajPracownika(kotKoci, "05.10.2022");

        Ksiegarnia.dodajCzytelnika(kubaBed); //id czytelnika = 0
        Ksiegarnia.dodajCzytelnika(piesPsi); //id czytelnika = 1
        var czytelnik = Ksiegarnia.getCzytelnicy();
        var ksiazka = Ksiegarnia.getKsiazki();
        czytelnik.get(0).wyporzyczKsiazke(ksiazka.get(0));
        czytelnik.get(1).wyporzyczKsiazke(ksiazka.get(1));
        czytelnik.get(0).oddajKsiazke(ksiazka.get(1));
        czytelnik.get(0).oddajKsiazke(ksiazka.get(0));
        czytelnik.get(1).oddajKsiazke(ksiazka.get(1));
    }
}