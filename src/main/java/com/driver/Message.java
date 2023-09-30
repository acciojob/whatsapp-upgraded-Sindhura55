package com.driver;

import java.util.Date;

public class Message {
    private int id;
    private String content;
    private Date timestamp;

    public Message(){

    }
    public Message(int id,String content){
        this.id=id;
        this.content=content;
    }
    public int getId()
    {
        return this.id;
    }
    public int setId()
    {
        return this.id;
    }
    public String content(String content)
    {
       this.content=content;
        return content;
    }
    public Date getTimestamp()
    {
        return this.timestamp;
    }
    public void setTimestamp(Date timestamp)
    {
        this.timestamp = timestamp;
    }

}
