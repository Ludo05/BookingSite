package com.spring.myWebsite.Repository;

import com.spring.myWebsite.Model.Room;

import java.util.List;

public interface RoomRepo {

    public List<Room> getRooms();

    public Room getRoom(int roomNumber);
}
