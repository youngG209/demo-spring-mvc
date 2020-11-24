package com.demospringmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

    @Autowired
    EventService eventService;

//    @RequestMapping(value = "/events", method = RequestMethod.GET)
//    상기 간략화
    @GetMapping("/events")
    public String event(Model model){
        model.addAttribute("events",eventService.getEvents());

        return "events";
    }
}
