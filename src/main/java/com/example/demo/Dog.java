package com.example.demo;

public class Dog {

    private int id;
    private String name;
    private String ownerName;
    private String ownerNumber;
    private DogStatusEnum status;

    public Dog() {

    }

    public Dog(int id, String name, String ownerName, String onwerNumber, DogStatusEnum status) {
        this.id = id;
        this.name = name;
        this.ownerName = ownerName;
        this.status = status;
        this.ownerNumber = onwerNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(String ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    public DogStatusEnum getStatus() {
        return status;
    }

    public void setStatus(DogStatusEnum status) {
        this.status = status;
    }

}
