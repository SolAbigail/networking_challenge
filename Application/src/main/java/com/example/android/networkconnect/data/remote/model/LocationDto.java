package com.example.android.networkconnect.data.remote.model;

public class LocationDto {

    private final Integer id;
    private final String name;
    private final String type;
    private final String dimension;

    public LocationDto(Integer id, String name, String type, String dimension) {
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
