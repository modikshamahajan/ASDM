

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SavaServlet
 */
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter pw=response.getWriter();
	
	String name= request.getParameter("name");
	String address= request.getParameter("address");
	int account=Integer.parseInt(request.getParameter("account"));
	String mobile= request.getParameter("mobile");
	double balance= Double.parseDouble(request.getParameter("balance"));
	
	User u = new User();
	u.setName(name);
	u.setAddress(address);
	u.setAccount(account);
	u.setMobile(mobile);
	u.setBalance(balance);
	
	int status = UserDao.save(u);
	if(status>0){  
        pw.print("<p>Record saved successfully!</p>");  
        request.getRequestDispatcher("index.html").include(request, response);  
    }else{  
        pw.println("Sorry! unable to save record");  
    } 
	pw.close();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
