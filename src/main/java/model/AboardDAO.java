package model;

import java.sql.SQLException;
import java.util.ArrayList;

import model.domain.Aboard;
import model.domain.Member;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONObject;

import util.DAOFactory;

public class AboardDAO {
	
	public static boolean insertA(Aboard aBoard){
		
		SqlSession session = DAOFactory.getSqlSession(true);
		boolean result = false;
		
		try {
			if(session.insert("aBoard.insertA", aBoard) > 0){
				result = true;
			}
		} finally{
			session.close();			
		}
		return result;
	}
/*
	public static Member login(Member member)throws SQLException{
		SqlSession session = DAOFactory.getSqlSession(false);
		Member loginUser = null;		
		
		try{
			loginUser = (Member)session.selectOne("aboard.login",member);
			
		}finally{
			session.close();
		}
			
		return loginUser;
	}
	
	public static Member loginCheck(String id){
		SqlSession session = DAOFactory.getSqlSession(false);
		Member loginUser = null;		
		
		try{
			loginUser = (Member)session.selectOne("member.loginCheck",id);
			
		}finally{
			session.close();
		}
			
		return loginUser;
	}
*/	
	public static void updateA(Aboard aBoard) {
		
		SqlSession session = DAOFactory.getSqlSession(true);
		
		try {
			session.update("aBoard.updateA", aBoard);
		} finally{
			session.close();			
		}
	}
	
	public static int updateACount(int aNo) {
		
		SqlSession session = DAOFactory.getSqlSession(true);
		int count = 0;
		try {
			session.update("aBoard.updateACount", aNo);
		} finally{
			session.close();			
		}
		return count;
	}
	
	public static Aboard aDetail(int aNo) {
		SqlSession session = DAOFactory.getSqlSession();
		Aboard aDetail = null;
		try{
			aDetail = session.selectOne("aBoard.aDetail",aNo);
		}finally{
			session.close();
		}
		
		return aDetail;
	}

	public static void deleteA(int aNo) {
		SqlSession session = DAOFactory.getSqlSession(true);
		try{
			session.delete("aBoard.deleteA", aNo);
		}finally{
			session.close();
		}		
	}

	public static ArrayList<Aboard> aList() {
		SqlSession session = DAOFactory.getSqlSession(false);
		ArrayList<Aboard> aList = new ArrayList<Aboard>();		
		
		try{
			aList = (ArrayList)session.selectList("aBoard.aList");
			
		}finally{
			session.close();
		}
			
		return aList;
	}
	
	public static int getMax(){
		SqlSession session = DAOFactory.getSqlSession(false);
		int result = 0;
		try {
			result = session.selectOne("aBoard.getMax");
		} finally {
			session.close();
		}
		return result;
	}
}