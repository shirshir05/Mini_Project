package Business_Layer.UserManagement;

import Business_Layer.Trace.PlayerPersonalPage;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Player extends Subscription {
    Business_Layer.Trace.PlayerPersonalPage PersonalPage;
    String role;
    Date birthday;

    public void setPersonalPage(Business_Layer.Trace.PlayerPersonalPage personalPage) {
        PersonalPage = personalPage;
    }

    public Business_Layer.Trace.PersonalPage getPersonalPage() {
        return PersonalPage;
    }

    public Player(String arg_user_name, String arg_password, String player_name) {
        super(arg_user_name, arg_password);
        name=player_name;
        // add permissions og the role
        // permissions.add_permissions(1,0)
        PersonalPage=new PlayerPersonalPage(player_name);
    }
}
