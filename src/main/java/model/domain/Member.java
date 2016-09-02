package model.domain;

public class Member {

	private String userId;
	private String pw;
	private String name;
	
	public Member() {
		super();
	}

	public Member(String userId, String pw, String name) {
		super();
		this.userId = userId;
		this.pw = pw;
		this.name = name;
	}

	public Member(String userId, String pw) {
		super();
		this.userId = userId;
		this.pw = pw;
	}
	
	public Member(String name) {
		super();
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [userId=");
		builder.append(userId);
		builder.append(", pw=");
		builder.append(pw);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
}
