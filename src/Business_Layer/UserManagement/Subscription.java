package Business_Layer.UserManagement;

public abstract class Subscription {
    protected String user_name;
    protected String password;
    protected String name;

    public String getUser_name() {
        return user_name;
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
