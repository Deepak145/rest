package com.fifa18.pojos;
public class Matches
{
    private String home_result;

    private String matchday;

    private String away_team;

    private String stadium;

    private String name;

    private String[] channels;

    private String finished;

    private String home_team;

    private String date;

    private String type;

    private String away_result;

    public String getHome_result ()
    {
        return home_result;
    }

    public void setHome_result (String home_result)
    {
        this.home_result = home_result;
    }

    public String getMatchday ()
    {
        return matchday;
    }

    public void setMatchday (String matchday)
    {
        this.matchday = matchday;
    }

    public String getAway_team ()
    {
        return away_team;
    }

    public void setAway_team (String away_team)
    {
        this.away_team = away_team;
    }

    public String getStadium ()
    {
        return stadium;
    }

    public void setStadium (String stadium)
    {
        this.stadium = stadium;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String[] getChannels ()
    {
        return channels;
    }

    public void setChannels (String[] channels)
    {
        this.channels = channels;
    }

    public String getFinished ()
    {
        return finished;
    }

    public void setFinished (String finished)
    {
        this.finished = finished;
    }

    public String getHome_team ()
    {
        return home_team;
    }

    public void setHome_team (String home_team)
    {
        this.home_team = home_team;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getAway_result ()
    {
        return away_result;
    }

    public void setAway_result (String away_result)
    {
        this.away_result = away_result;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [home_result = "+home_result+", matchday = "+matchday+", away_team = "+away_team+", stadium = "+stadium+", name = "+name+", channels = "+channels+", finished = "+finished+", home_team = "+home_team+", date = "+date+", type = "+type+", away_result = "+away_result+"]";
    }
}
