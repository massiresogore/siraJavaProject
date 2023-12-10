package api;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "home", value = "/")
public class Home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // AgenceController agenceController = new AgenceController();
       // Agence agence = new Agence("Msaka","0702029202","msaka@gmail.com","23 rue choise","90900","Belgique","pol.jpeg");
       //agenceController.create(agence);
            //Agence agence =  agenceController.readOne(2);
      // boolean bool = agenceController.delete(4);

            //request.setAttribute("agence", agence);
       // request.setAttribute("bool", bool);
        //List<Agence> agences = agenceController.readAll();
        //request.setAttribute("agences", agences);
        System.out.println("home de massire");

        request.getRequestDispatcher("index.jsp").forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}