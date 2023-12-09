package api.agence;

import com.sira.controller.AgenceController;
import com.sira.core.entity.Agence;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet(name = "agencenew", value = "agence/new")
public class NewApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getServletPath());
        request.getRequestDispatcher("/pages/agence/new.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Agence agence = AgenceRequest(request);
        AgenceController agenceController = new AgenceController();
        agenceController.create(agence);
        response.sendRedirect("/sira/agences");

        System.out.println("Post");
        //doGet(request,response);
    }

    static Agence  AgenceRequest(HttpServletRequest request) {
        String nom =  request.getParameter("nom");
        String tel =  request.getParameter("tel");
        String email =  request.getParameter("email");
        String adresse =  request.getParameter("adresse");
        String cp =  request.getParameter("cp");
        String ville =  request.getParameter("ville");
        String image =  request.getParameter("image");
       return  new Agence(nom,tel,email,adresse,cp,ville,image);
    }
}