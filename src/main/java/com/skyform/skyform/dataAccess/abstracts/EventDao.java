package com.skyform.skyform.dataAccess.abstracts;

import com.skyform.skyform.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDao extends JpaRepository<Event, Integer> {
}
