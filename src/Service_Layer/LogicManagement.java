package Service_Layer;

import Business_Layer.UserManagement.Subscription;

import java.util.HashSet;

enum Role { Coach, Fan, Guest, Players, Referee, SystemAdministrator, TeamManager, TeamOwner, UnionRepresentative}

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
    protected int return_enum(String arg_role){
        Role enum_role =  Role.valueOf(arg_role);
        switch (enum_role) {
            case Coach:
                return 0;
            case Fan:
                return 1;
            case Guest:
                return 2;
            case Players:
                return 3;
            case Referee:
                return 4;
            case SystemAdministrator:
                return 5;
            case TeamManager:
                return 6;
            case TeamOwner:
                return 7;
            case UnionRepresentative:
                return 8;
            default:
                return -1;
        }
    }

}
