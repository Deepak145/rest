package com.fifa18.pojos;
public class Teams
{
    private String id;

    private String flag;

    private String emojiString;

    private String fifaCode;

    private String name;

    private String emoji;

    private String iso2;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getFlag ()
    {
        return flag;
    }

    public void setFlag (String flag)
    {
        this.flag = flag;
    }

    public String getEmojiString ()
    {
        return emojiString;
    }

    public void setEmojiString (String emojiString)
    {
        this.emojiString = emojiString;
    }

    public String getFifaCode ()
    {
        return fifaCode;
    }

    public void setFifaCode (String fifaCode)
    {
        this.fifaCode = fifaCode;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getEmoji ()
    {
        return emoji;
    }

    public void setEmoji (String emoji)
    {
        this.emoji = emoji;
    }

    public String getIso2 ()
    {
        return iso2;
    }

    public void setIso2 (String iso2)
    {
        this.iso2 = iso2;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", flag = "+flag+", emojiString = "+emojiString+", fifaCode = "+fifaCode+", name = "+name+", emoji = "+emoji+", iso2 = "+iso2+"]";
    }
}