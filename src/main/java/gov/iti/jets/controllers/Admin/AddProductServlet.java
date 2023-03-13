package gov.iti.jets.controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
  maxFileSize = 1024 * 1024 * 5, 
  maxRequestSize = 1024 * 1024 * 5 * 5)
public class AddProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String path = "C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\webapps\\";
        final Collection<Part> filePart = request.getParts();
       
        final PrintWriter writer = response.getWriter();
        for (Part part : filePart) {
            final String fileName = part.getSubmittedFileName();
            System.out.println(fileName);
        }
         // try {
        // filePart.writer(path + fileName);
        // writer.println("<p>" + fileName + " Uploaded In: " + path + " BY:  "
        //     + request.getParameter("username") + "</p>");
        // } catch (FileNotFoundException fne) {
        // writer.println("<p>Error While Uploading Your File</p>");
        // }
    }
    private String getFileName(final Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
          if (content.trim().startsWith("filename")) {
            return content.substring(
                content.indexOf('=') + 1).trim().replace("\"", "");
          }
        }
        return null;
      }
}
