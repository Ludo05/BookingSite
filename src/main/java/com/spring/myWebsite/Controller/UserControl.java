package com.spring.myWebsite.Controller;

import com.spring.myWebsite.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserControl {

    //   @GetMapping(name = "/addMe")
    @RequestMapping(name = "/addMe",method = RequestMethod.GET)
    public String UserForm(Model model){
        model.addAttribute("user",new User());
        return "user";
    }
    //   @PostMapping(name = "/addMe")
    @RequestMapping(name = "/addMe",method = RequestMethod.POST)
    public String UserSubmit(@ModelAttribute User user){
        return "result";
    }


/*
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }*/

}
