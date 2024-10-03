package com.salary;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AddSalaryCtrls
 */
@WebServlet("/employee")
public class AddSalaryCtrls extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	 @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        AddSalary sal = new AddSalary();
        sal.setEmployeeName(request.getParameter("name"));
        sal.setEmployeeId(request.getParameter("empId"));
        sal.setHra(Double.parseDouble(request.getParameter("hra")));      
        sal.setDa(Double.parseDouble(request.getParameter("da")));         
        sal.setWd(Double.parseDouble(request.getParameter("wd")));        
        sal.setMa(Double.parseDouble(request.getParameter("ma")));         
        sal.setBonus(Double.parseDouble(request.getParameter("bonus")));    
        sal.setPf(Double.parseDouble(request.getParameter("pf")));        
        sal.setBasicSalary(Double.parseDouble(request.getParameter("basicsalary")));
        
        System.out.println(sal.getEmployeeId());
        System.out.println(sal.getEmployeeName());
        System.out.println(sal.getHra());              
        System.out.println(sal.getDa());               
        System.out.println(sal.getWd());                
        System.out.println(sal.getMa());              
        System.out.println(sal.getBonus());
        System.out.println(sal.getPf());               
        System.out.println(sal.getBasicSalary());
        
        String msg=null;
        
        
        AddSalaryDao dao = new AddSalaryDao();
        try {
			if(dao.addSalary(sal))
			{
				msg = "Salary added successfully!"; 
				response.sendRedirect("successfull.jsp");
			}else {
				msg = "Failed to add salary. Please try again.";
				request.setAttribute("msg",msg);
			    request.getRequestDispatcher("AddSalary.jsp").forward(request, response);
			}
			System.out.println(msg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	
        }
        
      
    }
