package interface_adapter.clear_users;


import java.util.List;

public class ClearState {
    private List<String> usernames;
    public ClearState(List<String> usernames) { this.usernames = usernames; }
    public ClearState(){}
    public List<String> getUsernames() { return this.usernames; }
    public void setUsernames(List<String> usernames) { this.usernames = usernames; }
}