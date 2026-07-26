package p1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
//This is service layer component
@WebServlet("/authenticate")
public class Servlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws  IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("Inside the Server");
		String user=req.getParameter("userName");
		String pwd=req.getParameter("password");
		VerifyUser ref=new VerifyUser();
		boolean result=ref.isValid(user, pwd);
		PrintWriter out=res.getWriter();
		HttpSession session=req.getSession();
		session.setMaxInactiveInterval(0);
		session.setAttribute("key", "Value");
		if(result==true)
		{
			out.println("First Servlet valid user");
			//out.print("VALID USER");
			RequestDispatcher rd=req.getRequestDispatcher("viewBalance");
			rd.include(req, res);
		}
		else
		{
			//out.print("INVALID USER");
			res.sendRedirect("invalid.jsp");
		}
	}
}
