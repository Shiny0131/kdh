package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.ProjectMenuDAO;
import model.domain.ProjectMenu;

@Controller
public class ProjectMenuCtrl {
	
	@RequestMapping(value="getMenu.do", method=RequestMethod.GET)
	public ModelAndView getProjectMenu(HttpServletRequest request) {
		ArrayList<ProjectMenu> menuList = new ArrayList<ProjectMenu>();
		ModelAndView mv = new ModelAndView();
		menuList = ProjectMenuDAO.getMenuListN();
		mv.addObject("menuList", menuList);
		mv.setViewName("project");
		return mv;
	}
	
	@RequestMapping(value="getDetailProject.do", method=RequestMethod.POST)
	public ModelAndView getDetailProject(HttpServletRequest request, String menuId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("project/"+menuId);
		return mv;
	}
	
}
