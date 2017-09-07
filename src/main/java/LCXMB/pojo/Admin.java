package LCXMB.pojo;

public class Admin {
    private String admin;

    private String password;

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin == null ? null : admin.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Admin(String admin, String password) {
        this.admin = admin;
        this.password = password;
    }

    public Admin() {
    }
}