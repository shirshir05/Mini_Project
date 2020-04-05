package Business_Layer.UserManagement;

// implement factory
public class SubscriptionFactory {



    public Subscription Create(String arg_user_name, String arg_password, String role){
        if(role.equals("fan")){
            return new Fan(arg_user_name,arg_password);
        }
        else if (role.equals("TeamManger")){

        }
        //...........


        return null;
    }



}
