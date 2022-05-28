package com.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.*;
import com.dao.*;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       protected LoginBean l=null;   
       protected ADAO a=null;
    public Servlet1() {
        super();
       l=new LoginBean();
       a=new ADAO();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String u=request.getParameter("u1");
		String p=request.getParameter("p1");
		try {
		String s=	a.countUser(u,p);
			if(s!="")
			{
				HttpSession session =request.getSession();
				session.setAttribute("s", s);
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
				
			}
			else
			{
				response.sendRedirect("index.jsp");
			}
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
