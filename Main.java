
import java.util.Scanner;
import java.util.HashMap;

public class Main{

	public static void main(String args[]){
	
		int choix;
		Scanner clavier=new Scanner(System.in);
		Service service=new Service();
		Journalier jour=new Journalier();
		Employe employe=new Employe();
		Emabuche embauche=new Embauche();
		do{
              			System.out.println();
              			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
              			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~1- Ajout Service~~~~~~~~~~~~~~~~~~~~~~~~~~");
              			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~2- Lister Services~~~~~~~~~~~~~~~~~~~~~~~~~~");
             			System.out.println("~~~~~~~~~~~~~~~~~~~~3- Ajouter un Employé~~~~~~~~~~~~~~~~~~~~");
              			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~4- Lister Journaliers~~~~~~~~~~~~~~~~~~~~~~~~");
              			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~5- Lister Embauchés d'un Service~~~~~~~~~~~~~~~~~~~~~~~~");
              			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~6- Quitter~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
              			System.out.println("Faites votre choix");
              			choix=clavier.nextInt();
              			System.out.println();

           			switch(choix){
            				case 1:
                					System.out.println("Veuillez saisir le libellé du service");
                   				Sring libelle=clavier.nextLine();
                   				service.setLibelle(libelle);
	 
             					break;
            				case 2:
                 					System.out.println("Le Libellé est "+ );
                 					
             					break;
             				case 3:
					System.out.println("Veuillez saisir le nom complet de l'employé");
                   				Sring nomComplet=clavier.nextLine();
                   				employe.setNomComplet(nomComplet);

             					break;
             				case 4:
              	  				System.out.println("La Durée est "+ );
					System.out.println("Le Forfait est de "+ );

              					break;
              				case 5:
                 					System.out.println("Le Salaire est de "+ );
					System.out.println("La Date "+ );
             					
					break;
             				

     			} while(choix!=6);

		}


	}

}