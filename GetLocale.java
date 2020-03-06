import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Locale;

public class GetLocale extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
   
      //Get the client's Locale
      Locale locale = request.getLocale();
      String language = locale.getLanguage();
      System.out.println(language);
   }
} 
