package Business_Layer.UserManagement;

import Business_Layer.Trace.PersonalPage;

import java.util.Date;

public class Player extends Subscription{
    Business_Layer.Trace.PersonalPage PersonalPage;

    String role;
    Date birthday;

    public void setPersonalPage(Business_Layer.Trace.PersonalPage personalPage) {
        PersonalPage = personalPage;
    }

    public Business_Layer.Trace.PersonalPage getPersonalPage() {
        return PersonalPage;
    }

    public Player(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        // add permissions og the role
        // permissions.add_permissions(1,0)
    }


}
