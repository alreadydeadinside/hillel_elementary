package hw_2;

import java.util.*;
public class Information {
    private List<String> login;
    private Set<String> mail;
    private Map<String, String> userInfo;
    public Information() {
        login = new ArrayList<>();
        mail = new HashSet<>();
        userInfo = new HashMap<>();
    }
    public List<String> getLogin() {
        return login;
    }
    public void setLogin(List<String> login) {
        this.login = login;
    }
    public Set<String> getMail() {
        return mail;
    }
    public void setMail(Set<String> mail) {
        this.mail = mail;
    }
    public Map<String, String> getUserInfo() {
        return userInfo;
    }
    public void setUserInfo(Map<String, String> userInfo) {
        this.userInfo = userInfo;
    }
}