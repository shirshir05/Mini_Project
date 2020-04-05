package Business_Layer.UserManagement;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;

public class Fan extends Subscription implements Observer{

    HashSet<Complaint> list_complaint;


    public boolean add_complaint(Complaint Complaint){


        return true;
    }


    public Fan(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        // add permissions og the role
        // permissions.add_permissions(1,0)
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
