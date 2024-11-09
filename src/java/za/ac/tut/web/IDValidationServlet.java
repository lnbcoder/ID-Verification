
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.IDValidationManager;

/**
 *
 * @author loveness
 */
public class IDValidationServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String idNumber = (String)request.getParameter("idNum");
        request.setAttribute("idNumber", idNumber);
        
        
        IDValidationManager idvm = new IDValidationManager(idNumber);
        
        String dateOfBirth = idvm.determineDateOfBirth() ;
        request.setAttribute("dateOfBirth", dateOfBirth);
        
        String gender = idvm.determineGender();
        request.setAttribute("gender", gender);
        
        String citizenshipStatus = idvm.determineCitizenshipStatus();
        request.setAttribute("citizenshipStatus", citizenshipStatus);
        
        String validateIDOutcome = idvm.verificationOutcome();
        request.setAttribute("validateIDOutcome",validateIDOutcome);
                
        String path = idvm.validateId();
        request.setAttribute("path", path);
        
        //recieves request from the client and sends them to the jsp 
        RequestDispatcher disp = request.getRequestDispatcher(path);
        disp.forward(request, response);
        
        
    }

}
