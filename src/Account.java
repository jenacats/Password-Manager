public class Account {
    private String firstName;
    private String lastName;
    private String questOne;
    private String questTwo;
    private String questThree;
    private String ansOne;
    private String ansTwo;
    private String ansThree;

    public Account(String firstName, String lastName, String questOne, String ansOne){
        this.firstName = firstName;
        this.lastName = lastName;
        this.questOne = questOne;
        this.ansOne = ansOne;
    }

    public Account(String firstName, String lastName, String questOne, String questTwo, String ansOne, String ansTwo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.questOne = questOne;
        this.questTwo = questTwo;
        this.ansOne = ansOne;
        this.ansTwo = ansTwo;
    }

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getQuestOne() {
        return questOne;
    }

    public String getQuestTwo() {
        return questTwo;
    }

    public String getQuestThree() {
        return questThree;
    }

    public String getAnsOne() {
        return ansOne;
    }

    public String getAnsTwo() {
        return ansTwo;
    }

    public String getAnsThree() {
        return ansThree;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setQuestOne(String questOne) {
        this.questOne = questOne;
    }

    public void setQuestTwo(String questTwo) {
        this.questTwo = questTwo;
    }

    public void setQuestThree(String questThree) {
        this.questThree = questThree;
    }

    public void setAnsOne(String ansOne) {
        this.ansOne = ansOne;
    }

    public void setAnsTwo(String ansTwo) {
        this.ansTwo = ansTwo;
    }

    public void setAnsThree(String ansThree) {
        this.ansThree = ansThree;
    }

    
}
