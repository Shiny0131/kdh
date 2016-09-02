package model.domain;

public class Team {
	private String id;
	private String pw;
	private String name;
	private String addr;
	private int proCode;
	private int confirm;

	public Team() {
		super();
	}

	public Team(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public Team(String id, String pw, String name, String addr) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addr = addr;
	}

	public Team(String id, String pw, String name, String addr, int confirm) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addr = addr;
		this.confirm = confirm;
	}

	public Team(String id, String pw, String name, String addr, int proCode,
			int confirm) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addr = addr;
		this.proCode = proCode;
		this.confirm = confirm;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getConfirm() {
		return confirm;
	}

	public void setConfirm(int confirm) {
		this.confirm = confirm;
	}

	public int getProCode() {
		return proCode;
	}

	public void setProCode(int proCode) {
		this.proCode = proCode;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", pw=" + pw + ", name=" + name + ", addr="
				+ addr + ", proCode=" + proCode + ", confirm=" + confirm + "]";
	}

}
