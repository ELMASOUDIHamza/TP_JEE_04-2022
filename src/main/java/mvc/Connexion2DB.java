package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion2DB {
// Variables :	
	static private Connection connexion;
// Singleton method :
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/jee_ht_devoir1","hightech","HIGHTECH2022"); 
			System.out.println("La connexion à la base de donn�es est correctement �tablie !");
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur du chargement du driver JDBC !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("La connexion � la base de donn�es n'est pas établie !");
		}
	}
// M�thode de Connexion :
	public static Connection connectToDb () {
/*		if(connexion.equals(null)) System.out.println("La connexion � la base de donn�es n'est pas �tablie !");
		else System.out.println("La connexion � la base de donn�es est correctement �tablie !");*/
		return connexion ;
	}

}
