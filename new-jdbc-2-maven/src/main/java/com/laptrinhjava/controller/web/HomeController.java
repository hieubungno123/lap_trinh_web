package com.laptrinhjava.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjava.model.NewsModel;
import com.laptrinhjava.service.ICategoryService;
import com.laptrinhjava.service.INewService;

/**
 * Servlet implementation class HomeController
 */
@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	private ICategoryService categoryService;
    
	@Inject
	private INewService newService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		UserModel model = new UserModel();
//		model.setFullName("Hieu");
//		request.setAttribute("model", model);  //Đây là nơi gán biến đê trả ra ngoài 
		
//		String title = "bai viet 4";
//		String content = "bai viet 4";
//		Long categoryId = 1L;
//		NewsModel newsModel = new NewsModel();
//		newsModel.setTitle(title);
//		newsModel.setContent(content);
//		newsModel.setCategoryId(categoryId);
//		newService.save(newsModel);
		
//		Long id = 1L;
//		newService.delete(id);
		
//		Long id = 2L;
//		String title = "hieu";
//		String content = "hieu";
//		Long categoryId = 3L;
//		NewsModel newsModel = new NewsModel();
//		newsModel.setTitle(title);
//		newsModel.setContent(content);
//		newsModel.setCategoryId(categoryId);
//		newService.update(newsModel, id);
		
		request.setAttribute("categories", categoryService.findAll());
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp"); 
		rd.forward(request, response);
        // Khi chay, se chuyen qua file home.jsp		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
