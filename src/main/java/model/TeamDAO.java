package model;

import java.sql.SQLException;
import java.util.ArrayList;

import model.domain.Team;

import org.apache.ibatis.session.SqlSession;

import util.DAOFactory;

public class TeamDAO {
	
	public static boolean addTeam(Team team){
		
		SqlSession session = DAOFactory.getSqlSession(true);
		boolean result = false;
		
		try {
			if(session.insert("team.insert", team) > 0){
				result = true;
			}
		} finally{
			session.close();			
		}
		return result;
	}

	public static Team login(Team login)throws SQLException{
		SqlSession session = DAOFactory.getSqlSession(false);
		Team loginUser = null;		
		
		try{
			loginUser = (Team)session.selectOne("team.login",login);
			
		}finally{
			session.close();
		}
			
		return loginUser;
	}
	
	public static Team loginCheck(String id)throws SQLException{
		SqlSession session = DAOFactory.getSqlSession(false);
		Team loginUser = null;		
		
		try{
			loginUser = (Team)session.selectOne("team.loginCheck",id);
			
		}finally{
			session.close();
		}
			
		return loginUser;
	}
	
	public static void updateTeam(Team team) {
		
		SqlSession session = DAOFactory.getSqlSession(true);
		
		try {
			session.update("team.update", team);
		} finally{
			session.close();			
		}
	}
	public static Team info(String id) {
		SqlSession session = DAOFactory.getSqlSession();
		Team user = null;
		
		try{
			user = session.selectOne("team.teamInfo",id);
		}finally{
			session.close();
		}
		
		return user;
	}

	public static void deleteTeam(String id) {
		System.out.println("delete!!!");
		SqlSession session = DAOFactory.getSqlSession(true);
		
		try{
			session.delete("team.delete", id);
		}finally{
			session.close();
		}
		
	}

	public static ArrayList<Team> teamList() {
		SqlSession session = DAOFactory.getSqlSession(false);
		ArrayList<Team> teamList = new ArrayList<Team>();		
		
		try{
			teamList = (ArrayList)session.selectList("team.teamList");
			
		}finally{
			session.close();
		}
			
		return teamList;
	}

	public static void confirm(String id) {
		
		SqlSession session = DAOFactory.getSqlSession(true);
		
		try {
			session.update("team.confirm", id);
		} finally{
			session.close();			
		}
	}
	
	/*

	public static boolean delete(String id) throws SQLException{
		// TODO Auto-generated method stub
		
	}

	public static boolean checkID(String id) {
		// TODO Auto-generated method stub
		SqlSession session = DAOFactory.getSqlSession(true);
		boolean result = false;
		
		try {
			if(session.selectOne("user.check", id) != null){
				result = true;
			}
		} finally{
			session.close();			
		}
		
		return result;
	}	*/

	
}
