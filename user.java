public class user {
    private int trustFactor;
    private String name;
    private int State;

    public void setState(int State) {
        this.State = State;
    }

    public int getState() {
        return State;
    }
    public int getTrustFactor() {
        return trustFactor;
    }

    public String getName() {
        return name;
    }

    public user() {
        trustFactor = 0;
        name = "none";
        State = -1;
    }

    public user(String name, int trustFactor) {
        this.name = name;
        this.trustFactor = trustFactor;
        State = -1;
    }

    public void setTrustFactor(int trustFactor) {
        this.trustFactor = trustFactor;
    }

    public void setName(String name) {
        this.name = name;
    }
}
