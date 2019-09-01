package Controllers;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Models.Contador;



	public class CounterLettersController extends HttpServlet {
		private int numberLetters;
		
	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        //String action = request.getAttribute("action");
	        //request.setAttribute("Letters", numberLetters);
	       //Integer variable = (Integer)req.getAttribute("unEntero");

	        
	    }
		
		 @Override
		    protected void doPost(HttpServletRequest request, HttpServletResponse response)
		            throws ServletException, IOException {
			 Contador contador = new Contador(request.getParameter("word"));
			 if(contador.isLengthOkey()) {
				 numberLetters=contador.countLetter();
				/* numberLetters=contador.countLetter();
				 //response.sendRedirect("error.jsp");
				 //request.setAttribute("Letters", numberLetters);
				 response.getWriter().print("<p> La variable vale " + numberLetters + "</p>");*/
				 request.setAttribute("wordLength", contador.writeNumber(numberLetters));
				 request.getRequestDispatcher("numberLetters.jsp").forward(request, response); 
				 response.sendRedirect("numberLetters.jsp");
				 //response.getWriter().print("<p> La variable vale " + numberLetters + "</p>");
					/*PrintWriter out = resp.getWriter();
					out.println("<html>");
					out.println("<body>");
					out.println("<t1>" + numberLetters + "</t1>");
					out.println("</body>");
					out.println("</html>");*/
				 
			 }else {
				 response.sendRedirect("error.jsp");
			 }
			 
		 }
	}
