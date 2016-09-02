package controller;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.TeamDAO;
import model.domain.Team;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeamCtrl {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionProcess(Exception e){
		ModelAndView mv = new ModelAndView();
		mv.addObject("errorMsg",e.getMessage());
		mv.addObject("content","fail.jsp");
		mv.setViewName("index");
		System.out.println(e.getMessage());
		return mv;
	}
	/*
	@RequestMapping(value="login.do",method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) throws Exception{
		Team loginUser = null;
		loginUser = TeamDAO.login(new Team(request.getParameter("id"),request.getParameter("pw")));
		if(loginUser == null){
			throw new Exception("아이디/비밀번호를 확인해주세요");
		}
		HttpSession session = request.getSession();
		session.setAttribute("loginSession", loginUser);
		ModelAndView mv = new ModelAndView();
		mv.addObject("content", "teamInfo.jsp");
		mv.addObject("teamInfo",loginUser);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="logout.do", method=RequestMethod.GET)
	public String logout(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		session.invalidate();
		return "redirect:/index.jsp";
	}
	
	@RequestMapping(value="addTeam.do", method=RequestMethod.POST)
	public ModelAndView addTeam(@ModelAttribute("add") Team team){
		TeamDAO.addTeam(team);
		ModelAndView mv = new ModelAndView();
		mv.addObject("content", "mainText.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="teamUpdate.do", method=RequestMethod.POST)
	public ModelAndView teamUpdate(@ModelAttribute("teamInfo") Team team){
		TeamDAO.updateTeam(team);
		ModelAndView mv = new ModelAndView();
		mv.addObject("content", "teamInfo.jsp");
		mv.addObject("teamInfo",team);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="teamInfo.do", method=RequestMethod.GET)
	public ModelAndView teamInfo(HttpServletRequest request){
		Team user = null;
		HttpSession session = request.getSession();
		Team team = (Team) session.getAttribute("loginSession");
		user = TeamDAO.info(team.getId());
		ModelAndView mv = new ModelAndView();
		mv.addObject("content", "teamInfo.jsp");
		mv.addObject("teamInfo",user);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="deleteTeam.do", method=RequestMethod.GET)
	public ModelAndView deleteTeam(HttpServletRequest request){
		HttpSession session = request.getSession();
		Team team = (Team) session.getAttribute("loginSession");
		System.out.println(team);
		TeamDAO.deleteTeam(team.getId());
		session.invalidate();
		ModelAndView mv = new ModelAndView();
		mv.addObject("content", "mainText.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="teamList.do", method=RequestMethod.GET)
	public ModelAndView teamList(){
		ArrayList<Team> list = new ArrayList<Team>();
		list = TeamDAO.teamList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("content", "teamList.jsp");
		mv.addObject("teamList",list);
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value="teamConfirm.do", method=RequestMethod.GET)
	public ModelAndView teamConfirm(HttpServletRequest request){
		String id = request.getParameter("id");
		TeamDAO.confirm(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("content", "mainText.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="checkId.do",method=RequestMethod.GET)
	public void checkId(HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		Team loginUser = null;
		loginUser = TeamDAO.loginCheck(id);
		if(loginUser != null){
			out.println("아이디가 존재합니다");
		}else{
			out.println("사용가능한 아이디 입니다");
		}
	}*/
	
}
