package Business_Layer.TeamManagement;
import java.util.HashMap;
import java.util.Objects;
import java.util.Observable;
import Business_Layer.Trace.*;
import Business_Layer.UserManagement.*;
import javafx.util.Pair;

import java.util.HashSet;

public class Team extends Observable {

    String Name;
    HashSet<Player> list_Player;
    HashSet<Coach> Coach;
    HashSet<TeamManager> list_TeamManagement;// המנהל קבוצ
    HashSet<TeamOwner> list_TeamOwner; // בעל קבוצה
    Field Field;
    TeamPersonalPage PersonalPage;
    int statue; // 0 - off 1 - on -1 - always close
    HashMap<Integer, Pair<String,Integer>> financial;//Integer  = quarterly

    public Team(String arg_name, Field arg_field ){

    }

    public boolean Edit_player(Player player_add, int add_or_remove ){

        return true;
    }

    public boolean Edit_coach(Coach coach_add, int add_or_remove ){

        return true;
    }

    public boolean Edit_TeamOwner(TeamOwner TeamOwner, int add_or_remove){

        return true;
    }


    public boolean change_status(int status){
        setChanged();
        notifyObservers();
        return true;
    }

    public String getName() {
        return Name;
    }

    public PersonalPage getPersonalPage() {
        return PersonalPage;
    }
}
