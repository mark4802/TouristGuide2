package com.example.touristguide.model;

public class TouristAttraction {
    private String name;
    private String description;
    private String id;

    public TouristAttraction(String name, String description, String id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public TouristAttraction() {

    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
