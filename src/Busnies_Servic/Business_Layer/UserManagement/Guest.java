package Busnies_Servic.Business_Layer.UserManagement;

public class Guest extends Subscription{

    public Guest(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        // add permissions og the role
        // permissions.add_permissions(1,0)
    }
}
