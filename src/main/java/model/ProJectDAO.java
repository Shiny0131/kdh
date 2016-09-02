package model;

import java.sql.SQLException;
import java.util.ArrayList;

import model.domain.Project;

import org.apache.ibatis.session.SqlSession;

import util.DAOFactory;

public class ProJectDAO {
	
	public static void addPro(Project pro) throws SQLException{
		SqlSession session = DAOFactory.getSqlSession(true);

		try{
			session.insert("project.insert",pro);
		}finally{
			session.close();
		}
	}

	public static ArrayList<Project> listAll() throws SQLException{
		// TODO Auto-generated method stub
		SqlSession session = DAOFactory.getSqlSession();
		ArrayList<Project> temp = new ArrayList<Project>();
		try{
			temp = (ArrayList)session.selectList("project.listAll");
		}finally{
			session.close();
		}
		
		return temp;
	}

	public static Project detailPro(int code) {
		SqlSession session = DAOFactory.getSqlSession();
		Project pro = null;
		
		try{
			pro = (Project)session.selectOne("project.detail",code);
		}finally{
			session.close();
		}
		return pro;
	}

	public static void updatePro(Project pro) {
		// TODO Auto-generated method stub
		SqlSession session = DAOFactory.getSqlSession(true);
		
		try{
			session.insert("project.update",pro);
		}finally{
			session.close();
		}
	}

	public static void delete(int code) {
		SqlSession session = DAOFactory.getSqlSession(true);
		boolean flag = false;
		
		try{
			if(session.insert("project.delete",code)>0){
				flag = true;
			}
		}finally{
			session.close();
		}
	}

	public static Project dupProject(int proCode) {
		
		SqlSession session = DAOFactory.getSqlSession();
		Project pro = null;
		
		try{
			pro = (Project)session.selectOne("project.dupProject",proCode);
		}finally{
			session.close();
		}
		return pro;
	}
	

	

}
