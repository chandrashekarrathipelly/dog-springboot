package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogService {

    HashMap<Integer, Dog> dogHashMap = new HashMap<>();

    public Dog saveDogDetails(Dog dog) {
        dogHashMap.put(dog.getId(), dog);
        return dog;
    }

    public Dog getDogDetailsById(int id) {
        return dogHashMap.get(id);
    }

    public List<Dog> getHealthyDogs() {

        ArrayList<Dog> dogList = new ArrayList<>();

        for (Dog ramu : dogHashMap.values()) {
            if (ramu.getStatus().equals(DogStatusEnum.HEALTHY)) {
                dogList.add(ramu);
            }

        }
        return dogList;
    }

    public List<DogStatus> getDogStatus() {
        ArrayList<DogStatus> statusList = new ArrayList<>();
        for (Dog raw : dogHashMap.values()) {
            DogStatus dogStatus = new DogStatus(raw.getName(), raw.getStatus());
            statusList.add(dogStatus);
        }
        return statusList;
    }

}
