public class Website {
    private String url;
    private String websiteName;
    private String username;
    private String password;
    private String securityQuestion;
    private String securityAnswer;


    public Website() {
        this.url = "";
        this.websiteName = "";
        this.username = "";
        this.password = "";
        this.securityQuestion = "";
        this.securityAnswer = "";
    }

    public Website(String url, String websiteName, String username, String password, String securityQuestion, String securityAnswer) {
        this.url = url;
        this.websiteName = websiteName;
        this.username = username;
        this.password = password;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
    }

    public String getUrl() {
        return url;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSecurityQuestion(){
        return securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

}
