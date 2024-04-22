package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DogStatus {
    private String name;
    private DogStatusEnum Status;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public DogStatusEnum getStatus() {
        return Status;
    }
    public void setStatus(DogStatusEnum status) {
        Status = status;
    }
    public DogStatus(String name, DogStatusEnum status) {
        this.name = name;
        Status = status;
    }
    public DogStatus() {
    }

    
    
}
