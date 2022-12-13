package JSPELExample.ServletAnnotations;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns = { "/foo", "/bar", "/cool" })
public class UrlMyServlet extends HttpServlet {
	// Servlet Code Here
}
