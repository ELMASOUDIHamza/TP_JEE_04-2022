package mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalarieImp {
// Variables :
		private int id;
		private String nom, prenom, tache, nomComplet ;
	    //private static String test;
		// byte compteur ;
		private List <Salarie> listSalarie ;
		private static Salarie salarie = new Salarie();
		private PreparedStatement requete ;
		private ResultSet resultat ;
		private Connection connexion = Connexion2DB.connectToDb();
	
// Methods :
		
		public List<Salarie> afficherSalaries() {
			// TODO Auto-generated method stub
			try {
				requete = connexion.prepareStatement("SELECT * FROM salarie");
				resultat = requete.executeQuery();
				listSalarie = new ArrayList <Salarie>();
				while(resultat.next()) {
					salarie = new Salarie();
					salarie.setId(resultat.getInt("id"));
					salarie.setNom(resultat.getString("nom"));
					salarie.setPrenom(resultat.getString("prenom"));
					salarie.setTache(resultat.getString("tache"));
					listSalarie.add(salarie);
					
				}
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Erreur de requête !");
			}
			return listSalarie;
		}
		
	public void ajouterSalarie(Salarie salarie) {
		try {
			if( salarie != null) {
				requete = connexion.prepareStatement("INSERT INTO salarie (id, nom, prenom, tache) VALUES ( NULL, ?, ? , ?)");
				//requete.setString(1, "NULL");
				requete.setString(1, salarie.getNom());
				requete.setString(2, salarie.getPrenom());
				requete.setString(3, salarie.getTache());
				requete.executeUpdate();
				System.out.println("Le salarié "+salarie.getNom()+" "+salarie.getPrenom()+" est bien ajouté !");
			}
			else System.out.println("Impossible d'ajouter un salarié null !");

		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur d'ajout du salarié !");
		}

	}

	public Salarie chercherSalarie(int id) {
		try {
			requete = connexion.prepareStatement("SELECT * FROM salarie WHERE id = ?");
			requete.setInt(1 , id);
			resultat = requete.executeQuery();
			if (resultat.next()) {
				salarie = new Salarie();
				salarie.setId(resultat.getInt("id"));
				salarie.setNom(resultat.getString("nom"));
				salarie.setPrenom(resultat.getString("prenom"));
				salarie.setTache(resultat.getString("tache"));
			}
			else {
				salarie = new Salarie();
				salarie.setNom("Il n'y a aucun produit avec ce code !");
				salarie.setPrenom("Code null");
			}
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur de requ�te !");
		}
		return salarie ;
	}
	
	public void supprimerSalarie(int id) {
		
		Salarie salarie = chercherSalarie(id);
		nomComplet = salarie.getPrenom()+" "+salarie.getNom();
		if(salarie.getPrenom().equals(null) && salarie.getNom().equals(null)) {
				System.out.println("Ce salarié n'existe pas !"); // Pourquoi ce message n'est pas affich� ?!
		}
		else {	
					id = salarie.getId();
			try {
					requete = connexion.prepareStatement("DELETE FROM salarie WHERE id = ?");
					requete.setInt(1, id);
					requete.executeUpdate();
					System.out.println("Le salarié est correctement supprimé !");
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Erreur de requête !");
			}
		}	
	}
}
