package Service_Layer;

import Business_Layer.UserManagement.Subscription;

import java.util.HashSet;

enum role { Coach, Fan, Guest, Players, Referee, SystemAdministrator, TeamManager, TeamOwner, UnionRepresentative}

public class LogicManagement {

    // A list that keeps all the subscriptions that are currently subscribed to the system
    /* Data base*/
    HashSet<Subscription>  Subscription;

    // Saves the current subscription that is currently being registered to the system
    /* Data base*/
    Subscription Current;

    public LogicManagement(){

        Subscription = new HashSet<>();
        Current = null;
    }

    public Subscription contain_subscription(String arg_user_name){
        for (Subscription  subscription : Subscription) {
            if (subscription.getUser_name().equals(arg_user_name)){
                return subscription;
            }
        }
        return null;
    }

}
