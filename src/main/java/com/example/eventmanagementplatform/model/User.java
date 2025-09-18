package com.example.eventmanagementplatform.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int age;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    private LocalDateTime createdAt = LocalDateTime.now();
    @OneToMany(mappedBy = "organizer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Event> organizedEvents = new ArrayList<>();
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Registration> registrations = new ArrayList<>();

    public enum UserRole {
        USER("Пользователь"),
        ORGANIZER("Организатор"),
        ADMIN("Администратор");
        private String displayName;

        UserRole(String displayName) {
            this.displayName = displayName;
        }

        public String getRoleAsString() {
            return displayName;
        }
    }
}
