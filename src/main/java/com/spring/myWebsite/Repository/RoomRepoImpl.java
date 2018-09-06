package com.spring.myWebsite.Repository;

import com.spring.myWebsite.Model.Room;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RoomRepoImpl implements RoomRepo{

    private static List<Room> rooms = new ArrayList<>();

    public List<Room> getRooms() {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room("Rooms:" + i, "100" + i));
        }

        return rooms;
    }

    @Override
    public Room getRoom(int roomNumber) {
        return null;
    }
}