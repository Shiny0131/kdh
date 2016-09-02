package model.domain;

public class Project {
	private int proCode;
	private String proName;
	private int proNumber;
	private String sDate;
	private String dDate;
	private String description;

	public Project() {
		super();
	}

	public Project(int proCode, String proName, int proNumber, String sDate,
			String dDate, String description) {
		super();
		this.proCode = proCode;
		this.proName = proName;
		this.proNumber = proNumber;
		this.sDate = sDate;
		this.dDate = dDate;
		this.description = description;
	}
	
	public Project(int proCode, String proName, String sDate,
			String dDate, String description) {
		super();
		this.proCode = proCode;
		this.proName = proName;
		this.sDate = sDate;
		this.dDate = dDate;
		this.description = description;
	}

	public int getProCode() {
		return proCode;
	}

	public void setProCode(int proCode) {
		this.proCode = proCode;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProNumber() {
		return proNumber;
	}

	public void setProNumber(int proNumber) {
		this.proNumber = proNumber;
	}

	public String getsDate() {
		return sDate;
	}

	public void setsDate(String sDate) {
		this.sDate = sDate;
	}

	public String getdDate() {
		return dDate;
	}

	public void setdDate(String dDate) {
		this.dDate = dDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Project [proCode=");
		builder.append(proCode);
		builder.append(", proName=");
		builder.append(proName);
		builder.append(", proNumber=");
		builder.append(proNumber);
		builder.append(", sDate=");
		builder.append(sDate);
		builder.append(", dDate=");
		builder.append(dDate);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}

	

}
