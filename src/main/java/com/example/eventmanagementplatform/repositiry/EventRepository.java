package com.example.eventmanagementplatform.repositiry;

import com.example.eventmanagementplatform.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
