package com.skyform.skyform.webAPI.controllers;

import com.skyform.skyform.business.abstracts.EventService;
import com.skyform.skyform.entities.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/events")
public class EventController {

    private EventService eventService;

    @Autowired
    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @PostMapping("/addevent")
    public void addEvent(@RequestBody Event event){
        eventService.addEvent(event);
    }


}
