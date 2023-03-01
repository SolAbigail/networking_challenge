package com.example.android.networkconnect.data.remote.extension;

import com.example.android.networkconnect.data.remote.model.LocationDto;
import com.example.android.networkconnect.domain.model.LocationModel;

public class LocationMapper {
    public static LocationModel locationDtoToModel(LocationDto locationDto) {
        return new LocationModel(
                locationDto.getId(),
                locationDto.getName(),
                locationDto.getType(),
                locationDto.getDimension()
        );
    }
}
