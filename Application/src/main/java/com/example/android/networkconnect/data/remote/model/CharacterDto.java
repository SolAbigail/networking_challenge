package com.example.android.networkconnect.data.remote.model;

public class CharacterDto {

    private final Integer id;
    private final String name;
    private final String status;
    private final String image;
    private final String url;

    public CharacterDto(Integer id, String name, String status, String image, String url) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.image = image;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getImage() {
        return image;
    }

    public String getUrl() {
        return url;
    }
}
