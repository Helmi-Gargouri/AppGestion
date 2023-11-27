/*import java.util.*;

public class SocieteArrayList implements IGestion<Employe>{
    List<Employe> employeList;

    public SocieteArrayList() {
        employeList= new ArrayList<Employe>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employeList.add(employe);

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        if (employeList.contains(employe))
            return true;
        else
            return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {

    }

    @Override
    public void displayEmploye() {
        for(Employe e:employeList){
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employeList);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> comparatorDepartement = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return 0;
            }
        }

    }
}
*/