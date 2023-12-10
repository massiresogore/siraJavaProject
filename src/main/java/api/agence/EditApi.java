package api.agence;

import com.sira.controller.AgenceController;
import com.sira.core.entity.Agence;
import com.sira.core.repository.AgenceRepository;
import dto.AgenceDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class EditApi extends HttpServlet {
    private AgenceController agenceController = new AgenceController();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       AgenceDto agence =  this.agenceController.readOne(Integer.parseInt(request.getParameter("id")));
       request.setAttribute("agence", agence);
        request.getRequestDispatcher("/pages/agence/edit.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Agence agence = NewApi.AgenceRequest(request);
        agence.setId_agence(Integer.parseInt(request.getParameter("id_agence")));
        AgenceController agenceController = new AgenceController();
        AgenceRepository agenceRepository = new AgenceRepository();
        agenceRepository.update(agence);
        //agenceController.update(agence);

        response.sendRedirect("/sira/agences");

    }

}
