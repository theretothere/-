public class User {
    private String Name;
    private String IP;
    private String Password;

    public User(String username, String userIP) {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public User(String Name, String IP, String password){
        this.Name = Name;
        this.IP = IP;
        this.Password = Password;
    }
}
