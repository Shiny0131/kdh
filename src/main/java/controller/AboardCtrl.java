package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import model.AboardDAO;
import model.BboardDAO;
import model.domain.Aboard;
import model.domain.Bboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboardCtrl {
		
	@RequestMapping(value="insertA.do", method=RequestMethod.POST)
	public ModelAndView insertA(HttpServletRequest request, Aboard aBoard){
		ModelAndView mv = new ModelAndView();
		String aSecret = request.getParameter("aSecret");
		if(aSecret == null){
			aBoard.setaSecret("N");
		}
		ArrayList<Aboard> list = new ArrayList<Aboard>();
		AboardDAO.insertA(aBoard);
		list = AboardDAO.aList();
		mv.addObject("aBoard",list);
		mv.setViewName("aBoardList");
		return mv;
	}
	
	@RequestMapping(value="goUpdateA.do", method=RequestMethod.POST)
	public ModelAndView goUpdateA(HttpServletRequest request, int aNo){
		Aboard aBoard = AboardDAO.aDetail(aNo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("updateResult", aBoard);
		mv.setViewName("aBoardUpdate");
		return mv;
	}
	
	@RequestMapping(value="updateA.do", method=RequestMethod.POST)
	public ModelAndView updateA(HttpServletRequest request, @ModelAttribute Aboard aBoard){
		ModelAndView mv = new ModelAndView();
		String aSecret = request.getParameter("aSecret");
		if(aSecret == null){
			aSecret = "N";
			aBoard.setaSecret(aSecret);
		} else {
			aSecret = "Y";
			aBoard.setaSecret(aSecret);
		}
		AboardDAO.updateA(aBoard);
		ArrayList<Aboard> list = new ArrayList<Aboard>();
		list = AboardDAO.aList();
		mv.addObject("aBoard",list);
		mv.setViewName("aBoardList");
		return mv;
	}
	
	@RequestMapping(value="aDetail.do", method=RequestMethod.GET)
	public ModelAndView aDetail(HttpServletRequest request, int aNo){
		Aboard aBoard = AboardDAO.aDetail(aNo);
		int aBoardCount = AboardDAO.updateACount(aNo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("aNo",aNo);
		mv.addObject("result", aBoard);
		mv.addObject("aCount", aBoardCount);
		mv.setViewName("aBoardDetail");
		return mv;
	}
	
	
	@RequestMapping(value="getLatelyA.do", method=RequestMethod.GET)
	public ModelAndView getLately(HttpServletRequest request){
		int aNo = AboardDAO.getMax();
		int bNo = BboardDAO.getMax();
		ModelAndView mv = new ModelAndView();
		Aboard aBoard = AboardDAO.aDetail(aNo);
		Bboard bBoard = BboardDAO.bDetail(bNo);
		mv.addObject("preABoard", aBoard);
		mv.addObject("preBBoard", bBoard);
		mv.setViewName("index");
		return mv;
	}
	
	
	@RequestMapping(value="deleteA.do", method=RequestMethod.POST)
	public ModelAndView deleteA(HttpServletRequest request, int aNo){
		AboardDAO.deleteA(aNo);
		ModelAndView mv = new ModelAndView();
		ArrayList<Aboard> list = new ArrayList<Aboard>();
		list = AboardDAO.aList();
		mv.addObject("aBoard",list);
		mv.setViewName("aBoardList");
		return mv;
	}
	
	@RequestMapping(value="aList.do", method=RequestMethod.GET)
	public ModelAndView aList(){
		ArrayList<Aboard> list = new ArrayList<Aboard>();
		list = AboardDAO.aList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("aBoard",list);
		mv.setViewName("aBoardList");
		return mv;
	}	
}
