package arbreBplus;


public class Arbre<T extends Comparable<T>> {
	
	private Noeud<T> racine;
	private int ordre;
	private double taux = 0;
	
	public Arbre(int ordre){
		this.racine = new Noeud<T>(ordre);
		this.ordre = ordre;
	}
	
	public void ajouterData(T data) {
		this.racine.rechercheBonnePlace(data);
	}
	
	public void recursiveToString(){
		this.racine.recursiveToString();
	}

}
