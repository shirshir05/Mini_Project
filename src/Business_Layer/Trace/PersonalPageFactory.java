package Business_Layer.Trace;

import Business_Layer.UserManagement.Fan;
import Business_Layer.UserManagement.Subscription;

public class PersonalPageFactory{

    public PersonalPage Create(String page_name, String type){
        if (type.equals("PlayerPersonalPage")) {
            return new PlayerPersonalPage(page_name);
        }
        else if(type.equals("TeamPersonalPage")) {
            return new TeamPersonalPage(page_name);
        }
        else if(type.equals("CoachPersonalPage")) {
            return new CoachPersonalPage(page_name);
        }
        return null;
    }
}

