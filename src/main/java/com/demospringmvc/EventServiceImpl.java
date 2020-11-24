package com.demospringmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Override
    public List<Event> getEvents() {
        List<Event> list = new ArrayList<>();
        Event event1 = Event.builder()
                .name("스프링 웹 MVC 스터디 1차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019,1,1,1,10))
                .endDateTime(LocalDateTime.of(2019,1,1,14,10))
                .build();

        Event event2 = Event.builder()
                .name("스프링 웹 MVC 스터디 2차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2020,1,1,1,10))
                .endDateTime(LocalDateTime.of(2020,1,1,14,10))
                .build();


        list.add(event1);
        list.add(event2);

        return list;
    }
}
