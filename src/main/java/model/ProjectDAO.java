package model;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import model.domain.Project;
import util.DAOFactory;

public class ProjectDAO {

	public static ArrayList<Project> getProjectDetail(String menuId) {
		SqlSession session = DAOFactory.getSqlSession(false);
		ArrayList<Project> projectDetail = new ArrayList<Project>();		
		
		try{
			projectDetail = (ArrayList)session.selectList("project.projectListN", menuId);
			
		}finally{
			session.close();
		}
			
		return projectDetail;
	}

}