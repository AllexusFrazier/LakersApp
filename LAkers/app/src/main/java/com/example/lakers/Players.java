package com.example.lakers;

import android.media.ThumbnailUtils;

public class Players {

    private String PlayersName;
    private String Coach;
    private String KobeBryant;
    private int Thumbnail;

    public Players(String name, String coach, String kobeBryant, int thumbnail){

       PlayersName = name;
       Coach = coach;
       KobeBryant = kobeBryant;
       Thumbnail = thumbnail;

    }

    public String getPlayersName(){

        return PlayersName;
    }
    public String getCoach(){

        return Coach;
    }

    public String getKobeBryant(){

        return KobeBryant;

    }
    public int getThumbnail(){
        return Thumbnail;
    }
}

