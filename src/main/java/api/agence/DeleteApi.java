package api.agence;

import com.sira.controller.AgenceController;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DeleteApi extends HttpServlet {
    private AgenceController agenceController = new AgenceController();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
       boolean res = this.agenceController.delete(id);


       if (res){
            response.sendRedirect("/sira/agences");
       }else {
           System.out.println("Cannot delete");
       }

    }

}