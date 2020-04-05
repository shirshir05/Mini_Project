package Business_Service.Business_Layer.UserManagement;
import Business_Service.Action;

import java.util.Observable;
public class Referee extends Subscription{

    protected String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Referee(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        permissions.edit_permissions(Action.Upload_personal_page,1);
        permissions.edit_permissions(Action.watch_game,1);
        permissions.edit_permissions(Action.update_event,1);
    }

    @Override
    public void update(Observable o, Object arg) {
        //do something
    }
}
