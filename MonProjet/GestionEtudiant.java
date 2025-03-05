package MonProjet;

import java.util.ArrayList;
import java.util.Iterator;

public class GestionEtudiant {
    private ArrayList<Etudiant> listeEtudiants;

    public GestionEtudiant() {
        listeEtudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(String nom, String prenom, String classe) {
        Etudiant etudiant = new Etudiant(nom, prenom, classe);
        listeEtudiants.add(etudiant);
        System.out.println("Étudiant ajouté avec succès !");
    }

    public void afficherEtudiants() {
        if (listeEtudiants.isEmpty()) {
            System.out.println("Aucun étudiant enregistré.");
        } else {
            System.out.println("Liste des étudiants :");
            for (Etudiant e : listeEtudiants) {
                System.out.println(e);
            }
        }
    }

    public void supprimerEtudiant(String nom) {
        Iterator<Etudiant> it = listeEtudiants.iterator();
        boolean trouve = false;
        
        while (it.hasNext()) {
            Etudiant e = it.next();
            if (e.getNom().equalsIgnoreCase(nom)) {
                it.remove();
                trouve = true;
                System.out.println("Étudiant supprimé avec succès !");
            }
        }

        if (!trouve) {
            System.out.println("Aucun étudiant trouvé avec ce nom.");
        }
    }
}

