package inside;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class About
 */

@WebServlet(name = "About", urlPatterns = {"/inside/about"})
public class About extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("name") != null){
			response.sendRedirect("/my-webapp/inside/about.jsp");
		} else {
			response.sendRedirect("/my-webapp/loginFirst.jsp");
		}
	}
}
