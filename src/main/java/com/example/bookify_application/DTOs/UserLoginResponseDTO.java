package com.example.bookify_application.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginResponseDTO {
    private ResponseStatus responseStatus;
    private Long UserId;
}
