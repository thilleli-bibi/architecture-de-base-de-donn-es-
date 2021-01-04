/**
 * TP n°:6
 * 
 * Titre du TP :hashProbing
 *
 * Date : 09/12/2020
 * 
 * Nom  : bibi
 * Prenom :thilleli
 *
 * email : thillelibibi@gmail.com
 * 
 * Remarques :binome : Khemsine Lydia : lydiakhemsine@outlook.com
 */
package HashProbingPackage;

public class ProbingFactory {
	
	public HashProbing getclass(String Objectname) {
		
		if(Objectname.equals("Linear"))
			return new HashLinearProbing();
		
		if(Objectname.equals("Double"))
			return new HashDoubleProbing();
		else 
		return new HashQuadraticProbing();
	}

}
