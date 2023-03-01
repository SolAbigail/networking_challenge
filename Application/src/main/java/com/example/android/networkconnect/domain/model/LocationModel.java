package com.example.android.networkconnect.domain.model;

public class LocationModel {
    private final Integer id;
    private final String name;
    private final String type;
    private final String dimension;

    public LocationModel(Integer id, String name, String type, String dimension) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.dimension = dimension;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDimension() {
        return dimension;
    }
}
