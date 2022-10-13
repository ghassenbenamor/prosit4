public class main {
    public static void main(String[] args) {
        magasin m1 = new magasin(1, "Carrefour", "rades");
        magasin m2 = new magasin(2,"Monoprix","carthage");
        produit p1 = new produit(1021,"lait","delice",1.3);
        produit p2 = new produit(2510,"yaourt","vitalait",0.7);
        produit p3 = new produit(3250,"tomate","sicam",1.250);
        produit p4 = new produit(1021,"lait","yab",1.3);
        caissier c1 = new caissier(1, "mohammed","rades",180, 20);
        caissier c2 = new caissier(2, "marwa","hammem lif",150, 21);
        caissier c3 = new caissier(3, "lina","el zahra",180, 22);
        caissier c4 = new caissier(1, "haroun","carthage",140, 101);
        vendeur v1 = new vendeur(1,"mehrez","rades",200,0.2);
        vendeur v2 = new vendeur(1,"maha","marsa",180,0.6);
        vendeur v3 = new vendeur(2,"nadine","kram",80,0.1);
        vendeur v4 = new vendeur(3,"nihel","la goulette",150,0.2);
        responsable r1 = new responsable(1,"lamis","nouvelle medina",140,400);

        responsable r2 = new responsable(1,"med ali","carthage",180,800);
        c1.calculSalaire();
        c2.calculSalaire();
        c3.calculSalaire();
        c4.calculSalaire();
        v1.calculSalaire();
        v2.calculSalaire();
        v3.calculSalaire();
        v4.calculSalaire();
        r1.calculSalaire();
        r2.calculSalaire();
        m1.addProduct(p1);
        m1.addProduct(p2);
        m2.addProduct(p1);
        m2.addProduct(p2);
        m2.addProduct(p3);
        m2.addProduct(p4);
        m1.addEmployee(c1);
        m1.addEmployee(c2);
        m1.addEmployee(c3);
        m1.addEmployee(v1);
        m1.addEmployee(r1);
        r1.calculSalaire();
        m1.showMagasin();
        m2.addEmployee(c4);
        m2.addEmployee(v2);
        m2.addEmployee(v3);
        m2.addEmployee(v4);
        m2.addEmployee(r2);
        m2.showMagasin();

    }
}
