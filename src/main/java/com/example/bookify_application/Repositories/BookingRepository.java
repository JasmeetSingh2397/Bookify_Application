package com.example.bookify_application.Repositories;

import com.example.bookify_application.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking save(Booking booking);


}
