package com.spokenenglish.spokenenglish.Class;

public class HomeInfo
{
    int Positon;
    String Name;

    public HomeInfo(int positon, String name) {
        Positon = positon;
        Name = name;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public int getPositon()
    {
        return Positon;
    }

    public void setPositon(int positon)
    {
        Positon = positon;
    }
}
