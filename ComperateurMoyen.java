import java.util.Comparator;

public class ComparateurMoyenne implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        return Double.compare(e2.getMoyenne(), e1.getMoyenne());
    }
}