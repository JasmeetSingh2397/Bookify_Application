package com.example.bookify_application.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookingRequestDTO {
    private long UserId;
    private List<Long> showSeatIds;
    private long showId;

}
