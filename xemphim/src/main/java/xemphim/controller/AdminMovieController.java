package xemphim.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xemphim.dao.MovieDao;
import xemphim.model.Movie;

/**
 * Servlet implementation class AdminMovieController
 */
@WebServlet(urlPatterns = {"/admin-movie"})

public class AdminMovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminMovieController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if("create".equals(action)) {
			String maphim = request.getParameter("parmaphim");
			String tenphim=request.getParameter("partenphim");
			String thoiluong=request.getParameter("parthoiluong");
			String linkphim=request.getParameter("parlinkphim");
			String mota=request.getParameter("parmota");
			String nhasanxuat=request.getParameter("parnhasanxuat");
			String theloai=request.getParameter("partheloai");
			
			MovieDao dao = new MovieDao();
			Movie movie = dao.addNewMovie(maphim, tenphim, thoiluong, linkphim, mota, nhasanxuat,theloai);
			
//			request.setAttribute("students", sv);
//	        request.getRequestDispatcher("qlsv.jsp").forward(request, response);
		}else if("modify".equals(action)) {
			String maphim = request.getParameter("parmaphim");
			String tenphim=request.getParameter("partenphim");
			String thoiluong=request.getParameter("parthoiluong");
			String linkphim=request.getParameter("parlinkphim");
			String mota=request.getParameter("parmota");
			String nhasanxuat=request.getParameter("parnhasanxuat");
			String theloai=request.getParameter("partheloai");
			
			MovieDao dao = new MovieDao();
			Movie movie = dao.updateMovie(maphim, tenphim, thoiluong, linkphim, mota, nhasanxuat,theloai);
			
//			request.setAttribute("students", sv);
//	        request.getRequestDispatcher("qlsv.jsp").forward(request, response);
		}else if("delete".equals(action)) {
			String maphim = request.getParameter("parmaphim");
			
			MovieDao dao = new MovieDao();
			Movie movie = dao.deleteMovie(maphim);
			
//			request.setAttribute("students", sv);
//	        request.getRequestDispatcher("qlsv.jsp").forward(request, response);
		}
		
	}

}
