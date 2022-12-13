package JSPELExample.ServletAnnotations;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(
        urlPatterns = "/myController",
        loadOnStartup = 1,
        asyncSupported = true
)
public class StartupServlet extends HttpServlet {   
    public void init(ServletConfig config) {
        loggerObj.debug("My Servlet Has Been Initialized ….!");
    }
      
    // Servlet Code Here
}
