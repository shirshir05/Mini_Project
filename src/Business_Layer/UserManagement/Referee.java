package Business_Layer.UserManagement;
import java.util.Observable;
import java.util.Observer;
public class Referee extends Subscription implements Observer{

    protected String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Referee(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        // add permissions og the role
        // permissions.add_permissions(1,0)
    }

    @Override
    public void update(Observable o, Object arg) {
        //do something
    }
}
