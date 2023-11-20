package use_case.clear_users;


import java.util.List;

public class ClearOutputData {
    private final List<String> usernames;

    public ClearOutputData(List<String> usernames) {
        this.usernames = usernames;
    }

    public List<String> getUsernames() { return this.usernames; }
}