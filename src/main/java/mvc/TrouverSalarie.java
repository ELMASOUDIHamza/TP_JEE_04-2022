package mvc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mysql.jdbc.Connection;

@WebServlet("/trouveSalarie")
public class TrouverSalarie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TrouverSalarie() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connexion = (Connection) Connexion2DB.connectToDb();
		SalarieImp imp = new SalarieImp();
		int id = Integer.parseInt(request.getParameter("id"));
		Salarie salarie = new Salarie();
		salarie = imp.chercherSalarie(id);
		request.setAttribute("salarie", salarie);
		request.getRequestDispatcher("/trouverSalarie.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
