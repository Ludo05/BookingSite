package com.spring.myWebsite.Service;

import com.spring.myWebsite.Model.Room;

import java.util.List;
import java.util.Optional;

public interface  RoomServices {

public List<Room> getAllRooms();

public Optional<Room> getRoom(Long id);

public void addRoom(String name, String number);
}
