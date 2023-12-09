package api.agence;

import com.sira.controller.AgenceController;
import com.sira.core.entity.Agence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "agences", value = "/agences")
public class SowApi extends HttpServlet {
    private AgenceController agenceController = new AgenceController();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Agence> agences = this.agenceController.readAll();
        request.setAttribute("agences", agences);
        request.getRequestDispatcher("pages/agence/index").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}