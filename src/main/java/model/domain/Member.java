package model.domain;

public class Member {

	private String userId;
	private String auth;
	private String password;
	private String name;
	private int memberNo;
	private String joinDate;
	
	public Member() {
		super();
	}
	
	public Member(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public Member(String userId, String auth, String password, String name, int memberNo, String joinDate) {
		super();
		this.userId = userId;
		this.auth = auth;
		this.password = password;
		this.name = name;
		this.memberNo = memberNo;
		this.joinDate = joinDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userIid) {
		this.userId = userIid;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [userId=");
		builder.append(userId);
		builder.append(", auth=");
		builder.append(auth);
		builder.append(", password=");
		builder.append(password);
		builder.append(", name=");
		builder.append(name);
		builder.append(", memberNo=");
		builder.append(memberNo);
		builder.append(", joinDate=");
		builder.append(joinDate);
		builder.append("]");
		return builder.toString();
	}
}