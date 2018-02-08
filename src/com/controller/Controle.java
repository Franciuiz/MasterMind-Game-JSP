package com.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Logica;


/**
 * Servlet implementation class Controle
 */
@WebServlet("/Controle")
public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//pega os valores do index
		String n1String = request.getParameter("n1");
		String n2String = request.getParameter("n2");
		String n3String = request.getParameter("n3");
		String n4String = request.getParameter("n4");
		
		
		int[] palpite = new int[4];
		try {
			//converte o valor pego de string pra int e joga numa posição do array
			palpite[0] = Integer.parseInt(n1String);
			palpite[1] = Integer.parseInt(n2String);
			palpite[2] = Integer.parseInt(n3String);
			palpite[3] = Integer.parseInt(n4String);
			
			//criação e define a seção
			HttpSession session = request.getSession();
			Logica game = (Logica) session.getAttribute("game");
			
			//Programação defensiva! (de Aliandro)
			if ( game == null ){
				game = new Logica();
				session.setAttribute("game", game);
			}
			
			//chama o model
			Boolean ganhou = game.realizarPalpite(palpite);
		
			//redireciona pra pagina correta de acordo com o resultado do model
			if ( ganhou ){
				session.removeAttribute("game");
				response.sendRedirect("parabens.html"); 
			} else {
				response.sendRedirect("index.jsp");
			}
			
			
		} catch ( Exception exception ){
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
