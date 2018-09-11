package com.spring.myWebsite.Model;

import javax.persistence.*;

@Entity
@Table(name = "Room_Table")
public class Room {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;
    @Column(name = "Room_Name")
    public String roomname;
    @Column(name = "Room_Number")
    public String number;

    public Room(){}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomname() {
        return roomname;
    }
    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
