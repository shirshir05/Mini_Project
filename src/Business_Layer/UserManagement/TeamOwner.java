package Business_Layer.UserManagement;

import Business_Layer.TeamManagement.Team;
import java.util.Observable;
import java.util.Observer;
import java.util.HashSet;

public class TeamOwner extends Subscription  implements Observer{

    HashSet<Team> list_team;


    public TeamOwner(String arg_user_name, String arg_password) {
        super(arg_user_name, arg_password);
        // add permissions og the role
        // permissions.add_permissions(1,0)
        list_team = new HashSet<>();
    }
/*


    public boolean create_team(Team arg_team, String arg_field){
        // ליצור מגרש
        list_team.add(arg_team);
        return true;
    }


    public boolean Edit_player(String name_team, Player player_add, int add_or_remove ){

        return true;
    }


    public boolean Edit_coach(String name_team, Coach coach_add, int add_or_remove ){
        // if (edit ){
        //

        return true;
    }


    public boolean Edit_TeamOwner(String name_team, TeamOwner TeamOwner, int add_or_remove){

        return true;
    }

    public boolean change_status_team(int status, String name_team){

        return true;
    }

 */
    @Override
    public void update(Observable o, Object arg) {

    }

    public boolean change_financial(String name_team, String Operation , Integer sum){


        return true;
    }

}

