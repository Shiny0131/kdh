package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.AboardDAO;
import model.BboardDAO;
import model.MemberDAO;
import model.domain.Aboard;
import model.domain.Bboard;
import model.domain.Member;

@Controller
public class MemberCtrl {
	
	@RequestMapping(value="goLogin.do",method=RequestMethod.GET)
	public ModelAndView goLogin(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping(value="login.do",method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) throws Exception{
		Member loginUser = null;
		ModelAndView mv = new ModelAndView();
		try {
			loginUser = MemberDAO.login(new Member(request.getParameter("userId"),request.getParameter("pw")));
			HttpSession session = request.getSession();
			session.setAttribute("loginSession", loginUser);
			if(loginUser == null){
				mv.setViewName("fail");
			}else{
				Aboard preABoard = null;
				Bboard preBBoard = null;
				int aNo = AboardDAO.getMax();
				int bNo = BboardDAO.getMax();
				preABoard = AboardDAO.aDetail(aNo);
				preBBoard = BboardDAO.bDetail(bNo);
				mv.addObject("preABoard", preABoard);
				mv.addObject("preBBoard", preBBoard);
				mv.setViewName("index");			
			}
		} catch (Exception e) {
			mv.setViewName("fail");
		}
		return mv;
	}
	
	
	@RequestMapping(value="swiftLogin.do",method=RequestMethod.GET)
	public ModelAndView swiftLogin(HttpServletRequest request) throws Exception{
		Member loginUser = null;
		ModelAndView mv = new ModelAndView();
		try {
			loginUser = MemberDAO.login(new Member(request.getParameter("userId"),request.getParameter("pw")));
			HttpSession session = request.getSession();
			session.setAttribute("loginSession", loginUser);
			if(loginUser == null){
				mv.setViewName("swift/swiftFail");
			}else{
				Aboard preABoard = null;
				Bboard preBBoard = null;
				int aNo = AboardDAO.getMax();
				int bNo = BboardDAO.getMax();
				preABoard = AboardDAO.aDetail(aNo);
				preBBoard = BboardDAO.bDetail(bNo);
				mv.addObject("preABoard", preABoard);
				mv.addObject("preBBoard", preBBoard);
				mv.setViewName("swift/swiftIndex");
				System.out.println(loginUser);
			}
		} catch (Exception e) {
			mv.setViewName("swift/swiftFail");
		}
		return mv;
	}
	
	
	@RequestMapping(value="logout.do", method=RequestMethod.GET)
	public String logout(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		session.invalidate();
		return "redirect:/index.jsp";
	}
	
	@RequestMapping(value="insertMember.do", method=RequestMethod.POST)
	public String insertMember(Member member){
		MemberDAO.insertMember(member);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping(value="updateMember.do", method=RequestMethod.POST)
	public String updateMember(HttpServletRequest request){
		Member member = new Member();
		MemberDAO.updateMember(member);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping(value="memberInfo.do", method=RequestMethod.GET)
	public ModelAndView memberInfo(HttpServletRequest request){
		Member user = null;
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("loginSession");
		user = MemberDAO.memberInfo(member.getUserId());
		ModelAndView mv = new ModelAndView();
		mv.addObject("content", "teamInfo.jsp");
		mv.addObject("teamInfo",user);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="deleteMember.do", method=RequestMethod.GET)
	public ModelAndView deleteMember(HttpServletRequest request){
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("loginSession");
		MemberDAO.deleteMember(member.getUserId());
		session.invalidate();
		ModelAndView mv = new ModelAndView();
		mv.addObject("content", "mainText.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="memberList.do", method=RequestMethod.GET)
	public ModelAndView memberList(){
		ArrayList<Member> list = new ArrayList<Member>();
		list = MemberDAO.memberList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("content", "teamList.jsp");
		mv.addObject("teamList",list);
		mv.setViewName("index");
		return mv;
	}
	
/*	@RequestMapping(value="jsonTest.do", produces={"application/json"})
	public ModelAndView jsonTest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("come here");
		//JSONObject list = MemberDAO.memberList();
		ArrayList<Member> list = new ArrayList<Member>();
		list = MemberDAO.memberList();
		System.out.println(list);
		ModelAndView mv = new ModelAndView();
		mv.addObject("memberList", list);
		//mv.setViewName("jsonTest");
		try {
			JSONObject jObject = new JSONObject();
			//jObject.put("userId", )
		} catch (Exception e) {
			System.out.println(e);
		}
		return mv;
	}*/
	@RequestMapping(value="json.do", method=RequestMethod.GET, produces={"application/json"})
	public ModelAndView jsonTest() {
		ModelAndView mv = new ModelAndView();
		ArrayList<Member> member = MemberDAO.memberList();
		JSONArray jArray = new JSONArray();
		JSONObject jObject1 = new JSONObject();
		try {			
			for (int i = 0; i < member.size(); i++) {
				JSONObject jObject2 = new JSONObject();
				jObject2.put("userId", member.get(i).getUserId());
				jObject2.put("name", member.get(i).getName());
				jObject2.put("pw", member.get(i).getPw());
				jArray.add(jObject2);
			}
			jObject1.put("user", jArray);
			mv.addObject("memberList", jObject1);
			mv.setViewName("json");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}

	
	@RequestMapping(value="checkId.do", method=RequestMethod.GET, produces={"application/json"})
	public void checkId(HttpServletRequest request, HttpServletResponse response){
		String userId =  request.getParameter("userId");		
		Member loginUser = null;
		loginUser = MemberDAO.loginCheck(userId);		
		try {
			//하나의 정보를 저장할 JSONObject를 설정
			JSONObject jObject = new JSONObject();
			//데이터를 삽입
			jObject.put("userId", loginUser.getUserId());
			response.getWriter().write(jObject.toString());			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
