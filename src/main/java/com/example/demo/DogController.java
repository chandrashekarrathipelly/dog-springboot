package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

    @Autowired
    private DogService dogService;

    @PostMapping("saveDetails")
    public Dog saveDogDetails(@RequestBody Dog dog) {
        return dogService.saveDogDetails(dog);
    }

    @GetMapping("getDetail/{id}")
    public Dog getDogDetails(@PathVariable int id) {
        return dogService.getDogDetailsById(id);
    }

    @GetMapping("healthyDogs")
    public List<Dog> getHealthyDogs() {
        return dogService.getHealthyDogs();
    }

    @GetMapping("dogStatus")
    public List<DogStatus> getDogStatus() {
        return dogService.getDogStatus();
    }

    @GetMapping("dogstatus/unhealthy")
    public List<Dog> getUnhealthyDogs(){
        return null;
    }

}
