package com.spring.myWebsite.Service;

import com.spring.myWebsite.Model.Room;
import com.spring.myWebsite.Repository.RoomCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomServices {

    private RoomCrudRepo roomCrudRepo;

    @Autowired
    public RoomServiceImpl(RoomCrudRepo roomCrudRepo){
        this.roomCrudRepo = roomCrudRepo;
    }


    @Override
    public List<Room> getAllRooms() {
        List<Room>  rooms = new ArrayList<>();
        this.roomCrudRepo.findAll().forEach(rooms::add);
        return rooms;
    }


    @Override
    public Optional<Room> getRoom(Long id) {
       return roomCrudRepo.findById(id);
    }


    @Override
    public void addRoom(String name, String number) {
        var room = new Room();
        room.setRoomName(name);
        room.setRoomNumber(number);
        roomCrudRepo.save(room);
    }
}

