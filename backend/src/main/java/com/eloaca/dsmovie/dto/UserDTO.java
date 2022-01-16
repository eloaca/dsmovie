package com.eloaca.dsmovie.dto;

import com.eloaca.dsmovie.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String email;

    public UserDTO(User user){
        this.id = user.getId();
        this.email = user.getEmail();
    }
}
