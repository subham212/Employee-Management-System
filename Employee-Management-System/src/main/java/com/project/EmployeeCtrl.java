package com.project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.EmployeeDao;

@WebServlet("/login")
public class EmployeeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    Employee emp = new Employee();
		emp.setUsername(request.getParameter("username"));
		emp.setPassword(request.getParameter("password"));
		EmployeeDao Dao = new EmployeeDao();
		if("subham".equals(emp.getUsername()) && "1234".equals(emp.getPassword())){
			
			response.sendRedirect("home.jsp");
			}
			else {
				System.out.println("not found");
				{
			}
		}

		
		
		
	}

}
