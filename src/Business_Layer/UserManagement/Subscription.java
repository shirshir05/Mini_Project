package Business_Layer.UserManagement;

import java.util.HashSet;
import java.util.Objects;

public abstract class Subscription{
    protected String user_name;
    public String password;
    protected String name;
    protected HashSet<String> alerts = new HashSet<>();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void printAlerts(){
        for (String alert : alerts){
            System.out.println(alert);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return Objects.equals(user_name, that.user_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_name);
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    protected Permissions permissions;

    // use case 2
    public Subscription(String arg_user_name, String arg_password){
        permissions = new Permissions();
    }







}
