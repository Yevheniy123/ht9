package com.company;

class Link
{
    public int iData;
    public String dData;
    public Link next;

    public Link(int id, String dd)
    {
        iData = id;
        dData = dd;
    }

    public Link() {

    }

    public void displayLink()
    {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}
