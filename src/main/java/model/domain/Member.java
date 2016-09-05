package model.domain;

public class Member {

	private String id;
	private String auth;
	private String password;
	private String name;
	private int memberNo;
	private String joinDate;
	
	public Member() {
		super();
	}

	public Member(String id, String auth, String password, String name, int memberNo, String joinDate) {
		super();
		this.id = id;
		this.auth = auth;
		this.password = password;
		this.name = name;
		this.memberNo = memberNo;
		this.joinDate = joinDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		builder.append("Member [id=");
		builder.append(id);
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