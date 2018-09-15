package com.spring.myWebsite.Model;

import javax.persistence.*;

@Entity
@Table(name = "Room_Table")
public class Room {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;
    @Column(name = "Room_Name")
    public String roomName;
    @Column(name = "Room_Number")
    public String roomNumber;

    public Room(){}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
