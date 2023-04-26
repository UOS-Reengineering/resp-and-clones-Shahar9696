package example.project.GodClassExample;

public class Branch {

    String branchName;
    String openingTime;
    String telephone;

    public Branch(String branchName, String openingTime, String telephone) {
        this.branchName = branchName;
        this.openingTime = openingTime;
        this.telephone = telephone;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public String getTelephone() {
        return telephone;
    }

    public void changeOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public void registerTelephone(String telephone) {
        this.telephone = telephone;
    }

}
