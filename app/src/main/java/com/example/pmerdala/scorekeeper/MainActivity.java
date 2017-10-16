package com.example.pmerdala.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAGoals;
    private int teamAFouls;
    private int teamACorners;
    private int teamARedCards;
    private int teamAYellowCards;

    private int teamBGoals;
    private int teamBFouls;
    private int teamBCorners;
    private int teamBRedCards;
    private int teamBYellowCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(R.id.corners_a_team,teamACorners);
        display(R.id.fouls_a_team,teamAFouls);
        display(R.id.goals_a_team,teamAGoals);
        display(R.id.red_cards_a_team,teamARedCards);
        display(R.id.yellow_cards_a_team,teamAYellowCards);
        display(R.id.corners_b_team,teamBCorners);
        display(R.id.fouls_b_team,teamBFouls);
        display(R.id.goals_b_team,teamBGoals);
        display(R.id.red_cards_b_team,teamBRedCards);
        display(R.id.yellow_cards_b_team,teamBYellowCards);
    }

    public void addGoalTeamA(View v){
        teamAGoals++;
        display(R.id.goals_a_team,teamAGoals);
    }

    public void addFoulTeamA(View v){
        teamAFouls++;
        display(R.id.fouls_a_team,teamAFouls);
    }
    public void addCornersTeamA(View v){
        teamACorners++;
        display(R.id.corners_a_team,teamACorners);
    }
    public void addYellowCardTeamA(View v){
        teamAYellowCards++;
        display(R.id.yellow_cards_a_team,teamAYellowCards);
    }
    public void addRedCardTeamA(View v){
        teamARedCards++;
        display(R.id.red_cards_a_team,teamARedCards);
    }
    public void addGoalTeamB(View v){
        teamBGoals++;
        display(R.id.goals_b_team,teamBGoals);
    }

    public void addFoulTeamB(View v){
        teamBFouls++;
        display(R.id.fouls_b_team,teamBFouls);
    }
    public void addCornersTeamB(View v){
        teamBCorners++;
        display(R.id.corners_b_team,teamBCorners);
    }
    public void addYellowCardTeamB(View v){
        teamBYellowCards++;
        display(R.id.yellow_cards_b_team,teamBYellowCards);
    }
    public void addRedCardTeamB(View v){
        teamBRedCards++;
        display(R.id.red_cards_b_team,teamBRedCards);
    }
    public void reset(View v){
        teamACorners =0;
        teamAFouls = 0;
        teamAGoals =0;
        teamARedCards=0;
        teamAYellowCards=0;
        teamBCorners =0;
        teamBFouls = 0;
        teamBGoals =0;
        teamBRedCards=0;
        teamBYellowCards=0;
        display(R.id.corners_a_team,teamACorners);
        display(R.id.fouls_a_team,teamAFouls);
        display(R.id.goals_a_team,teamAGoals);
        display(R.id.red_cards_a_team,teamARedCards);
        display(R.id.yellow_cards_a_team,teamAYellowCards);
        display(R.id.corners_b_team,teamBCorners);
        display(R.id.fouls_b_team,teamBFouls);
        display(R.id.goals_b_team,teamBGoals);
        display(R.id.red_cards_b_team,teamBRedCards);
        display(R.id.yellow_cards_b_team,teamBYellowCards);
    }
    private void display(int id, int value){
        TextView view = (TextView) findViewById(id);
        view.setText(""+value);
    }
}
