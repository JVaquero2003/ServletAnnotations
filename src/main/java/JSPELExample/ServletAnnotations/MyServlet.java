package JSPELExample.ServletAnnotations;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(
	    name = "MyServlet",
	    description = " This is my first annotated servlet",
	    urlPatterns = {"/processServlet"}
	)
public class MyServlet extends HttpServlet{
	// Servlet Code Here 
}
