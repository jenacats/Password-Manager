public class Website {
    private String url;
    private String websiteName;
    private int securityLevel; // determines security level of website (0-3) 0 means no extra security questions
    private String username;
    private String password;
    private String questOne;
    private String questTwo;
    private String questThree;
    private String ansOne;
    private String ansTwo;
    private String ansThree;

    /**
     * Constructs website object
     * Security level will be set 0, meaning no extra security questions
     *
     * @param url url of website
     * @param websiteName website name
     * @param username website username
     * @param password website password
     */
    public Website(String url, String websiteName, String username, String password) {
        this.url = url;
        this.websiteName = websiteName;
        this.username = username;
        this.password = password;

        this.securityLevel = 0;
        this.questOne = "";
        this.questTwo = "";
        this.questThree = "";
        this.ansOne = "";
        this.ansTwo = "";
        this.ansThree = "";
    }

    /**
     * Constructs website object
     *
     * @param url url of website
     * @param websiteName website name
     * @param securityLevel security level of website [0 - 3] 0 means no security questions
     * @param username website username
     * @param password website password
     */
    public Website(String url, String websiteName, int securityLevel, String username, String password) {
        this.url = url;
        this.websiteName = websiteName;
        this.username = username;
        this.password = password;


        if (securityLevel >= 0 && securityLevel <=3){
            this.securityLevel = securityLevel;
        } else {
            this.securityLevel = 0;
        }

        this.questOne = "";
        this.questTwo = "";
        this.questThree = "";
        this.ansOne = "";
        this.ansTwo = "";
        this.ansThree = "";
    }


    /**
     *
     * @return returns url of website
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url url of website
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return returns website name
     */
    public String getWebsiteName() {
        return websiteName;
    }

    /**
     *
     * @param websiteName website name
     */
    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    /**
     *
     * @return returns security level of website (0-3)
     */
    public int getSecurityLevel() {
        return securityLevel;
    }

    /**
     *
     * @param securityLevel sets security level of website (0 - 3)
     */
    public void setSecurityLevel(int securityLevel) {
        if (securityLevel >= 0 && securityLevel <=3){
            this.securityLevel = securityLevel;
        } else {
            this.securityLevel = 0;
        }
    }

    /**
     *
     * @return returns website username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username username of website
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return returns password of website
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password password of website
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return returns question 1
     */
    public String getQuestOne() {
        return questOne;
    }

    /**
     * security level must be 1 or greater, if not security level will update automatically
     * question cannot be set to ""
     * @param questOne security question 1
     */
    public void setQuestOne(String questOne) {
        if (!questOne.equals("")){
            if (securityLevel < 1){
                securityLevel = 1;
            }

            this.questOne = questOne;
        }
    }

    /**
     *
     * @return returns question 2
     */
    public String getQuestTwo() {
        return questTwo;
    }

    /**
     * security level must be 2 or greater, if not security level will update automatically
     * question cannot be set to ""
     * @param questTwo security question 2
     */
    public void setQuestTwo(String questTwo) {
        if (!questTwo.equals("")){
            if (securityLevel < 2){
                securityLevel = 2;
            }

            this.questTwo = questTwo;
        }
    }

    /**
     *
     * @return returns question 3
     */
    public String getQuestThree() {
        return questThree;
    }

    /**
     * security level must be 3 or greater, if not security level will update automatically
     * question cannot be set to ""
     * @param questThree security question 3
     */
    public void setQuestThree(String questThree) {
        if (!questTwo.equals("")){
            if (securityLevel < 3){
                securityLevel = 3;
            }

            this.questThree = questThree;
        }
    }

    /**
     *
     * @return answer to question 1
     */
    public String getAnsOne() {
        return ansOne;
    }

    /**
     *
     * @param ansOne answer to question 1
     */
    public void setAnsOne(String ansOne) {
        this.ansOne = ansOne;
    }

    /**
     *
     * @return answer to question 2
     */
    public String getAnsTwo() {
        return ansTwo;
    }

    /**
     *
     * @param ansTwo answer to question 2
     */
    public void setAnsTwo(String ansTwo) {
        this.ansTwo = ansTwo;
    }

    /**
     *
     * @return answer to question 3
     */
    public String getAnsThree() {
        return ansThree;
    }

    /**
     *
     * @param ansThree answer to question 3
     */
    public void setAnsThree(String ansThree) {
        this.ansThree = ansThree;
    }
    
    public String toString(){
        return "Website name: " + websiteName + System.lineSeparator() + "Security level: " + String.valueOf(securityLevel);
    }
}
