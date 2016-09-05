package model.domain;

public class MemberInfo {
	private String memberNo;
	private String phone1;
	private String phone2;
	private String address1;
	private String address2;
	private int postNo;
	
	public MemberInfo() {
		super();
	}

	public MemberInfo(String memberNo, String phone1, String phone2, String address1, String address2, int postNo) {
		super();
		this.memberNo = memberNo;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.address1 = address1;
		this.address2 = address2;
		this.postNo = postNo;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberInfo [memberNo=");
		builder.append(memberNo);
		builder.append(", phone1=");
		builder.append(phone1);
		builder.append(", phone2=");
		builder.append(phone2);
		builder.append(", address1=");
		builder.append(address1);
		builder.append(", address2=");
		builder.append(address2);
		builder.append(", postNo=");
		builder.append(postNo);
		builder.append("]");
		return builder.toString();
	}	
}