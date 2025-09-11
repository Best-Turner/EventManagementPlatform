package com.example.eventmanagementplatform.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private User user;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private EventLocation location;
    private String address;
    private EventStatus status;
    private Integer capacity;
    private Integer availableSeats;


    public Event() {
    }

    public Event(String title, String description, User user, LocalDateTime startDateTime, LocalDateTime endDateTime, EventLocation location, Integer capacity) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.location = location;
        this.capacity = capacity;
    }

    public enum EventLocation {
        ONLINE, OFFLINE
    }

    public enum EventStatus {
        PLANNED, ONGOING, COMPLETED, CANCELLED
    }

}
