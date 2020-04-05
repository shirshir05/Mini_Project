package Business_Layer.UserManagement;

import java.util.HashMap;

public class Permissions {

    HashMap<String,Integer> list_Permissions;
    // יש להשלים את כל ההשראו הקיימות ואת הסדר שלהם ולעדכן את חברי הקבוצה
    // Integer[0] = 1 (למשל מיקום 1 שווה מינוי שופט)
    //Integer[1] = 0 (אין הרשאה) , 1 (יש הרשאה)
    // 2

    public Permissions(){
        // אתחול כאפס על הכל
    }

    public void setList_Permissions(HashMap<String, Integer> list_Permissions) {
        this.list_Permissions = list_Permissions;
    }

    public HashMap<String, Integer> getList_Permissions() {
        return list_Permissions;
    }

    // arg_1 = Integer[0]
    // arg_2 = Integer[1]
    public boolean add_permissions(Integer arg_1, Integer arg_2){



        return true;
    }

    // arg_1 = Integer[0]
    // arg_2 = Integer[1]
    public boolean remove_permissions(Integer arg_1, Integer arg_2){



        return true;
    }


}
