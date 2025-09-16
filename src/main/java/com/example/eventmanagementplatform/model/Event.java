package com.example.eventmanagementplatform.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private User organizer;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    @Enumerated(EnumType.STRING)
    private EventLocation location;
    private String address;
    @Enumerated(EnumType.STRING)
    private EventStatus status;
    private Integer capacity;
    private Integer availableSeats;

    @OneToMany(mappedBy = "event")
    private List<Registration> registrations = new ArrayList<>();

    public enum EventLocation {
        ONLINE, OFFLINE
    }
    public enum EventStatus {
        PLANNED, ONGOING, COMPLETED, CANCELLED
    }

}
