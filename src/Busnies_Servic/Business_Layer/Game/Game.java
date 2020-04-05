package Busnies_Servic.Business_Layer.Game;

import java.util.Observable;

import Busnies_Servic.Business_Layer.TeamManagement.Team;
import Busnies_Servic.Business_Layer.UserManagement.Referee;
import javafx.util.Pair;

import java.util.Date;

public class Game extends Observable{

    Date date;
    Team host;
    Team guest;
    Referee head;
    Referee linesman1;
    Referee linesman2;
    Pair<Integer,Integer> score; // Integer[0] = host , Integer[1] = guest


    public boolean update_score(){

        //update ScoreTable

        return true;
    }

    public boolean create_event(){

        // write to logger
        return true;
    }








}
