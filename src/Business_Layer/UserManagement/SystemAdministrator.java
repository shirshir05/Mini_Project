package Business_Layer.UserManagement;
import java.util.Observable;
import java.util.Observer;

public class SystemAdministrator extends Subscription implements Observer{

    public SystemAdministrator(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        // add permissions og the role
        // permissions.add_permissions(1,0)
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
