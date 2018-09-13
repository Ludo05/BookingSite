package com.spring.myWebsite.Controller;

import com.spring.myWebsite.Model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/postName")
    public String addCustomer(Model model){
        /*var customer = new Customer();
        customer.setFirstName(fname);
        customer.setLastName(lname);

        model.addAttribute("firstName",customer.getFirstName());
        model.addAttribute("lastName",customer.getLastName());*/

        model.addAttribute("customer",new Customer());

        return "customer";
    }

    @PostMapping("/postName")
    public String showcustomer(@ModelAttribute Customer customer){
        return "customerResult";
    }

}