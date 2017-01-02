package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.ProjectDAO;
import model.domain.Project;

@Controller
public class ProjectCtrl {
	
	@RequestMapping(value="getProjectDetail.do", method=RequestMethod.GET, produces={"application/json"})
	public void getImages(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<Project> projectDetail = new ArrayList<Project>();
		String menuId = request.getParameter("menuId");
		projectDetail = ProjectDAO.getProjectDetail(menuId);
		JSONObject jObject = new JSONObject();
		JSONArray jArray = new JSONArray();
		try {
			for (int i = 0; i < projectDetail.size(); i++) {
				JSONObject tempObject = new JSONObject();
				tempObject.put("url", projectDetail.get(i).getUrl().toString());				
				jArray.add(tempObject);
			}
			jObject.put("urls", jArray);
			response.getWriter().write(jObject.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}