package model;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import model.domain.Member;
import util.DAOFactory;

public class MemberDAO {
	
	/**
	 * Join Member
	 * @param member
	 * @return
	 */
	public static boolean insertMember(Member member){
		
		SqlSession session = DAOFactory.getSqlSession(true);
		boolean result = false;
		
		try {
			if(session.insert("member.insertMember", member) > 0){
				result = true;
			}
		} finally{
			session.close();			
		}
		return result;
	}

	/**
	 * Login
	 * @param member
	 * @return
	 * @throws SQLException
	 */
	public static Member login(Member member)throws SQLException{
		SqlSession session = DAOFactory.getSqlSession(false);
		Member loginUser = null;		
		
		try{
			loginUser = (Member)session.selectOne("member.login", member);
			
		}finally{
			session.close();
		}
			
		return loginUser;
	}
	
	/**
	 * Login Check
	 * @param id
	 * @return
	 */
	public static Member loginCheck(String id){
		SqlSession session = DAOFactory.getSqlSession(false);
		Member loginUser = null;		
		
		try{
			loginUser = (Member)session.selectOne("member.loginCheck", id);
			
		}finally{
			session.close();
		}
			
		return loginUser;
	}
	
	/**
	 * Update Member Information
	 * @param member
	 */
	public static void updateMember(Member member) {
		
		SqlSession session = DAOFactory.getSqlSession(true);
		
		try {
			session.update("member.updateMember", member);
		} finally{
			session.close();			
		}
	}
	
	/**
	 * Get Member Information
	 * @param id
	 * @return
	 */
	public static Member memberInfo(String id) {
		SqlSession session = DAOFactory.getSqlSession();
		Member user = null;
		
		try{
			user = session.selectOne("member.memberInfo",id);
		}finally{
			session.close();
		}
		
		return user;
	}

	/**
	 * Delete Member
	 * @param id
	 */
	public static void deleteMember(String id) {
		System.out.println("delete!!!");
		SqlSession session = DAOFactory.getSqlSession(true);
		
		try{
			session.delete("member.deleteMember", id);
		}finally{
			session.close();
		}		
	}

	/*public static ArrayList<Member> memberList() {
		SqlSession session = DAOFactory.getSqlSession(false);
		ArrayList<Member> memberList = new ArrayList<Member>();		
		
		try{
			memberList = (ArrayList)session.selectList("member.memberList");
			
		}finally{
			session.close();
		}
			
		return memberList;
	}*/

}