package Service_Layer;

public class LogAndExitController extends LogicManagement{


    /**
     * The purpose of this function is to register the user to the system.
     * The function checks that the user information is correct
     * @param arg_user_name
     * @param arg_password
     * @param arg_role
     * @return comment print to user
     */
    public String Registration(String arg_user_name, String arg_password, String arg_role){
        String check_input = Input_test(arg_user_name,arg_password);
        if( check_input!= null){
            return check_input;
        }
        Role role_enum = return_enum(arg_role);
        if (role_enum == null){
            return "The role does not exist in the system.";
        }
        Subscription.add(factory.Create(arg_user_name,arg_password, role_enum.values().length));
        return "Subscription successfully added!";
    }


    /**
     * The purpose of this function is to check the correctness of the input of the user who
     * wishes to register.
     * Laws:
     * password - only number and length of 5 digits
     * user_name -Unique not empty
     * @param arg_user_name
     * @param arg_password
     * @return comment print to user
     * if return nul the input correct
     */
    private String Input_test(String arg_user_name, String arg_password){
        if(arg_user_name == null || arg_password == null || arg_user_name.equals("") || arg_password.equals("")){
            return "The input is empty.";
        }
        if(arg_password.length() != 5){
            return "The password must contain exactly 5 characters.";
        }
        try {
            int password = Integer.parseInt(arg_password);
            if (contain_subscription(arg_user_name) != null){
                return "Please select another username because this username exists in the system.";
            }
        }catch (Exception e){
            return "The password must contain only digits.";
        }
        return null;
    }




    //יש לבדוק בכל שלב שה-Current עם השם משתמש והסיסמא הנכונים
    public boolean Login(String arg_user_name, String arg_password){
        // בדיקה אם המנוי קיים ואם כן לחבר אותו למערכת
        //עדכון ה-Current
        return true;
    }

    public boolean Exit(String arg_user_name, String arg_password){
        Current = null;

        return true;
    }

    public boolean remove_all_subscription(){
        // צריך לבדוק שהיוזר הוא מנהל מערכת


        return true;
    }



}
