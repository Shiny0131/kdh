package model.domain;

import org.springframework.web.multipart.MultipartFile;

public class Bboard {

	private int bNo;
	private String bUserId;
	private String bTitle;
	private String bBody;
	private String bDate;
	private String bSecret;
	private int bCount;
	private MultipartFile bFile;
	private String bFilePath;
	
	public Bboard() {
		super();
	}

	public Bboard(int bNo, String bUserId, String bTitle, String bBody,
			String bDate, String bSecret, int bCount, MultipartFile bFile,
			String bFilePath) {
		super();
		this.bNo = bNo;
		this.bUserId = bUserId;
		this.bTitle = bTitle;
		this.bBody = bBody;
		this.bDate = bDate;
		this.bSecret = bSecret;
		this.bCount = bCount;
		this.bFile = bFile;
		this.bFilePath = bFilePath;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbUserId() {
		return bUserId;
	}

	public void setbUserId(String bUserId) {
		this.bUserId = bUserId;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbBody() {
		return bBody;
	}

	public void setbBody(String bBody) {
		this.bBody = bBody;
	}

	public String getbDate() {
		return bDate;
	}

	public void setbDate(String bDate) {
		this.bDate = bDate;
	}

	public String getbSecret() {
		return bSecret;
	}

	public void setbSecret(String bSecret) {
		this.bSecret = bSecret;
	}

	public int getbCount() {
		return bCount;
	}

	public void setbCount(int bCount) {
		this.bCount = bCount;
	}

	public MultipartFile getbFile() {
		return bFile;
	}

	public void setbFile(MultipartFile bFile) {
		this.bFile = bFile;
	}

	public String getbFilePath() {
		return bFilePath;
	}

	public void setbFilePath(String bFilePath) {
		this.bFilePath = bFilePath;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bboard [bNo=");
		builder.append(bNo);
		builder.append(", bUserId=");
		builder.append(bUserId);
		builder.append(", bTitle=");
		builder.append(bTitle);
		builder.append(", bBody=");
		builder.append(bBody);
		builder.append(", bDate=");
		builder.append(bDate);
		builder.append(", bSecret=");
		builder.append(bSecret);
		builder.append(", bCount=");
		builder.append(bCount);
		builder.append(", bFile=");
		builder.append(bFile);
		builder.append(", bFilePath=");
		builder.append(bFilePath);
		builder.append("]");
		return builder.toString();
	}
	
}