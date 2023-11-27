// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe(1,"helmi","helmi","TIC",5);
        Employe e2 = new Employe(2,"yassine","yassine","HR",5);
        Employe e3 = new Employe(1,"tahe","tahe","HR",5);
        Employe e4 = new Employe(2,"youssef","youssef","TIC",5);

        Departement d1 = new Departement(11,"HR",5);
        Departement d2 = new Departement(11,"TIC",20);

        AffectationHashMap aff = new AffectationHashMap();
        aff.ajouterEmployeDepartement(e1,d2);
        aff.ajouterEmployeDepartement(e2,d1);
        aff.ajouterEmployeDepartement(e3,d1);
        aff.ajouterEmployeDepartement(e4,d2);

    }
}