public class Departement {
    int id ;
    String nomDep;
    int nbrE;

    public Departement(int id, String nomDep, int nbrE) {
        this.id = id;
        this.nomDep = nomDep;
        this.nbrE = nbrE;
    }

    public Departement() {

    }

    public int getId() {
        return id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public int getNbrE() {
        return nbrE;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public void setNbrE(int nbrE) {
        this.nbrE = nbrE;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() == Departement.class){
            Departement d = (Departement) obj;
            return (d.getNomDep()==this.getNomDep()) && (d.getId() == this.getId());
        }
        return false;
    }
    @Override
    public String toString() {
        return "Identifiant :"+ id +"NomDep :"+ nomDep + "nbrE :"+ nbrE ;

    }
}
