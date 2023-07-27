package mvc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
@WebServlet("/TP_Gestion_Salaries/afficherSalaries")
public class AfficherSalaries extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AfficherSalaries() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connection = (Connection) Connexion2DB.connectToDb();
		List<Salarie> listSalaries = new ArrayList<Salarie>();
		Salarie salarie = new Salarie();
		SalarieImp imp = new SalarieImp();
		listSalaries = imp.afficherSalaries();
		request.setAttribute("listSalaries", listSalaries);
		request.getRequestDispatcher("/afficherSalaries.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
