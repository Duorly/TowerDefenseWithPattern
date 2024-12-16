package models;

public abstract class Tour {
    private String nom;
    private int portee;
    private int degat;
    private int cout;

    public Tour(String nom, int portee, int degat, int cout) {
        this.nom = nom;
        this.portee = portee;
        this.degat = degat;
        this.cout = cout;
    }

    public abstract void attaquer();

    public void afficherStatistiques(){
        System.out.println(nom + "\nPortée : " + portee + "\nDegat : " + degat + "\nCout : " + cout);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPortee() {
        return portee;
    }

    public void setPortee(int portee) {
        this.portee = portee;
    }

    public int getDegat() {
        return degat;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }
}
