package com.santhosh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		if(upass.equals("santhosh")){
			Cookie ck=new Cookie("track",uname);
			response.addCookie(ck);
			out.println("wellcome :"+uname);
			out.println("<a href='pro'>profile</a><br>");
			out.println("<a href='comp?a="+uname+"'>compose</a>");
		}
		else{
			out.println("username and password is incorrect....!");
			request.getRequestDispatcher("index.html").include(request,response);
		}
	}

}
