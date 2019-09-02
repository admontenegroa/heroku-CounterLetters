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
	    }
		
		 @Override
		    protected void doPost(HttpServletRequest request, HttpServletResponse response)
		            throws ServletException, IOException {
			 Contador contador = new Contador(request.getParameter("word"));
			 if(contador.isLengthOkey()) {
				 numberLetters=contador.countLetter();
				 request.setAttribute("wordLength", contador.writeNumber(numberLetters));
				 request.setAttribute("originalWord", contador.getCadena());
				 request.getRequestDispatcher("numberLetters.jsp").forward(request, response); 
				 response.sendRedirect("numberLetters.jsp");
				 
			 }else {
				 response.sendRedirect("error.jsp");
			 }
			 
		 }
	}
