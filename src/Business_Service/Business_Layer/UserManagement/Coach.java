package Business_Service.Business_Layer.UserManagement;
import Business_Service.Action;
import  Business_Service.Business_Layer.Trace.PersonalPage;
import Business_Service.Business_Layer.Trace.*;
import Business_Service.Business_Layer.Trace.PersonalPage;

public class Coach extends Subscription {
    CoachPersonalPage PersonalPage;
    protected String qualification;

    public void setPersonalPage(CoachPersonalPage personalPage) {
        PersonalPage = personalPage;
    }

    public PersonalPage getPersonalPage() {
        return PersonalPage;
    }

    public Coach(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        // add permissions og the role
        // permissions.add_permissions(1,0)
        PersonalPage = new CoachPersonalPage(arg_user_name);
        permissions.edit_permissions(Action.Upload_personal_page,1);
    }


}