package JSPELExample.ServletAnnotations;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/imageUpload", initParams = { @WebInitParam(name = "saveDir", value = "D:/FileUpload"),
		@WebInitParam(name = "allowedTypes", value = "jpg, jpeg, gif, png") })
public class ImageUploadServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String saveDir = getInitParameter("saveDir"), fileTypes = getInitParameter("allowedTypes");

		PrintWriter writerObj = response.getWriter();
		writerObj.println("saveDir?= " + saveDir);
		writerObj.println("fileTypes?= " + fileTypes);
	}
}
