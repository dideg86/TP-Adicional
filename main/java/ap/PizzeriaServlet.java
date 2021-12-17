package ap;

import java.io.IOException;
import java.util.Objects;
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
		String pizza;
		String muzzarella = "Muzzarella";
		String napolitana = "Napolitana";
		String jamon = "Jamon";
		String fugazzeta = "Fugazzeta";
		String calabresa = "Calabresa";
		
		
		try {
			nombre = valor1;
			pizza = valor2;
			if (nombre != "" && Objects.equals(pizza, muzzarella)) {
				mensaje = "Hola " +valor1+"!,"+" veo que te gusta la pizza de "+valor2+" (salsa y queso muzzarella)";
			} else if (nombre != "" && Objects.equals(pizza, napolitana)){
				mensaje = "Hola " +valor1+"!,"+" veo que te gusta la pizza de "+valor2+" (salsa, queso muzzarella y tomate)";
			} else if (nombre != "" && Objects.equals(pizza, jamon)) {
				mensaje = "Hola " +valor1+"!,"+" veo que te gusta la pizza de "+valor2+" (salsa, queso muzzarella y jamon)";				
			} else if (nombre != "" && Objects.equals(pizza, fugazzeta)) {
				mensaje = "Hola " +valor1+"!,"+" veo que te gusta la pizza de "+valor2+" (queso muzzarella y cebolla)";				
			} else if (nombre != "" && Objects.equals(pizza, calabresa)) {
				mensaje = "Hola " +valor1+"!,"+" veo que te gusta la pizza de "+valor2+" (salsa, queso muzzarella y longaniza)";				
			} else if (nombre == "") {
				error = "Error, tu nombre no puede estar vacio";
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
