package com.spring.myWebsite.Model;

public class Room {

    public String roomname;
    public String number;

    public Room(){}

    public Room(String room, String number) {
        this.roomname = room;
        this.number = number;
    }

    public String getRoom() {
        return roomname;
    }

    public void setRoom(String room) {
        this.roomname = room;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
