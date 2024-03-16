package com.example.bookify_application.Controllers;


import com.example.bookify_application.DTOs.BookingRequestDTO;
import com.example.bookify_application.DTOs.BookingResponseDTO;
import com.example.bookify_application.DTOs.ResponseStatus;
import com.example.bookify_application.Exceptions.NoUserFoundException;
import com.example.bookify_application.Exceptions.ShowNotFoundException;
import com.example.bookify_application.Exceptions.ShowSeatNotAvailableException;
import com.example.bookify_application.Services.BookingService;
import com.example.bookify_application.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookingResponseDTO bookTicket(BookingRequestDTO bookingRequestDTO){
        BookingResponseDTO bookingResponseDTO= new BookingResponseDTO();
        try{
            Booking booking= bookingService.bookMovie(bookingRequestDTO.getUserId(),bookingRequestDTO.getShowId(),bookingRequestDTO.getShowSeatIds());
            bookingResponseDTO.setBookingId(booking.getId());
            bookingResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            bookingResponseDTO.setAmount(booking.getAmount());

        } catch (ShowNotFoundException | ShowSeatNotAvailableException | NoUserFoundException e) {
            bookingResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
            System.out.println(e.getMessage());

        }
        return bookingResponseDTO;
    }

}
