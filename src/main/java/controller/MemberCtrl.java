package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.MemberDAO;
import model.domain.Member;

@Controller
public class MemberCtrl {
	
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) throws Exception {
		Member loginUser = null;
		ModelAndView mv = new ModelAndView();
		try {
			loginUser = MemberDAO.login(new Member(request.getParameter("userId"), request.getParameter("password")));
			HttpSession session = request.getSession();
			session.setAttribute("loginSession", loginUser);
			if(loginUser == null) { // 회원이 아닐경우
				mv.setViewName("fail");
			} else { // 회원일경우
				mv.setViewName("index");
			}
			
		} catch (Exception e) {
			mv.setViewName("fail");
		}
		return mv;
	}
	
	@RequestMapping(value="logout.do", method=RequestMethod.POST)
	public ModelAndView logout(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		ModelAndView mv = new ModelAndView();
		session.invalidate();
		mv.setViewName("index");
		return mv;
	}
}
