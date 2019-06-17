package VO;

public class UserVO {
	private String id, pw, email, admin, name;

    public UserVO(String id, String pw, String email, String admin, String name) {
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.admin = admin;
        this.name = name;
    }

    public UserVO () {}
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdmin() {
        return admin;
    }
    
    public void setAdmin(String admin) {
        this.admin = admin;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
