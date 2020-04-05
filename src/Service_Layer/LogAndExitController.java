package Service_Layer;

public class LogAndExitController extends LogicManagement{



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
