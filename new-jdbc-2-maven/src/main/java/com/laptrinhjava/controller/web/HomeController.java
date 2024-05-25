package com.laptrinhjava.controller.web;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjava.model.NewsModel;
import com.laptrinhjava.model.UserModel;
import com.laptrinhjava.service.ICategoryService;
import com.laptrinhjava.service.INewService;
import com.laptrinhjava.service.IUserService;
import com.laptrinhjava.utils.FormUtil;
import com.laptrinhjava.utils.SessionUtil;

/**
 * Servlet implementation class HomeController
 */
@WebServlet(urlPatterns = {"/trang-chu","/dang-nhap","/thoat"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	private ICategoryService categoryService;
	
	@Inject
	private IUserService iUserService;
	    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action != null && action.equals("login")) {
			String message = request.getParameter("message");
			String alert = request.getParameter("alert");
			if(message != null && alert != null) {
				request.setAttribute("message", "username password invalid");
				request.setAttribute("alert", alert);

			}
			RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
			rd.forward(request, response);
		}else if(action != null && action.equals("logout")) {
			SessionUtil.getInstance().removeValue(request, "USERMODEL");
			response.sendRedirect(request.getContextPath()+"/trang-chu");
		}else {
			request.setAttribute("categories", categoryService.findAll());
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp"); 
			rd.forward(request, response);
		}
		
		
        // Khi chay, se chuyen qua file home.jsp		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action != null && action.equals("login")) {
			UserModel model = FormUtil.toModel(UserModel.class, request);
			model = iUserService.findByUserNameAndPasswordAndStatus(model.getUserName(), model.getPassword(), 1);
			if (model != null) {
				SessionUtil.getInstance().putValue(request, "USERMODEL", model);
				if (model.getRole().getCode().equals("USER")) {
					response.sendRedirect(request.getContextPath()+"/trang-chu");
				} else if(model.getRole().getCode().equals("ADMIN")){
					response.sendRedirect(request.getContextPath()+"/admin-home");
				}  
				
			} else {
//					Nếu sai sẽ quay trở lại phần đăng nhập
					response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login&message=username_password_invalid&alert=danger");
				}
		}

	}

}
