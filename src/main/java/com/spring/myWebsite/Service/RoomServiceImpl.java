package com.spring.myWebsite.Service;

import com.spring.myWebsite.Model.Room;
import com.spring.myWebsite.Repository.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomServices {

    private RoomRepo roomRepo;

    @Autowired
    public RoomServiceImpl(RoomRepo roomRepo){
        this.roomRepo = roomRepo;
    }


    @Override
    public List<Room> getAllRooms() {

        return roomRepo.getRooms();

    }

}
