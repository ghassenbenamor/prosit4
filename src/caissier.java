public class caissier extends employee{
    private int numeroDeCaisse;

    //constructor

    public caissier(int id,String nom, String adresse, int nbrHeures , int numeroDeCaisse)  {
        this.id=id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
        this.numeroDeCaisse = numeroDeCaisse;

    }

    // getter

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    //setter

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public double calculSalaire () {
        this.salaire =this.nbrHeures * 5;
        if (this.nbrHeures>160) {
            this.salaire = this.salaire + (this.nbrHeures - 160 ) * (5 *1.15);
        }
        return salaire;
    }


    @Override
    public String toString() {
        return "employee { " + "id=" + id + ", nom=" + nom + ", adresse = " + adresse + ", nombre d'heures ="   + nbrHeures  + ", numero de caisse = " + numeroDeCaisse + " ,salaire = " + salaire + " }" ;
    }
}

