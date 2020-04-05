package Business_Layer.UserManagement;

import Business_Layer.Trace.CoachPersonalPage;

public class Coach extends Subscription {
    CoachPersonalPage PersonalPage;
    protected String qualification;

    public void setPersonalPage(Business_Layer.Trace.CoachPersonalPage personalPage) {
        PersonalPage = personalPage;
    }

    public Business_Layer.Trace.PersonalPage getPersonalPage() {
        return PersonalPage;
    }

    public Coach(String arg_user_name, String arg_password, String coach_name) {
        super(arg_user_name, arg_password);
        name=coach_name;
        // add permissions og the role
        // permissions.add_permissions(1,0)
        PersonalPage = new CoachPersonalPage(coach_name);
    }
}