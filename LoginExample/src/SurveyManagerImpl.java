import pojo.Role;

import java.util.HashSet;
import java.util.Set;

public class SurveyManagerImpl implements SurveyManager {

    private final Set<Survey> surveys;
    private final ApplicationUser applicationUser;

    public SurveyManagerImpl(ApplicationUser applicationUser) {
        this.surveys = new HashSet<>();
        this.applicationUser = applicationUser;
    }

    @Override
    public Survey createSurvey(String text) {
        if (applicationUser.getAuthenticatedUser().getRole().equals(Role.ADMIN) ||
                applicationUser.getAuthenticatedUser().getRole().equals(Role.EDITOR)) {
            Survey survey = new Survey(applicationUser.getAuthenticatedUser(), text);
            surveys.add(survey);
            return survey;
        } else {
            return null;
        }
    }

    @Override
    public String showAllSurveys() {
        return surveys.toString();
    }
}
