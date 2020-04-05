package Busnies_Servic.Business_Layer.UserManagement;

import Busnies_Servic.Action;
import Busnies_Servic.Business_Layer.Trace.PlayerPersonalPage;
import java.util.Date;

public class Player extends Subscription {
    Busnies_Servic.Business_Layer.Trace.PlayerPersonalPage PersonalPage;
    String role;
    Date birthday;

    public void setPersonalPage(Busnies_Servic.Business_Layer.Trace.PlayerPersonalPage personalPage) {
        PersonalPage = personalPage;
    }

    public Busnies_Servic.Business_Layer.Trace.PersonalPage getPersonalPage() {
        return PersonalPage;
    }

    public Player(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        // add permissions og the role
        // permissions.add_permissions(1,0)
        PersonalPage=new PlayerPersonalPage(arg_user_name);
        permissions.edit_permissions(Action.Upload_personal_page,1);

    }
}
