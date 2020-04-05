package Business_Layer.UserManagement;
import java.util.Observable;
import java.util.Observer;

public class TeamManager extends Subscription  implements Observer{



    public TeamManager(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        // add permissions og the role
        // permissions.add_permissions(1,0)
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
