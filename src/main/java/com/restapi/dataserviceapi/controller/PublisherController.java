package com.restapi.dataserviceapi.controller;

import com.restapi.dataserviceapi.model.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.restapi.dataserviceapi.repository.PublisherRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class PublisherController {
    @Autowired
    private PublisherRepository repo;

    // http://localhost:8080/courses
    @CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")
    @GetMapping("/publisher")
    public List<Publisher> getAllPublishers() {
        return repo.findAll();
    }

    // http://localhost:8080/courses/1
    @GetMapping("/publisher/{id}")
    public Publisher getPublisherDetails(@PathVariable int id) {

        Optional<Publisher> publisher = repo.findById(id);
        if(publisher.isEmpty()) {
            throw new RuntimeException("Course not found with id " + id);
        }

        return publisher.get();
    }

    @PostMapping("/publisher")
    public String createNewPublisher(@RequestBody Publisher publisher){
        repo.save(publisher);
        return "Data Added sucessfully";
    }

    @PutMapping("/publisher/{id}")
    public String updateCourse(@PathVariable int id, @RequestBody Publisher publisher){
        repo.save(publisher);
        return "Data Updated sucessfully";
    }

    @DeleteMapping("/publisher/{id}")
    public String deleteCourse(@PathVariable int id){
        repo.deleteById(id);
        return id + " Data delete sucessfully";
    }

}
