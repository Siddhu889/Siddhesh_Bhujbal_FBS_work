package p1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/viewBalance")
public class BalanceServlet extends HttpServlet{
      
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		HttpSession ses=req.getSession();
		String localData=(String)ses.getAttribute("key");
		PrintWriter out=res.getWriter();
		out.println("Second servlet");
	}
}
