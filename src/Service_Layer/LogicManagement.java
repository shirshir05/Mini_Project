package Service_Layer;

import Business_Layer.UserManagement.Subscription;

import java.util.HashSet;

public class LogicManagement {

    HashSet<Subscription>  Subscription;
    Subscription Current;
    // מחזיק את האובייקט שכרגע מתנהל עם המערכת
    // בעתיד יהיה צריך הרבה תרדים

    public LogicManagement(){

        Subscription = new HashSet<>();
        Current = null;
    }

}
