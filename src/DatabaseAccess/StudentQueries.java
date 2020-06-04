package DatabaseAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import StudentBean.StudentBean;

//all methods which communicate with database

public class StudentQueries {
	private Connection connection=null;
	 
	//method to add new student
	
	public void addStudent(StudentBean student){
		String query = "insert into studentDetails values(?,?,?,?,?,?)"; 
		this.connection = ConnectionProvider.getInstance().getConnection();
		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, student.getId());
			stmt.setString(2, student.getName());
			stmt.setString(3, student.getAge());
			stmt.setInt(4, student.getPhyMarks());
			stmt.setInt(5, student.getChemMarks());
			stmt.setInt(6, student.getMathsMarks());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//returns list of student 
	public ArrayList<StudentBean> getStudents(String query){
		this.connection = ConnectionProvider.getInstance().getConnection();
		ArrayList <StudentBean>list = new ArrayList<StudentBean>();
		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				StudentBean student = new StudentBean();
				student.setId(rs.getString(1));
				 student.setName(rs.getString(2));
				 student.setAge(rs.getString(3));
				 student.setPhyMarks(rs.getInt(4));
				 student.setChemMarks(rs.getInt(4));
				 student.setMathsMarks(rs.getInt(4));
				 
				 list.add(student);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
