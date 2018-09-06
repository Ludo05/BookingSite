package com.spring.myWebsite.Controller;

import com.spring.myWebsite.Model.Room;
import com.spring.myWebsite.Repository.RoomRepo;
import com.spring.myWebsite.Service.RoomServiceImpl;
import com.spring.myWebsite.Service.RoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private RoomServices roomServices;

    @Autowired
    public RoomController(RoomServices roomServices) {
        this.roomServices = roomServices;
    }
    @GetMapping("/allRooms")
    public String getRooms(Model model){

        model.addAttribute("rooms",this.roomServices.getAllRooms());

        return "rooms";
    }
}
