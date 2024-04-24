import db.DBManager;
import db.Item;

import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/add-items")
public class ADDItemsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     resp.sendRedirect("/html/add-items.jsp");
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name = req.getParameter("name");
       Double price = Double.parseDouble(req.getParameter("price"));
       int amount  =Integer.parseInt( req.getParameter("amount"));
       Item item = new Item();
       item.setName(name);
       item.setPrice(price);
       item.setAmount(amount);

        DBManager.addItems(item);

        resp.sendRedirect("/main");
    }
}
