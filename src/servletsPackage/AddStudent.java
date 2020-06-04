package servletsPackage;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import StudentBean.StudentBean;
import DatabaseAccess.StudentQueries;

@WebServlet("/addNewStudent")

//servlet to add new student

public class AddStudent extends HttpServlet {
 public void doGet(HttpServletRequest request , HttpServletResponse response) {
	 
	 
	 //creating new student with details provided in form
	 StudentBean student = new StudentBean();
	 student.setId(request.getParameter("id"));
	 student.setName(request.getParameter("name"));
	 student.setAge(request.getParameter("age"));
	 student.setPhyMarks(Integer.parseInt(request.getParameter("phyMarks")));
	 student.setChemMarks(Integer.parseInt(request.getParameter("chemMarks")));
	 student.setMathsMarks(Integer.parseInt(request.getParameter("mathsMarks")));
	 
	 
	 //calling studentQuery class methos to add student
	 new StudentQueries().addStudent(student);
	 
	 try {
		response.getWriter().println("student added successfully");
	} catch (IOException e) {
		e.printStackTrace();
	}
 }
}
