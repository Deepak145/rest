package com.fifa18.pojos;
public class Round_2_loser
{
    private Matches[] matches;

    private String name;

    public Matches[] getMatches ()
    {
        return matches;
    }

    public void setMatches (Matches[] matches)
    {
        this.matches = matches;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [matches = "+matches+", name = "+name+"]";
    }
}