package models;

public class Ennemi {
    private String nom;
    private int pv;
    private int position;

    public Ennemi(String nom, int pv, int position) {
        this.nom = nom;
        this.pv = pv;
        this.position = position;
    }

    public int avancer(){
        return position--;
    }

    public int subirDegats(int degats){
        pv = pv - degats;
        return pv;
    }

    public boolean estMort(){
        return pv <= 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
