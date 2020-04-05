package Business_Service.Business_Layer.UserManagement;
import Business_Service.Action;

import java.util.Observable;
import java.util.Observer;

public class SystemAdministrator extends Subscription implements Observer{

    public SystemAdministrator(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        permissions.edit_permissions(Action.Close_team_perpetually,1);
        permissions.edit_permissions(Action.Respond_to_complaints,1);
        permissions.edit_permissions(Action.Removing_Subscriptions,1);
        permissions.edit_permissions(Action.watch_log,1);
        permissions.edit_permissions(Action.Recommendation_system,1);

    }

    public boolean approve_create_team(){


        return true;
    }

    public boolean change_status_team(int status, String name_team){

        return true;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
