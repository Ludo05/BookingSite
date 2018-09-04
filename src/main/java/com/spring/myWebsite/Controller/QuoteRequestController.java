package com.spring.myWebsite.Controller;

import com.spring.myWebsite.Model.QuoteRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class QuoteRequestController {
	
	@GetMapping("/newQuote")
    public String beginQuoteRequest(ModelMap modelMap) {
        // add implementation later
        modelMap.addAttribute("submitNewQuote", new QuoteRequest());
    		return "newQuote";
    }
    
	@PostMapping
    public String submitQuoteRequest() {
        
        // add implementation later
		
    		return "newQuoteConfirmation";
    }

}
