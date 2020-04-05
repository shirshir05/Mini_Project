package Business_Layer.Trace;

import Business_Layer.UserManagement.Fan;
import Business_Layer.UserManagement.Subscription;

public class PersonalPageFactory extends PersonalPage{

    public PersonalPage Create(String page_name, String type){
        if (type.equals("PlayerPersonalPage")) {
            return new PlayerPersonalPage(page_name);
        }

        return null;
    }



}

}
