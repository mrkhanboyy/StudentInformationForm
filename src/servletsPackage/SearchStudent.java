package servletsPackage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import StudentBean.StudentBean;
import DatabaseAccess.StudentQueries;

@WebServlet("/searchStudent")

//servlet to 
public class SearchStudent extends HttpServlet {
	 public void doGet(HttpServletRequest request , HttpServletResponse response) {
		 String id = null,name =null, age = null;
		
		  id = request.getParameter("id");
		  name = request.getParameter("name");
	      age = request.getParameter("age");
			  
		  
		  
		 ArrayList <StudentBean> list =null; 
				 String query = null;
				 
				 
				 //checking query 
				 if(id.equals("")&&name.equals("")&&age.equals("")) {
					 query="select * from studentDetails";
				 }else {
		 if(!id.equals(null)&&name.equals("")&&age.equals("")) {
			 query ="select * from studentDetails where id = '"+id+"'";
			 
		 }else if(id.equals("")&&!name.equals(null)&&age.equals("")) {
			 query ="select * from studentDetails where  name = '"+name+"'";
			 
		 }else if(id.equals("")&&name.equals("")&&!age.equals(null)) {
			 query ="select * from studentDetails where age = '"+age+"'";
			 
		 }else if(!id.equals(null)&&!name.equals(null)&&age.equals("")) {
			  query ="select * from studentDetails where id = '"+id+"' and name = '"+name+"'";
			  
		 }else if(!id.equals(null)&&name.equals("")&&!age.equals(null)) {
			  query ="select * from studentDetails where id ='"+id+"' and age= '"+age+"'";
			  
		 }else if(id.equals("")&&!name.equals(null)&&!age.equals(null)) {
			  query ="select * from studentDetails where name ='"+name+"' and age= '"+age+"'";
			  
		 }else if(!id.equals(null)&&!name.equals(null)&&!age.equals(null)) {
			 query ="select * from studentDetails where name = '"+name+"' and age = '"+age+"' and id = '"+id+"'";
			 
		 }else if(id.equals("")&&!name.equals(null)&&!age.equals(null)) {
			  query ="select * from studentDetails where name ='"+name+"' and age= '"+age+"'";
			  
		 }
				 }
		 
		 list = new StudentQueries().getStudents(query);
		 
		 PrintWriter writer = null;
		try {
			writer = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 for(StudentBean std : list) {
			 
			 writer.println(std.getId()+"  "+std.getName()+"  "+std.getAge()+"  "+std.getPhyMarks()+"  "+std.getChemMarks()+"  "+std.getMathsMarks()+"<br>");
			 
		 }
	 }
}