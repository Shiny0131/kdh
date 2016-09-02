package model;

import java.util.ArrayList;

import model.domain.Bboard;

import org.apache.ibatis.session.SqlSession;

import util.DAOFactory;

public class BboardDAO {
	
	public static boolean insertB(Bboard bBoard){		
		SqlSession session = DAOFactory.getSqlSession(true);
		boolean result = false;		
		try {
			if(session.insert("bBoard.insertB", bBoard) > 0){
				result = true;
			}
		} finally{
			session.close();
		}
		return result;
	}

	public static void updateB(Bboard bBoard) {		
		SqlSession session = DAOFactory.getSqlSession(true);		
		try {
			session.update("bBoard.updateB", bBoard);
		} finally{
			session.close();	
		}
	}
	
	public static int updateBCount(int bNo) {		
		SqlSession session = DAOFactory.getSqlSession(true);
		int count = 0;
		try {
			session.update("bBoard.updateBCount", bNo);
		} finally{
			session.close();			
		}
		return count;
	}
	
	public static Bboard bDetail(int bNo) {
		SqlSession session = DAOFactory.getSqlSession();
		Bboard bDetail = null;
		try{
			bDetail = session.selectOne("bBoard.bDetail",bNo);
		}finally{
			session.close();
		}		
		return bDetail;
	}

	public static void deleteB(int bNo) {
		SqlSession session = DAOFactory.getSqlSession(true);		
		try{
			session.delete("bBoard.deleteB", bNo);
		}finally{
			session.close();
		}		
	}

	public static ArrayList<Bboard> bList() {
		SqlSession session = DAOFactory.getSqlSession(false);
		ArrayList<Bboard> bList = new ArrayList<Bboard>();		
		try{
			bList = (ArrayList)session.selectList("bBoard.bList");			
		}finally{
			session.close();
		}
		return bList;
	}
	
	public static int getMax(){
		SqlSession session = DAOFactory.getSqlSession(false);
		int result = 0;
		try {
			result = session.selectOne("bBoard.getMax");
		} finally {
			session.close();
		}
		return result;
	}
}