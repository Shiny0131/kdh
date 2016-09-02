package model.domain;

public class Aboard {

	private int aNo;
	private String aUserId;
	private String aTitle;
	private String aBody;
	private String aDate;
	private String aSecret;
	private int aCount;
	
	public Aboard() {
		super();
	}

	public Aboard(int aNo, String aUserId, String aTitle, String aBody, String aDate, String aSecret, int aCount) {
		super();
		this.aNo = aNo;
		this.aUserId = aUserId;
		this.aTitle = aTitle;
		this.aBody = aBody;
		this.aDate = aDate;
		this.aSecret = aSecret;
		this.aCount = aCount;
	}
	
	public Aboard(int aNo, String aTitle, String aBody, String aSecret) {
		super();
		this.aNo = aNo;
		this.aTitle = aTitle;
		this.aBody = aBody;
		this.aSecret = aSecret;
	}

	public int getaNo() {
		return aNo;
	}

	public void setaNo(int aNo) {
		this.aNo = aNo;
	}

	public String getaUserId() {
		return aUserId;
	}

	public void setaUserId(String aUserId) {
		this.aUserId = aUserId;
	}

	public String getaTitle() {
		return aTitle;
	}

	public void setaTitle(String aTitle) {
		this.aTitle = aTitle;
	}

	public String getaBody() {
		return aBody;
	}

	public void setaBody(String aBody) {
		this.aBody = aBody;
	}

	public String getaDate() {
		return aDate;
	}

	public void setaDate(String aDate) {
		this.aDate = aDate;
	}

	public String getaSecret() {
		return aSecret;
	}

	public void setaSecret(String aSecret) {
		this.aSecret = aSecret;
	}

	public int getaCount() {
		return aCount;
	}

	public void setaCount(int aCount) {
		this.aCount = aCount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aboard [aNo=");
		builder.append(aNo);
		builder.append(", aUserId=");
		builder.append(aUserId);
		builder.append(", aTitle=");
		builder.append(aTitle);
		builder.append(", aBody=");
		builder.append(aBody);
		builder.append(", aDate=");
		builder.append(aDate);
		builder.append(", aSecret=");
		builder.append(aSecret);
		builder.append(", aCount=");
		builder.append(aCount);
		builder.append("]");
		return builder.toString();
	}
	
}