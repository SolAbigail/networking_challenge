package com.example.android.networkconnect.domain.model;

public class CharacterModel {

    private final Integer id;
    private final String name;
    private final String image;

    public CharacterModel(Integer id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}
