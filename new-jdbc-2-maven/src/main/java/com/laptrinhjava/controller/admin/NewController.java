package com.laptrinhjava.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjava.constant.SystemConstant;
import com.laptrinhjava.model.NewsModel;
import com.laptrinhjava.service.ICategoryService;
import com.laptrinhjava.service.INewService;
import com.laptrinhjava.utils.FormUtil;

@WebServlet(urlPatterns = {"/admin-new"})
public class NewController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6658195472366657545L;
	/**
	 * 
	 */
	
	@Inject
	private INewService newService;
	
	@Inject
	private ICategoryService categoryService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		NewsModel model = FormUtil.toModel(NewsModel.class, req);
//		req.setAttribute(SystemConstant.MODEL, model);
//		model.setListResult(newService.findAll());
//		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/new/list.jsp"); 
//		rd.forward(req, resp);
		
		String view = "";
		if(model.getType().equals(SystemConstant.LIST)) {
			model.setListResult(newService.findAll());	
			
			view="/views/admin/new/list.jsp";
			
		}else if(model.getType().equals(SystemConstant.EDIT)) {
			if (model.getId() != null) {
				model = newService.findOne(model.getId());
			}
			req.setAttribute("catogories", categoryService.findAll());
			view = "/views/admin/new/edit.jsp";
		}
		
		req.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = req.getRequestDispatcher(view); 
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
