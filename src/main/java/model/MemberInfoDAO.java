package model;

import org.apache.ibatis.session.SqlSession;

import model.domain.MemberInfo;
import util.DAOFactory;

public class MemberInfoDAO {
	
	/**
	 * Join Member
	 * @param memberInfo
	 * @return
	 */
	public static boolean insertMemberInfo(MemberInfo memberInfo){
		
		SqlSession session = DAOFactory.getSqlSession(true);
		boolean result = false;
		
		try {
			if(session.insert("memberInfo.insertMemberInfo", memberInfo) > 0){
				result = true;
			}
		} finally{
			session.close();			
		}
		return result;
	}

	/**
	 * Update Member Information
	 * @param member
	 */
	public static void updateMemberInfo(MemberInfo memberInfo) {
		
		SqlSession session = DAOFactory.getSqlSession(true);
		
		try {
			session.update("memberInfo.updateMemberInfo", memberInfo);
		} finally{
			session.close();			
		}
	}
	
	/**
	 * Get Member Information
	 * @param memberNo
	 * @return
	 */
	public static MemberInfo memberInfo(int memberNo) {
		SqlSession session = DAOFactory.getSqlSession();
		MemberInfo user = null;
		
		try{
			user = session.selectOne("memberInfo.getMemberInfo",memberNo);
		}finally{
			session.close();
		}
		
		return user;
	}

	/**
	 * Delete Member
	 * @param id
	 */
	public static void deleteMember(int memberNo) {
		System.out.println("delete!!!");
		SqlSession session = DAOFactory.getSqlSession(true);
		
		try{
			session.delete("memberInfo.deleteMemberInfo", memberNo);
		}finally{
			session.close();
		}		
	}
}