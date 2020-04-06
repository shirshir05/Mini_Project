package Business_Layer.Game;

import java.util.HashSet;
import java.util.Observable;
import Business_Layer.TeamManagement.Field;
import Business_Layer.TeamManagement.Team;
import Business_Layer.UserManagement.Referee;
import javafx.util.Pair;

import java.util.Date;

public class Game extends Observable{
    static int game_id=0;
    Field field;
    Date date;
    Team host;
    Team guest;
    Referee head;
    Referee linesman1;
    Referee linesman2;
    Pair<Integer,Integer> score; // Integer[0] = host , Integer[1] = guest
    HashSet<Event> eventList;

    public Game(Field f, Date d, Team h, Team g){
        game_id++;
        field=f;
        date=d;
        host=h;
        guest=g;
        eventList = new HashSet<>();

    }

    public boolean update_score(){

        //update ScoreTable

        return true;
    }

    public boolean update_new_event(){
        System.out.println("Describe the event");



        return true;
    }








}
