package mvc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/gestionSalaries")
public class GestionSalaries extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GestionSalaries() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SalarieImp imp = new SalarieImp();
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String tache = request.getParameter("tache");
		Salarie salarie = new Salarie( nom, prenom, tache);
		String notification = salarie.notif();
		request.setAttribute("notification", notification);
		request.setAttribute("salarie", salarie);
		imp.ajouterSalarie(salarie);
		request.getRequestDispatcher("/notification.jsp").forward(request, response);
		//PrintWriter out = 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
