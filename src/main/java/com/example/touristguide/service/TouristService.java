package com.example.touristguide.service;

import com.example.touristguide.model.TouristAttraction;
import com.example.touristguide.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {

    private final TouristRepository repository;

    public TouristService(TouristRepository repository) {
        this.repository = repository;
    }

    public List<TouristAttraction> getTouristAttractions() {
        return repository.getTouristAttractionList();
    }

    public TouristAttraction getTouristAttraction(int id) {
        return repository.getTouristAttraction(id);
    }

    public void addTouristAttraction(TouristAttraction attraction) {
        repository.addTouristAttraction(attraction);
    }
}