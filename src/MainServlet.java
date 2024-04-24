import db.DBConnector;
import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.IOException;


@WebServlet(value = "/main")
public class MainServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      request.setAttribute("model", DBConnector.getAllItems());
    //   request.setAttribute("model", DBManager.getItems());

   request.getRequestDispatcher("/html/main.jsp").forward(request, response);
    }
    }
