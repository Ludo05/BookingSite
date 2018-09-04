package com.spring.myWebsite.Controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

//Allows this controller only apply to the Controllers mentioned in the assignable types.
@ControllerAdvice (assignableTypes = {
        QuoteRequestController.class,
        QuoteRequestManagementController.class

})
public class QuoteRequestManagementAdvice {



    //Making sure all date coming in following the correct date format. this will only apply to requests coming into top controller classes
    @InitBinder
    public void EventBinder(WebDataBinder webDataBinder){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setLenient(false);


        webDataBinder.registerCustomEditor(Date.class,
                new CustomDateEditor(simpleDateFormat,false));
    }
}
