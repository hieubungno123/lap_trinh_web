package xemphim.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import xemphim.context.DBContext;

/*
 String maPhim,
 String tenPhim,
 int thoiLuong,
 String linkPhim,
 String moTa,
 String nhaSanXuat,
 String theLoai
 */	

import xemphim.model.Movie;

public class MovieDao {
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet resultSet = null;
	
	public List<Movie> getAllStudent(){
		List<Movie> list = new ArrayList<>();
		String sql = "SELECT * FROM app_movie.movies";
		try {
			connection = new DBContext().getConnection();
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery(); // Bảng kết quả sẽ hiện ra trong DB
			while (resultSet.next()) {
				list.add(new Movie(
						resultSet.getString(1),  // maPhim
						resultSet.getString(2),  // tenPhim
						resultSet.getString(3),     // totalMinutes
						resultSet.getString(4),  // linkPhim
						resultSet.getString(5),  // descriptionMovie
						resultSet.getString(6),  // producer
						resultSet.getString(7)  // genre

						));
			}
			connection.close();
			statement.close();
			resultSet.close();
		}catch (Exception e) {
			return null;
		}
		
		return list;
	}

	public Movie addNewMovie(
			 String maPhim,
			 String tenPhim,
			 String thoiLuong,
			 String linkPhim,
			 String moTa,
			 String nhaSanXuat,
			 String theLoai
			 ) {
		 String sql = "INSERT INTO app_movie.movies"
					+ " values (?,?,?,?,?,?,?)";
		 Movie movie = null;
		 
		 try {
			connection = new DBContext().getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, maPhim);
			statement.setString(2, tenPhim);
			statement.setString(3, thoiLuong);
			statement.setString(4, linkPhim);
			statement.setString(5, moTa);
			statement.setString(6, nhaSanXuat);
			statement.setString(7, theLoai);
			statement.executeUpdate();
			
			movie = new Movie(maPhim, tenPhim,
					thoiLuong, linkPhim,
					moTa,
					nhaSanXuat, theLoai);
			
			connection.close();
			statement.close();
			resultSet.close();
			
		} catch (Exception e) {
			return null;
		}
		 return movie;
	 }
	
	public Movie updateMovie(
			 String maPhim,
			 String tenPhim,
			 String thoiLuong,
			 String linkPhim,
			 String moTa,
			 String nhaSanXuat,
			 String theLoai
			 ) {
		String sql = "UPDATE app_movie.movies SET maPhim='"+maPhim+"', tenPhim='"+tenPhim+"'";
		sql=
		return null;
	}
	
	public Movie deleteMovie(String maPhim) {
		String sql = "DELETE FROM app_movie.movies "
				+ " WHERE maPhim='"+ maPhim +"';";
		Movie movie = null;
		try {
			movie = findByMaPhim(maPhim);
			connection = new DBContext().getConnection();
			statement = connection.prepareStatement(sql);
			statement.executeUpdate();
			
			connection.close();
			statement.close();
			resultSet.close();
		} catch (Exception e) {
			return null;
		}
		return movie;
	}
	
	public Movie findByMaPhim(String maPhim) {
		String sql = " SELECT * FROM app_movie.movies WHERE maPhim ='"+ maPhim +"';";
		Movie movie = null;
		 try {
			connection = new DBContext().getConnection();
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			if(resultSet.next()) {
				movie = new Movie(
						resultSet.getString(1),  // maPhim
						resultSet.getString(2),  // tenPhim
						resultSet.getString(3),     // totalMinutes
						resultSet.getString(4),  // linkPhim
						resultSet.getString(5),  // descriptionMovie
						resultSet.getString(6),  // producer
						resultSet.getString(7)  // genre
						);
			}
			connection.close();
			statement.close();
			resultSet.close();
		} catch (Exception e) {
			return null;
		}
		return movie;
	}
	
	
}
