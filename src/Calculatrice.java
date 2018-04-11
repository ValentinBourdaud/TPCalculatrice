import java.util.Scanner;

public class Calculatrice {
	
	public static void main(String[] args) {
		
		//Initialisation des variables
		
		double nb1=-1;
		double nb2=-1;
		double resultat=-1;
		int choix=-1;
		
		Scanner scnb1 = new Scanner(System.in);
		Scanner scnb2 = new Scanner(System.in);
		Scanner scchoix = new Scanner(System.in);

		//On affiche les choix dispos pour l'utilisateur
		
		System.out.println("Quelle opération voulez-vous faire ?"); 
		System.out.println("Tapez 1 pour l'addition");
		System.out.println("Tapez 2 pour la soustraction");
		System.out.println("Tapez 3 pour la multiplication");
		System.out.println("Tapez 4 pour la division");
		
		//On vérifie que la valeur entrée est comprise entre 1 et 4
		
		try {
			choix = scchoix.nextInt();
		} catch(Exception ex) {
			System.out.println("Vous n'avez pas entré la bonne valeur");
		}
		
		switch(choix) {
		
		//Si 1, alors on demande l'addition
		case 1:
		System.out.println("Veuillez saisir le premier nombre : ");
		nb1 = scnb1.nextDouble();
		System.out.println("Veuillez saisir le deuxième nombre : ");
		nb2 = scnb2.nextDouble();
		resultat = nb1+nb2;
		System.out.println("Le résultat est : " + resultat);
		break;
	
		//Si 2, alors on demande la soustraction

		case 2:
		System.out.println("Veuillez saisir le premier nombre : ");
		nb1 = scnb1.nextDouble();
		System.out.println("Veuillez saisir le deuxième nombre : ");
		nb2 = scnb2.nextDouble();
		resultat = nb1-nb2;
		System.out.println("Le résultat est : " + resultat);
		break;
		
			
		//Si 3, alors on demande la multiplication

		case 3:
		System.out.println("Veuillez saisir le premier nombre : ");
		nb1 = scnb1.nextDouble();
		System.out.println("Veuillez saisir le deuxième nombre : ");
		nb2 = scnb2.nextDouble();
		resultat = nb1*nb2;
		System.out.println("Le résultat est : " + resultat);
		break;
				
		
		//Si 4, alors on demande la division

		case 4:
		System.out.println("Veuillez saisir le premier nombre : ");
		nb1 = scnb1.nextDouble();
		System.out.println("Veuillez saisir le deuxième nombre : ");
		nb2 = scnb2.nextDouble();
		resultat = nb1/nb2;
		System.out.println("Le résultat est : " + resultat);
		break;
		
		}

	}

}
