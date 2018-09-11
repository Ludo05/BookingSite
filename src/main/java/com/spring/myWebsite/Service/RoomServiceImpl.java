package com.spring.myWebsite.Service;

import com.spring.myWebsite.Model.Room;
import com.spring.myWebsite.Repository.RoomCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

}
