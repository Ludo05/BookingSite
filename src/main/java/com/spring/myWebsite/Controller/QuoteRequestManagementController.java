package com.spring.myWebsite.Controller;

import com.spring.myWebsite.Model.QuoteRequest;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class QuoteRequestManagementController {
    
	@GetMapping(path = "/quoteRequests")
    public String listRequests() {
        
        
    		return "quoteRequestList";
    }
	
	@GetMapping(path = "/quoteRequests", params="eventType=wedding")
    public String listWeddingRequests() {
        
        
    		return "quoteRequestList";
    }
	
	@GetMapping("/quoteRequest/{quotedId}")
	public ModelAndView viewQuoteRequest(@PathVariable int quoteId) {
    		QuoteRequest quoteRequestBean = new QuoteRequest();
    		quoteRequestBean.setBudget(5000);
    		quoteRequestBean.setEventType("wedding");
		
    		ModelAndView mav = new ModelAndView();
    		mav.addObject("quoteRequestBean", quoteRequestBean);
    		mav.setViewName("quoteRequestDetail");
    		
    		return mav;
    }
	
	@GetMapping("/quoteRequest/social/{id}")
	public String viewRequestSocial(@PathVariable int id) {
		String returnViewName = "quoteRequestSocialEventDetail";
		
		boolean someCondition = true;
		if (someCondition) {
			returnViewName = "redirect:/quoteRequest/wedding/{id}";
		}
		
		return returnViewName;
	}
	
	@GetMapping
	@ResponseBody
	public QuoteRequest viewQuoteRequestApi() {
		
		// add some implementation here
		QuoteRequest quoteRequest = new QuoteRequest();
		quoteRequest.setBudget(5000);
		
		return quoteRequest;
	}
    
	@PostMapping("/quoteDetail")
	public String updateQuoteRequest(@ModelAttribute QuoteRequest formBean) {
        
		// implement a save of all of the form bean information
        
    		return "quoteRequestDetail";
    }

    //Model Method
	@ModelAttribute
	public void addCommonAttriubtes(@RequestParam String eventType, Model model){
		String customMessage = "You are viewing requests for" + eventType;
		model.addAttribute("whatEvent",customMessage);

	}


}
