package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

public interface Srepository<T> extends JpaRepository<T, ID> {

}
