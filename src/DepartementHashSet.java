/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DepartementHashSet implements IDépartement<Departement>{
    List<Departement> depList;

    public DepartementHashSet() {
        depList= new ArrayList<Departement>();
    }
    @Override
    public void ajouterDepartement(Departement d) {
        depList.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (int i = 0; i < depList.size(); i++) {
            if (depList.get(i).getNomDep().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return depList.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        depList.remove(d);
    }

    @Override
    public void displayDepartement() {
        System.out.println(depList);
    }

    @Override
    public void trierDepartementById() {
        Comparator<Departement> departementComparator = new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Employe o2) {
                return o1.getId().compareTo(o2.getId());
            }
        };
        Collections.sort(depList, departementComparator.thenComparing(IdComparator));
    }
}
*/