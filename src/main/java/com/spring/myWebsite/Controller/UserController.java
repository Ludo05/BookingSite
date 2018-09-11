package com.spring.myWebsite.Controller;

import com.spring.myWebsite.Model.User;
import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

 //   @GetMapping(name = "/addMe")
    @RequestMapping(name = "/addMe",method = RequestMethod.GET)
    public String addUser(Model model){
        model.addAttribute("user",new User());
        return "user";
    }
    //   @PostMapping(name = "/addMe")
    @RequestMapping(name = "/addMe",method = RequestMethod.POST)
    public String showUser(@ModelAttribute User user){
        return "result";
    }
}
