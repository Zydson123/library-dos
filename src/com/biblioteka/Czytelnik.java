package com.biblioteka;

import java.util.ArrayList;

public class Czytelnik extends Osoba{
    private int id;
    private static int iloscWyporzyczonych;
    private ArrayList<Ksiazka> porzyczoneKsiazki;
    public Czytelnik(String imie, String nazwisko, String urodziny) {
        super(imie, nazwisko, urodziny);
        this.id = (Ksiegarnia.getCzytelnicy().size() + 1);
        this.porzyczoneKsiazki = new ArrayList<Ksiazka>();
        this.iloscWyporzyczonych = 0;
    }

    public void wyporzyczKsiazke(Ksiazka k){
        if(k.isCzyPorzyczone()){
            System.out.println("Książka pod tytułem: " + k.getTytul() + " jest już wyporzyczona!!");
        }
        else{
            k.setCzyPorzyczone(true);
            porzyczoneKsiazki.add(k);
            System.out.println("Książka pod tytułem: " + k.getTytul() + " została wyporzyczona przez czytelnika: " + getImie() + " " + getNazwisko());
        }
    }

    public void oddajKsiazke(Ksiazka k){
        if(!k.isCzyPorzyczone()){
            System.out.println("Książka pod tytułem: " + k.getTytul() + " nie została wyporzyczona!");
        }
        else if(!(porzyczoneKsiazki.contains(k)) && k.isCzyPorzyczone()){
            System.out.println("Książka pod tytułem: " + k.getTytul() +  " nie może być oddana przez czytelnika: " + getImie() + " " + getNazwisko() + " ponieważ to nie ten czytelnik ją wypożyczył");
        }
        else{
            k.setCzyPorzyczone(false);
            porzyczoneKsiazki.remove(k);
            System.out.println("Książka pod tytułem: " + k.getTytul() + " została oddana przez czytelnika: " + getImie() + " " + getNazwisko());
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Ksiazka> getPorzyczone() {
        return porzyczoneKsiazki;
    }

    public void setPorzyczone(ArrayList<Ksiazka> porzyczone) {
        this.porzyczoneKsiazki = porzyczone;
    }

    @Override
    public String toString() {
        return getImie() + " " + getNazwisko() + " " + getUrodziny() + " id: " + getId();
    }
}