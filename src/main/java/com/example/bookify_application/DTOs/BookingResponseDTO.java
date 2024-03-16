package com.example.bookify_application.DTOs;


import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
@Getter
@Setter
public class BookingResponseDTO {
    private long bookingId;
    private int amount;

    private ResponseStatus responseStatus;
    private String FailureMessage;

}
