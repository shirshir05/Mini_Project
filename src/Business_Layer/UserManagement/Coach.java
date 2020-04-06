package Business_Layer.UserManagement;

import Business_Layer.Trace.CoachPersonalPage;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Observable;
import java.util.Observer;

public class Coach extends Subscription implements Observer {
    CoachPersonalPage PersonalPage;
    protected String qualification;

    public void setPersonalPage(Business_Layer.Trace.CoachPersonalPage personalPage) {
        PersonalPage = personalPage;
    }

    public Business_Layer.Trace.PersonalPage getPersonalPage() {
        return PersonalPage;
    }

    public Coach(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        // add permissions og the role
        // permissions.add_permissions(1,0)
        PersonalPage = new CoachPersonalPage(arg_user_name);
    }

    @Override
    public void update(Observable o, Object arg) {
    }

}