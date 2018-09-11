package com.spring.myWebsite.Controller;

import com.spring.myWebsite.Model.Room;
import com.spring.myWebsite.Repository.RoomCrudRepo;
import com.spring.myWebsite.Service.RoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomServices roomServices;
    @Autowired
    private RoomCrudRepo roomCrudRepo;



    @GetMapping("/allRooms")
    public String getRooms(Model model){

        model.addAttribute("rooms",this.roomServices.getAllRooms());

        return "rooms";
    }

    @GetMapping("/add")
    public @ResponseBody String addRoom(@RequestParam String name, @RequestParam String number){

        var room = new Room();
        room.setRoomname(name);
        room.setNumber(number);
        roomCrudRepo.save(room);

        return "Saved!";
    }
}
