package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MovieDao;
import model.Movie;

/**
 * Servlet implementation class MovieController
 */
@WebServlet("/Movie")
public class MovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String maPhim=request.getParameter("maPhim");
//
//		MovieDao dao = new MovieDao();
//		Movie movie = dao.findByMaPhim(maPhim);
//		
//		request.setAttribute("movies", movie);
//		request.getRequestDispatcher("xemphim.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String maPhim=request.getParameter("maPhim");

		MovieDao dao = new MovieDao();
		Movie movie = dao.findByMaPhim(maPhim);
		
		request.setAttribute("movies", movie);
		request.getRequestDispatcher("xemphim.jsp").forward(request, response);
	}

}
