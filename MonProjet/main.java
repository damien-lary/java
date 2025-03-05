package MonProjet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEtudiant gestion = new GestionEtudiant();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Afficher les étudiants");
            System.out.println("3. Supprimer un étudiant");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");
            
            choix = scanner.nextInt();
            scanner.nextLine();  // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Classe : ");
                    String classe = scanner.nextLine();
                    gestion.ajouterEtudiant(nom, prenom, classe);
                    break;
                case 2:
                    gestion.afficherEtudiants();
                    break;
                case 3:
                    System.out.print("Nom de l'étudiant à supprimer : ");
                    String nomSup = scanner.nextLine();
                    gestion.supprimerEtudiant(nomSup);
                    break;
                case 4:
                    System.out.println("Fin du programme.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 4);

        scanner.close();
    }
}

