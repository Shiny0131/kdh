package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.domain.Member;
import model.domain.Member;

import org.apache.ibatis.session.SqlSession;

import util.DAOFactory;

public class MemberDAO {
	
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

	public static Member login(Member member)throws SQLException{
		SqlSession session = DAOFactory.getSqlSession(false);
		Member loginUser = null;		
		
		try{
			loginUser = (Member)session.selectOne("member.login",member);
			
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
	
	public static void updateMember(Member member) {
		
		SqlSession session = DAOFactory.getSqlSession(true);
		
		try {
			session.update("member.updateMember", member);
		} finally{
			session.close();			
		}
	}
	
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

	public static void deleteMember(String id) {
		System.out.println("delete!!!");
		SqlSession session = DAOFactory.getSqlSession(true);
		
		try{
			session.delete("member.deleteMember", id);
		}finally{
			session.close();
		}		
	}

	public static ArrayList<Member> memberList() {
		SqlSession session = DAOFactory.getSqlSession(false);
		ArrayList<Member> memberList = new ArrayList<Member>();		
		
		try{
			memberList = (ArrayList)session.selectList("member.memberList");
			
		}finally{
			session.close();
		}
			
		return memberList;
	}

}