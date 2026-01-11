
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.DoubleSummaryStatistics;

public class OperationAvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Etudiant> etd=new ArrayList<>();
		etd.add(new Etudiant("Nour",11,"AB",List.of("js","java","c")));
		etd.add(new Etudiant("Wiaam",10,"TB",List.of("uml","python")));
		etd.add(new Etudiant("Sima",17,"TB",List.of("jason","oop")));
		etd.add(new Etudiant("Mouh",11,"P",List.of("java","jee")));
		etd.add(new Etudiant("Houda",15,"B",List.of("js","php")));
		etd.add(new Etudiant("lara",10,"B",List.of("js","html","css")));
		
		Map<String, List<Etudiant>> groupe = etd.stream()
	                .collect(Collectors.groupingBy(e->e.getMension()));

	     System.out.println("liste des etdudiant grouper par mention: ");
	     groupe.forEach((mention, liste) -> {
	            System.out.println("Mention " + mention + " :");
	            liste.forEach(e ->
	                System.out.println("  - " + e.getNom())
	            );
	        });
	     
	     
	     DoubleSummaryStatistics stats =
	    	        etd.stream()
	    	           .mapToDouble(Etudiant::getMoyenne)
	    	           .summaryStatistics();

	    	System.out.println("Note minimale : " + stats.getMin());
	    	System.out.println("Note maximale : " + stats.getMax());
	    	System.out.println("Moyenne générale : " + stats.getAverage());
	    	
	    List<String> toutesMatieres =
	                 etd.stream()
	                    .flatMap(e -> e.getMatieres().stream())
	                    .distinct()
	                    .toList();

	    System.out.println("=== Toutes les matieres ===");
	    System.out.println(toutesMatieres);

	}

}