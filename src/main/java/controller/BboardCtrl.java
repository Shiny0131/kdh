package controller;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import model.BboardDAO;
import model.domain.Bboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BboardCtrl {
	
	@RequestMapping(value="insertB.do", method=RequestMethod.POST)
	public ModelAndView insertB(HttpServletRequest request, @ModelAttribute Bboard bBoard){
		ModelAndView mv = new ModelAndView();
		ArrayList<Bboard> list = new ArrayList<Bboard>();
		MultipartFile bFile = bBoard.getbFile();
		if(bFile != null){
			String fileName = bFile.getOriginalFilename();
			bBoard.setbFilePath(fileName);
			try {
				File file = new File("/home/seyoon/www/image/" + fileName);
				bFile.transferTo(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		BboardDAO.insertB(bBoard);
		list = BboardDAO.bList();
		mv.addObject("bBoard",list);
		mv.setViewName("bBoardList");
		return mv;
	}
	
	@RequestMapping(value="goUpdateB.do", method=RequestMethod.POST)
	public ModelAndView goUpdateB(HttpServletRequest request, int bNo){
		Bboard bBoard = BboardDAO.bDetail(bNo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("updateResult", bBoard);
		mv.setViewName("bBoardUpdate");
		return mv;
	}
	
	@RequestMapping(value="updateB.do", method=RequestMethod.POST)
	public ModelAndView updateB(HttpServletRequest request, @ModelAttribute Bboard bBoard){
		ModelAndView mv = new ModelAndView();
		String bSecret = request.getParameter("bSecret");
		if(bSecret == null){		
			bBoard.setbSecret("N");
		}
		MultipartFile bFile = bBoard.getbFile();
		if(bFile != null){
			String fileName = bFile.getOriginalFilename();
			bBoard.setbFilePath(fileName);
			try {
				File file = new File("/home/seyoon/www/image/" + fileName);
				bFile.transferTo(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		BboardDAO.updateB(bBoard);
		ArrayList<Bboard> list = new ArrayList<Bboard>();
		list = BboardDAO.bList();
		mv.addObject("bBoard",list);
		mv.setViewName("bBoardList");
		return mv;
	}
	
	@RequestMapping(value="bDetail.do", method=RequestMethod.GET)
	public ModelAndView aDetail(HttpServletRequest request, int bNo){
		Bboard bBoard = BboardDAO.bDetail(bNo);
		int bBoardCount = BboardDAO.updateBCount(bNo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("bNo",bNo);
		mv.addObject("result", bBoard);
		mv.addObject("aCount", bBoardCount);
		mv.setViewName("bBoardDetail");
		return mv;
	}
	
	@RequestMapping(value="getLatelyB.do", method=RequestMethod.GET)
	public ModelAndView getLately(HttpServletRequest request){
		int bNo = BboardDAO.getMax();
		ModelAndView mv = new ModelAndView();
		Bboard bBoard = BboardDAO.bDetail(bNo);
		mv.addObject("preBBoard", bBoard);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="deleteB.do", method=RequestMethod.POST)
	public ModelAndView deleteA(HttpServletRequest request, int bNo){
		BboardDAO.deleteB(bNo);
		ModelAndView mv = new ModelAndView();
		ArrayList<Bboard> list = new ArrayList<Bboard>();
		list = BboardDAO.bList();
		mv.addObject("bBoard",list);
		mv.setViewName("bBoardList");
		return mv;
	}
	
	@RequestMapping(value="bList.do", method=RequestMethod.GET)
	public ModelAndView bList(){
		ArrayList<Bboard> list = new ArrayList<Bboard>();
		list = BboardDAO.bList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("bBoard",list);
		mv.setViewName("bBoardList");
		return mv;
	}	
}
