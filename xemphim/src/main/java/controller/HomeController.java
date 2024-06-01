package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MovieDao;
import model.Movie;

/**
 * Servlet implementation class HomeController
 */
@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String theLoai1 = "PhimBo";
		String theLoai2 = "PhimLe";
		String theLoai3 = "PhimChieuRap";
		
		MovieDao dao = new MovieDao();
		List<Movie> list1 = dao.findAllByTheLoai(theLoai2);
		List<Movie> list2 = dao.findAllByTheLoai(theLoai3);
		List<Movie> list3 = dao.findAllByTheLoai(theLoai1);
		
		request.setAttribute("movies1", list1);   //Phim le
		request.setAttribute("movies2", list2);   //Phim chiếu rạp
		request.setAttribute("movies3", list3);    // Phim bộ

		RequestDispatcher rd = request.getRequestDispatcher("home.jsp"); 
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
