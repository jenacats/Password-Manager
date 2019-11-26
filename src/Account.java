/**
 * Purpose of this class is to create "user accounts" for the password manger
 * this will allow multiple people to use the password manager on the same computer
 */

public class Account {
    private String firstName;
    private String lastName;
    private String directory;
    private String questOne;
    private String questTwo;
    private String questThree;
    private String ansOne;
    private String ansTwo;
    private String ansThree;

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.directory = "C:/Users/" + System.getProperty("user.name") + "/Documents";

        this.questOne = "";
        this.questTwo = "";
        this.questThree = "";
        this.ansOne = "";
        this.ansTwo = "";
        this.ansThree = "";
    }

    public Account(String firstName, String lastName, String directory) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.directory = directory;

        this.questOne = "";
        this.questTwo = "";
        this.questThree = "";
        this.ansOne = "";
        this.ansTwo = "";
        this.ansThree = "";
    }


    /**
     *
     * @return returns the first name of account holder
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return returns the last name of account holder
     */
    public String getLastName() {
        return lastName;
    }

    public String getDirectory() {
        return directory;
    }

    /**
     *
     * @return returns Security question 1
     */
    public String getQuestOne() {
        return questOne;
    }

    /**
     *
     * @return returns Security question 2
     */
    public String getQuestTwo() {
        return questTwo;
    }

    /**
     *
     * @return returns Security question 3
     */
    public String getQuestThree() {
        return questThree;
    }

    /**
     *
     * @return returns answer to security question 1
     */
    public String getAnsOne() {
        return ansOne;
    }

    /**
     *
     * @return returns answer to security question 2
     */
    public String getAnsTwo() {
        return ansTwo;
    }

    /**
     *
     * @return returns answer to security question 3
     */
    public String getAnsThree() {
        return ansThree;
    }

    /**
     *
     * @param firstName first name of account holder
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @param lastName last name of account holder
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @param questOne new security question
     */
    public void setQuestOne(String questOne) {
        this.questOne = questOne;
    }

    /**
     *
     * @param questTwo new security question
     */
    public void setQuestTwo(String questTwo) {
        this.questTwo = questTwo;
    }

    /**
     *
     * @param questThree new security question
     */
    public void setQuestThree(String questThree) {
        this.questThree = questThree;
    }

    /**
     *
     * @param ansOne new answer to security question
     */
    public void setAnsOne(String ansOne) {
        this.ansOne = ansOne;
    }

    /**
     *
     * @param ansTwo new answer to security question
     */
    public void setAnsTwo(String ansTwo) {
        this.ansTwo = ansTwo;
    }

    /**
     *
     * @param ansThree new answer to security question
     */
    public void setAnsThree(String ansThree) {
        this.ansThree = ansThree;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }
}
