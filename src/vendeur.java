public class vendeur extends employee {
    private double tauxDevente;

    public vendeur(int id,String nom, String adresse, int nbrHeures , double tauxDevente) {
        this.id=id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
        this.tauxDevente = tauxDevente;
    }

    public double getTauxDevente() {
        return tauxDevente;
    }

    public void setTauxDevente(float tauxDevente) {
        this.tauxDevente = tauxDevente;
    }

    public double calculSalaire () {
        this.salaire =450 + (450*this.tauxDevente);
        return salaire;
    }

    @Override
    public String toString() {
        return "employee { " + "id=" + id + ", nom=" + nom + ", adresse = " + adresse + ", nombre d'heures ="   + nbrHeures  + ", taux de vente = " + tauxDevente +  " ,salaire = " + salaire +"  }" ;
    }
}
