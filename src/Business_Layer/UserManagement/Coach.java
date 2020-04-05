package Business_Layer.UserManagement;

import Business_Layer.Trace.PersonalPage;

public class Coach extends Subscription {
    PersonalPage PersonalPage;
    protected String qualification;

    public void setPersonalPage(Business_Layer.Trace.PersonalPage personalPage) {
        PersonalPage = personalPage;
    }

    public Business_Layer.Trace.PersonalPage getPersonalPage() {
        return PersonalPage;
    }

    public Coach(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        // add permissions og the role
        // permissions.add_permissions(1,0)
        PersonalPage = new PersonalPage();
    }
}