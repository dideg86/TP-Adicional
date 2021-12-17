package ap;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class PizzeriaServlet
 */
@WebServlet("/pizzeria")
public class PizzeriaServlet extends HttpServlet implements Servlet {
       
	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpServletResponse response2 = (HttpServletResponse) response;
		
		String valor1 = request.getParameter("nombre");
		String valor2 = request.getParameter("pizza");
		
		String nombre;
		String error = "";
		String mensaje = "";
		
		try {
			nombre = valor1; 
			if (nombre == "") {
				error = "Error, tu nombre no puede estar vacio";
			} else {
				mensaje = "Hola " +valor1+","+" veo que te gusta la pizza de "+valor2;
				mensaje = "Hola " +valor1+","+" veo que te gusta la pizza de "+valor2;
			}
		} catch (Exception e) {
			error = "Datos incorrectos";
		
	}
		if (error.isEmpty()) {
			request.setAttribute("mensaje", mensaje);
			
		}else{
			request.setAttribute("error", error);
		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response2);

}
}
