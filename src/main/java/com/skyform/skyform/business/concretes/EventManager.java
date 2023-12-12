package com.skyform.skyform.business.concretes;

import com.skyform.skyform.business.abstracts.EventService;
import com.skyform.skyform.dataAccess.abstracts.EventDao;
import com.skyform.skyform.entities.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventManager implements EventService {

    private EventDao eventDao;

    @Autowired
    public EventManager(EventDao eventDao){
        this.eventDao = eventDao;
    }


    @Override
    public void addEvent(Event event) {
        eventDao.save(event);
    }
}
