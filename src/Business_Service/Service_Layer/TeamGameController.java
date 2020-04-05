package Business_Service.Service_Layer;
import Business_Service.Business_Layer.Game.Game;
import Business_Service.Business_Layer.Game.League;
import Business_Service.Business_Layer.TeamManagement.Team;
import Business_Service.Business_Layer.UserManagement.Coach;
import Business_Service.Business_Layer.UserManagement.Player;

import java.time.Year;
import java.util.Date;
import java.util.HashSet;

public class TeamGameController extends LogicManagement{

    HashSet<Team> list_team;
    HashSet<Game> list_game;
    HashSet<League> list_league;


    // add_od_remove int 0 = remove ; 1 = add ; 2 - edit

    public boolean create_game(Date date, String arg_host, String arg_guest, String arg_head, String linesman1, String linesman2){

        return true;
    }

    public boolean Register(String arg_user_to_register){
        Business_Service.Business_Layer.UserManagement.Subscription current_user = this.contain_subscription(arg_user_to_register);
        if (current_user instanceof Coach) {
            ((Coach) current_user).getPersonalPage().addObserver(this.Current);
            return true;
        }
        else if (current_user instanceof Player) {
            ((Player) current_user).getPersonalPage().addObserver(this.Current);
            return true;
        }
        else{
            Team t = findTeam(arg_user_to_register);
            if (t!=null){
                t.getPersonalPage().addObserver(this.Current);
                return true;
            }
        }
        return false;
    }

    private Team findTeam(String arg_user_to_register) {
        for (Team t : list_team){
            if (t.getName().equals(arg_user_to_register))
                return t;
        }
        return null;
    }


    public boolean request_create_team(String arg_name){
        // בדיקה שה-current מורשה ליצור קבוצה
        // שליחת התראה לניצג ההתאחדות איך????????????????
        //
        return true;
    }

    public boolean create_team(String arg_name, String arg_field){
        // צריך לבדוק שיש אישור ליצור קבוצה
        // יצירת קבוצה על ידי פונקציה של TeamOwner
        // להוסיף את הקבוצה לרשימה

        return true;
    }


    public boolean Edit_player(String name_team, String user_name, int add_or_remove ){
        // תקינות שחקן

        return true;
    }

    public boolean Edit_coach(String name_team, String coach_add, int add_or_remove){

        return true;
    }

    public boolean Edit_TeamOwner(String name_team, String TeamOwner, int add_or_remove){
        // permission

        return true;
    }

    public boolean change_status_team(int status, String name_team){


        return true;
    }

    public boolean change_financial(String name_team, String Operation , Integer sum){


        return true;
    }

    public boolean create_league(String name){
        // לוודא כי המשתמש הוא נציג התאחדות

        return true;
    }

    public boolean add_year_league(String name_league, Year year){


        return true;
    }


    public boolean subscription_referee_to_league(String name_league, String name_referee, Year year){

        return true;
    }











}
