package com.spring.myWebsite.Controller;

import com.spring.myWebsite.Model.Room;
import com.spring.myWebsite.Repository.RoomCrudRepo;
import com.spring.myWebsite.Service.RoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

        this.roomServices.addRoom(name,number);

        return "Saved!";
    }

    @RequestMapping(name = "/getRoom/{id}", method = RequestMethod.GET)
    public @ResponseBody  String getRoom(@PathVariable Long id){

        this.roomServices.getRoom(id);
        if(roomServices.getRoom(id).isPresent()) {
            return "Found!! :)";
        }
        return "Not Found :(";
    }
}
