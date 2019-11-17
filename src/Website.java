public class Website {
    private String url;
    private String websiteName;
    private int securityLevel;
    private String username;
    private String password;
    private String questOne;
    private String questTwo;
    private String questThree;
    private String ansOne;
    private String ansTwo;
    private String ansThree;

    public Website(String url, String websiteName, int securityLevel, String username, String password) {
        this.url = url;
        this.websiteName = websiteName;
        this.securityLevel = securityLevel;
        this.username = username;
        this.password = password;
    }

    public Website(String url, String websiteName, int securityLevel, String username, String password, String questOne, String ansOne) {
        this.url = url;
        this.websiteName = websiteName;
        this.securityLevel = securityLevel;
        this.username = username;
        this.password = password;
        this.questOne = questOne;
        this.ansOne = ansOne;
    }

    public Website(String url, String websiteName, int securityLevel, String username, String password, String questOne, String questThree, String ansOne, String ansThree) {
        this.url = url;
        this.websiteName = websiteName;
        this.securityLevel = securityLevel;
        this.username = username;
        this.password = password;
        this.questOne = questOne;
        this.questThree = questThree;
        this.ansOne = ansOne;
        this.ansThree = ansThree;
    }

    public Website(String url, String websiteName, int securityLevel, String username, String password, String questOne, String questTwo, String questThree, String ansOne, String ansTwo, String ansThree) {
        this.url = url;
        this.websiteName = websiteName;
        this.securityLevel = securityLevel;
        this.username = username;
        this.password = password;
        this.questOne = questOne;
        this.questTwo = questTwo;
        this.questThree = questThree;
        this.ansOne = ansOne;
        this.ansTwo = ansTwo;
        this.ansThree = ansThree;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQuestOne() {
        return questOne;
    }

    public void setQuestOne(String questOne) {
        this.questOne = questOne;
    }

    public String getQuestTwo() {
        return questTwo;
    }

    public void setQuestTwo(String questTwo) {
        this.questTwo = questTwo;
    }

    public String getQuestThree() {
        return questThree;
    }

    public void setQuestThree(String questThree) {
        this.questThree = questThree;
    }

    public String getAnsOne() {
        return ansOne;
    }

    public void setAnsOne(String ansOne) {
        this.ansOne = ansOne;
    }

    public String getAnsTwo() {
        return ansTwo;
    }

    public void setAnsTwo(String ansTwo) {
        this.ansTwo = ansTwo;
    }

    public String getAnsThree() {
        return ansThree;
    }

    public void setAnsThree(String ansThree) {
        this.ansThree = ansThree;
    }
}
