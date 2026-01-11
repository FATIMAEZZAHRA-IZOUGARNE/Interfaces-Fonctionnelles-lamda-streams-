
import java.util.List;

public class Etudiant {
	    private String nom;
	    private double moyenne;
	    private String mention;
	    private List<String> matieres;

	    public Etudiant(String nom, double moyenne,String mention,List<String> matieres) {
	        this.nom = nom;
	        this.moyenne = moyenne;
	        this.mention=mention;
	        this.matieres = matieres;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public double getMoyenne() {
	        return moyenne;
	    }
	    
	    public String  getMension() {
	        return mention;
	    }
	    
	    public List<String> getMatieres() { 
	    	    return matieres;
	    	}
	   

}