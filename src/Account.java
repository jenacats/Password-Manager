
public class Account {
    private String firstName;
    private String lastName;
    private String questOne;
    private String questTwo;
    private String questThree;
    private String ansOne;
    private String ansTwo;
    private String ansThree;


    /**
     * Contructs account object
     * Note: Accounts need a minimum of one security question
     * @param firstName First name of user
     * @param lastName Last name of user
     */
    public Account(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Contructs account object with 1 security questions
     *
     * @param firstName First name of user
     * @param lastName Last name of user
     * @param questOne Security question 1
     * @param ansOne Answer to security question 1
     */
    public Account(String firstName, String lastName, String questOne, String ansOne){
        this.firstName = firstName;
        this.lastName = lastName;
        this.questOne = questOne;
        this.ansOne = ansOne;
    }

    /**
     * Contructs account object with 2 security questions
     *
     * @param firstName First name of user
     * @param lastName Last name of user
     * @param questOne Security question 1
     * @param questTwo Security question 2
     * @param ansOne Answer to security question 1
     * @param ansTwo Answer to security question 2
     */
    public Account(String firstName, String lastName, String questOne, String questTwo, String ansOne, String ansTwo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.questOne = questOne;
        this.questTwo = questTwo;
        this.ansOne = ansOne;
        this.ansTwo = ansTwo;
    }

    /**
     * Contructs account object with 3 security questions
     *
     * @param firstName First name of user
     * @param lastName Last name of user
     * @param questOne Security question 1
     * @param questTwo Security question 2
     * @param questThree Security question 3
     * @param ansOne Answer to security question 1
     * @param ansTwo Answer to security question 2
     * @param ansThree Answer to security question 3
     */
    public Account(String firstName, String lastName, String questOne, String questTwo, String questThree, String ansOne, String ansTwo, String ansThree){
        this.firstName = firstName;
        this.lastName = lastName;
        this.questOne = questOne;
        this.questTwo = questTwo;
        this.questThree = questThree;
        this.ansOne = ansOne;
        this.ansTwo = ansTwo;
        this.ansThree = ansThree;
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


}
