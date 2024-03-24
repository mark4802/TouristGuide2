package com.example.touristguide.repository;

import com.example.touristguide.model.TouristAttraction;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private final List<TouristAttraction> touristAttractionList = new ArrayList<TouristAttraction>(List.of(
            new TouristAttraction("Tivoli", "En kendt forlystelsespark", "300"),
            new TouristAttraction("Rundetårn", "Et højt rundt tårn", "400"),
            new TouristAttraction("Øresundsvej", "Min vej", "500")
    ));

    public List<TouristAttraction> getTouristAttractionList() {
        return touristAttractionList;
    }

    public TouristAttraction getTouristAttraction(int id) {
        return touristAttractionList.get(id);
    }

    public void addTouristAttraction(TouristAttraction attraction) {
        touristAttractionList.add(attraction);
    }

    
}
