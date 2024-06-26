package com.laptrinhjava.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjava.model.NewsModel;
import com.laptrinhjava.service.INewService;
import com.laptrinhjava.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-admin-new"})
public class NewAPI extends HttpServlet{
	
	@Inject
	private INewService iNewService;

	private static final long serialVersionUID = 5675865316838864718L;	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 ObjectMapper mapper = new ObjectMapper();
		 req.setCharacterEncoding("UTF-8");
		 resp.setContentType("application/json");
		 NewsModel newsModel = HttpUtil.of(req.getReader()).toModel(NewsModel.class);
		 newsModel = iNewService.save(newsModel);
		 mapper.writeValue(resp.getOutputStream(), newsModel);
//		 System.out.println(newsModel);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		NewsModel deleteNew = HttpUtil.of(req.getReader()).toModel(NewsModel.class);
		iNewService.delete(deleteNew.getIds());
		mapper.writeValue(resp.getOutputStream(), "{}");
 
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		NewsModel updateNew = HttpUtil.of(req.getReader()).toModel(NewsModel.class);
		updateNew = iNewService.update(updateNew);
		mapper.writeValue(resp.getOutputStream(), updateNew);
		
	}
}
