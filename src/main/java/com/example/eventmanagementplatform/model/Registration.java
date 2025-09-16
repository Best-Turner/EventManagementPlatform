package com.example.eventmanagementplatform.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Registration {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
    private LocalDateTime registrationDate;
    @Enumerated(EnumType.STRING)
    private RegistrationStatus status;
    private String notes;

    public enum RegistrationStatus {
        PENDING, CONFIRMED, CANCELLED, ATTENDED
    }
}
