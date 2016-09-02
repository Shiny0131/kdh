package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProJectDAO;
import model.domain.Project;

import org.apache.http.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectCtrl {
	
	@ExceptionHandler(Exception.class)
	public String exceptionProcess(Exception e){
		System.out.println(e.getMessage());
		return "redirect:/fail.jsp?errorMsg=" + e.getMessage();
	}
	
	@RequestMapping(value="addProject.do", method=RequestMethod.POST)
	public ModelAndView addPro(HttpServletRequest request) throws SQLException{
		int proCode = Integer.parseInt(request.getParameter("proCode"));
		String proName = request.getParameter("proName");
		int proNumber = Integer.parseInt(request.getParameter("proNumber"));
		String sDate = request.getParameter("sDate1") +"/" + request.getParameter("sDate2") +"/" + request.getParameter("sDate3");
		String dDate = request.getParameter("dDate1") +"/" + request.getParameter("dDate2") +"/" + request.getParameter("dDate3");
		String description = request.getParameter("description");
		Project pro = new Project(proCode, proName, proNumber, sDate, dDate, description);
		ProJectDAO.addPro(pro);
		ModelAndView mv = new ModelAndView();
		mv.addObject("content", "mainText.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="proList.do", method=RequestMethod.GET)
	public ModelAndView proList() throws SQLException{
		ArrayList<Project> projects = null;
		projects = ProJectDAO.listAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("plist",projects);
		mv.addObject("content", "allpro.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="proInfo.do", method=RequestMethod.GET)
	public ModelAndView proInfo(HttpServletRequest request) throws SQLException{
		Project project = null;
		int code = Integer.parseInt(request.getParameter("proCode"));
		project = ProJectDAO.detailPro(code);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list",project);
		mv.addObject("content", "detailPro.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="proUpdate.do", method=RequestMethod.POST)
	public ModelAndView proUpdate(@ModelAttribute("pro") Project pro) throws SQLException{
		ProJectDAO.updatePro(pro);
		ArrayList<Project> projects = null;
		projects = ProJectDAO.listAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("plist",projects);
		mv.addObject("content", "allpro.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="proDelete.do", method=RequestMethod.GET)
	public ModelAndView proDelete(HttpServletRequest request) throws SQLException{
		int code = Integer.parseInt(request.getParameter("code"));
		ProJectDAO.delete(code);
		ArrayList<Project> projects = null;
		projects = ProJectDAO.listAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("plist",projects);
		mv.addObject("content", "allpro.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="dupProject.do", method=RequestMethod.GET)
	public void dupProject(HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		int proCode = Integer.parseInt(request.getParameter("proCode"));
		Project pro = ProJectDAO.detailPro(proCode);
		PrintWriter out = response.getWriter();
		if(pro == null){
			out.println("등록되지 않은 프로젝트 입니다");
		}else{
			out.println("등록완료된 프로젝트 입니다");
		}
		
	}
}
