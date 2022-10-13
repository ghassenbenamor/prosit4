public class responsable extends employee {
    private  int prime;
    public responsable (int id,String nom, String adresse, int nbrHeures , int prime  ) {
        this.id=id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
        this.prime = prime;
    }

    public int getPrime() {

        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    public double calculSalaire () {
        this.salaire =this.nbrHeures * 10 + this.prime;
        if (this.nbrHeures>160) {
            this.salaire = this.salaire + (this.nbrHeures - 160 ) * (10 *1.2);
        }
        return salaire;
    }

    @Override
    public String toString() {
        return "employee { " + "id=" + id + ", nom=" + nom + ", adresse = " + adresse + ", nombre d'heures ="   + nbrHeures  + ", prime = " + prime + " ,salaire = " + salaire + " }" ;
    }
}