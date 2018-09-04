package com.spring.myWebsite.Controller;

import com.spring.myWebsite.Model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private static List<Room> rooms = new ArrayList<>();

    static {
        for(int i = 0; i < 10; i++){
            rooms.add(new Room("Rooms:" + i,"100"+i));
        }
    }

    @GetMapping("/allRooms")
    public String getRooms(Model model){

        model.addAttribute("rooms",rooms);

        return "rooms";
    }
}
