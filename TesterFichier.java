
import java.util.List;
import java.nio.file.*;
import java.io.IOException;
import java.util.stream.*;
import java.util.Comparator;

public class TesterFichier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Path path = Paths.get("texte.txt"); 

	        String voyelles = "RAYoeui";

	        try (Stream<String> lignes = Files.lines(path)) {

	        	List<String> mots = lignes
	                    .flatMap(ligne -> Stream.of(ligne.split("\\s+")))
	                    .collect(Collectors.toList());

	            System.out.println("Nombre total de mots : " + mots.size());

	            mots.stream()
	                .max(Comparator.comparingInt(String::length))
	                .ifPresent(max -> System.out.println("Mot le plus long : " + max));

	            System.out.println("Mots commençant par une voyelle :");
	            mots.stream()
	                .filter(mot -> !mot.isEmpty() && voyelles.indexOf(mot.charAt(0)) != -1)
	                .forEach(System.out::println);

	        } catch (IOException e) {
	            System.out.println("Erreur lecture fichier : " + e.getMessage());
	        }

	}

}