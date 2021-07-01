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
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/pro")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		Cookie[] ci=request.getCookies();
		if(!(ci==null)){
			String val=ci[0].getValue();
			if(!(val==null && val.equals(""))){
				out.println("wellcome to profile page:"+val);
				out.println("<a href='logout'>logout</a>");
			}
		}
		else{
		out.println("please login...!");
		out.println("<a href='index.html'>click to login</a>");
		out.println("<a href='pro'>Profile</a>");
		}
		}
		
	}


