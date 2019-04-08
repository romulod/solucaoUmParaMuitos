//Controller (servelet)
package controll;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Cliente;
import entity.Produto;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cliente c = new Cliente();
		Produto p = new Produto();
		PrintWriter out = response.getWriter();
		try {
			
			if(c.isId() == true) {
			
			c.setNome(request.getParameter("nome"));
			c.setEmail(request.getParameter("email"));
			
			}else {
				
			 c.setNome(request.getParameter(null));
			 c.setEmail(request.getParameter(null));
			 
			}
			
			p.setNomeProduto(request.getParameter("produto"));
			p.setPreco(new Double(request.getParameter("preco")));

			Manager.clientes.add(c);
			Manager.lista.add(p);

			response.getWriter().print("<th>" + c.getNome() + ", " + c.getEmail() + "</th>");
			out.format("<br/>");
				
			Manager.lista.stream().forEach(out.format("<th>")::println);
			out.format("<br/>");

			Double somaTotal = Manager.lista.stream().map((x) -> p.getPreco()).reduce(0., (a, b) -> a + b);

			response.getWriter().println("<br/>Total : R$" + somaTotal + "<br/>");

			response.setContentType("text/html");

			response.getWriter().println("<a href=\"javascript:history.go(-1)\">Voltar</a>");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}