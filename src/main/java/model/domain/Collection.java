package model.domain;

public class Collection {
	
	private String title;
	private String url;
	private int sort;
	private int seq;
	private String createDate;
	private String createId;
	private String updateDate;
	private String updateId;
	private String hideYn;
	
	public Collection() {
		super();
	}

	public Collection(String title, String url, int sort, int seq, String createDate, String createId, String updateDate, String updateId, String hideYn) {
		super();
		this.title = title;
		this.url = url;
		this.sort = sort;
		this.seq = seq;
		this.createDate = createDate;
		this.createId = createId;
		this.updateDate = updateDate;
		this.updateId = updateId;
		this.hideYn = hideYn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public String getHideYn() {
		return hideYn;
	}

	public void setHideYn(String hideYn) {
		this.hideYn = hideYn;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Collection [title=");
		builder.append(title);
		builder.append(", url=");
		builder.append(url);
		builder.append(", sort=");
		builder.append(sort);
		builder.append(", seq=");
		builder.append(seq);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", createId=");
		builder.append(createId);
		builder.append(", updateDate=");
		builder.append(updateDate);
		builder.append(", updateId=");
		builder.append(updateId);
		builder.append(", hideYn=");
		builder.append(hideYn);
		builder.append("]");
		return builder.toString();
	}
	
}