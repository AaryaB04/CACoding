package use_case.clear_users;


import java.util.List;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDAO;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.userDAO = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        List<String> usernames = userDAO.clear();

        ClearOutputData clearOutputData = new ClearOutputData(usernames);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}