package com.biblioteka;

public class Ksiazka {
    private String tytul;
    private Osoba autor;
    private boolean czyPorzyczone;

    public Ksiazka(String tytul, Osoba autor) {
        this.tytul = tytul;
        this.autor = autor;
        this.czyPorzyczone = false;
    }

    public String getTytul() {
        return tytul;
    }

    public Osoba getAutor() {
        return autor;
    }

    public boolean isCzyPorzyczone() {
        return czyPorzyczone;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public void setCzyPorzyczone(boolean czyPorzyczone) {
        this.czyPorzyczone = czyPorzyczone;
    }

    @Override
    public String toString() {
        if(isCzyPorzyczone()){
            return "Ksiazka o tytule: " + getTytul() + " Autorstwa: " + getAutor() + " jest wyporzyczona ";
        }
        else{
            return "Ksiazka o tytule: " + getTytul() + " Autorstwa: " + getAutor() + " nie jest wyporzyczona ";
        }
    }
}