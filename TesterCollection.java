import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;

public class TesterCollection {

    public static void main(String[] args) {

        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("Ali", 14.5));
        etudiants.add(new Etudiant("Sara", 17.0));
        etudiants.add(new Etudiant("Omar", 9.0));
        etudiants.add(new Etudiant("Nadia", 12.5));

        
        List<String> nomsMajuscules = etudiants.stream()
                .filter(e -> e.getMoyenne() > 10) // moyenne > 10
                .sorted(Comparator.comparingDouble(Etudiant::getMoyenne).reversed())
                .map(e -> e.getNom().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Étudiants admis : " + nomsMajuscules);//trie et filtre

        // Calculer la moyenne générale
        double moyenneGenerale = etudiants.stream()
                .mapToDouble(Etudiant::getMoyenne)
                .average()
                .orElse(0);

        System.out.println("Moyenne générale : " + moyenneGenerale);
    }
}