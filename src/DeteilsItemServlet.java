import db.DBManager;
import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.IOException;
@WebServlet(value = "/items-det")
public class DeteilsItemServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      int id = Integer.parseInt(req.getParameter("id"));

      req.setAttribute("model" , DBManager.getId(id));
      req.getRequestDispatcher("/html/items-det.jsp").forward(req,resp);
    }
}
