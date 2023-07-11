package com.restapi.dataserviceapi.repository;

import com.restapi.dataserviceapi.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
}
