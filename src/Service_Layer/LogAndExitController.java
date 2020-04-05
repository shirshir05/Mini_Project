package Service_Layer;

public class LogAndExitController extends LogicManagement{


    public String Registration(String arg_user_name, String arg_password, String role){
        if(arg_user_name == null || arg_password == null || arg_user_name.equals("") || arg_password.equals("")){
            return "The input is empty.";
        }
        if(arg_password.length() != 5){
            return "The password must contain exactly 5 characters.";
        }
        try {
            int password = Integer.parseInt(arg_password);
            if (contain_subscription(arg_user_name)){
                return "Please select another username because this username exists in the system.";
            }


        }catch (Exception e){
            return "The password must contain only digits.";
        }

        return "Subscription successfully added!";
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
