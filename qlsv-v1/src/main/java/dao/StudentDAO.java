package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.BDContext;
import entity.Student;

// Tương tác với DB
public class StudentDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<Student> getAllStudent(){
		List<Student> list = new ArrayList<>();
		String query = " SELECT * FROM qlsv.student ";
		try {
			conn = new BDContext().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery(); // Bảng kết quả sẽ hiện ra trong DB
			while (rs.next()) {
				list.add(new Student(rs.getString(1),
						rs.getString(2),
						rs.getInt(3), 
						rs.getDate(4)
						));
			}
			conn.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
