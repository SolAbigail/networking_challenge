package com.example.android.networkconnect.data.remote.extension;

import com.example.android.networkconnect.data.remote.model.CharacterDto;
import com.example.android.networkconnect.domain.model.CharacterModel;

public class CharacterMapper {
    public static CharacterModel characterDtoToModel(CharacterDto characterDto) {
        return new CharacterModel(
                characterDto.getId(),
                characterDto.getName(),
                characterDto.getImage()
        );
    }
}
