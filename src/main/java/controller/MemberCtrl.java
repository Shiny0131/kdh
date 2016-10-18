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
			System.out.println(loginUser);
			HttpSession session = request.getSession();
			session.setAttribute("loginSession", loginUser);
			if(loginUser == null) { // 회원이 아닐경우
				mv.setViewName("fail");
			} else { // 회원일경우
				mv.setViewName("index");
				System.out.println(session);
			}
			
		} catch (Exception e) {
			mv.setViewName("fail");
		}
		return mv;
	}
}
