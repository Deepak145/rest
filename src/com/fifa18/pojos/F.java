package com.fifa18.pojos;
public class F
{
    private Matches[] matches;

    private String runnerup;

    private String name;

    private String winner;

    public Matches[] getMatches ()
    {
        return matches;
    }

    public void setMatches (Matches[] matches)
    {
        this.matches = matches;
    }

    public String getRunnerup ()
    {
        return runnerup;
    }

    public void setRunnerup (String runnerup)
    {
        this.runnerup = runnerup;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getWinner ()
    {
        return winner;
    }

    public void setWinner (String winner)
    {
        this.winner = winner;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [matches = "+matches+", runnerup = "+runnerup+", name = "+name+", winner = "+winner+"]";
    }
}