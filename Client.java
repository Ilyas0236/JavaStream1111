package javastream;

import java.util.Objects;

public class Client {
	private final int idClient;
    private final String nom;
    private final String adresse;   
    private final double chiffreAffaire;

    public Client(int idClient, String nom, String adresse, double chiffreAffaire) {
        this.idClient = idClient;
        this.nom = nom;
        this.adresse = adresse;
        this.chiffreAffaire = chiffreAffaire;
    }

    public int getIdClient() { return idClient; }
    public String getNom() { return nom; }
    public String getAdresse() { return adresse; }
    public double getChiffreAffaire() { return chiffreAffaire; }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", chiffreAffaire=" + chiffreAffaire +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return idClient == client.idClient;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient);
    }

}
