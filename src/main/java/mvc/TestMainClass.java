package mvc;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

public class TestMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connexion = (Connection) Connexion2DB.connectToDb();
		SalarieImp imp = new SalarieImp();
		List<Salarie> listS =  new ArrayList<>();
		Salarie s= new Salarie("Tilla","Siham","Agent de surveillance");
		imp.ajouterSalarie(s);
		listS = imp.afficherSalaries();
		for(int i=0;i< listS.size();i++) {
			System.out.println(listS.get(i).getPrenom());
		}
		//imp.supprimerSalarie(3);
		
	}

}
