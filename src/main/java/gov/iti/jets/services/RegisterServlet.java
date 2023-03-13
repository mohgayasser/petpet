package gov.iti.jets.services;

import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import gov.iti.jets.persistent.dto.UserDTO;
import gov.iti.jets.persistent.dto.UserDTOServiceImpl;
import gov.iti.jets.persistent.dto.interfaces.UserDTOServiceInt;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet(urlPatterns = {"/register"} , name = "RegisterServlet")
public class RegisterServlet extends HttpServlet{

    ArrayList<String> userInfo = new ArrayList<>();
    UserDTOServiceInt userService = new UserDTOServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Gson gson = new Gson();

        String fName =req.getParameter("firstName");
        System.out.println( "fname " + fName);
        // String userName = req.getParameter("Username");
        UserDTO user = new UserDTO(fName, null, null, null, null, null, null, null, null, null, null);
        userService.create(user);
        // System.out.println(userName);
        // userInfo.add(fName);
        // userInfo.add(userName);
        // resp.setContentType("application/json");
        // resp.getWriter().write("data: " + new Gson().toJson(userInfo) + "\n\n");

        /*
            intended*
         *  fromJson to fill UserDTO class 
         * 
         */
    }
}

