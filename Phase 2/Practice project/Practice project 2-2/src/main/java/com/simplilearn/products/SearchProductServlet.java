package com.simplilearn.products;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/searchProduct")
public class SearchProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Properties props = new Properties();
		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
		props.load(in);
		int prodID =  Integer.parseInt(request.getParameter("pid"));
		Connection con = DBconfig.getConnection(props);
		if(con!=null){
			try{
				String query = "select * from ecommerce.product where productID=?";
				PreparedStatement stat = con.prepareStatement(query);
				stat.setInt(1, prodID);
				ResultSet rs = stat.executeQuery();
				if(rs!=null){
					while(rs.next()){
						out.print("productID = "+rs.getInt(1)+"<br>"+"brand = "+rs.getString(2)+"<br>"+"<br>"+"value = "+rs.getInt(3)+"<br>");
					}
				}
				else{
					out.print("Failed to fetch data : No such ProductID exists "+prodID);
				}
			}
			catch(SQLException sqe){
				sqe.printStackTrace();
			}
		}else{
			out.print("Failed to Fetch Data");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
