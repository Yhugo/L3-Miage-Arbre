package arbreBplus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Arbre<Integer> arbre = new Arbre<>(4);
		Scanner sc = new Scanner(System.in);
		while(true){
			Integer data = sc.nextInt();
			arbre.ajouterData(data);
			arbre.recursiveToString();
		}
	}

}