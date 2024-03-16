package com.example.bookify_application.Repositories;


import com.example.bookify_application.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType,Long> {
    List<ShowSeatType> findAllByShow(Long showId);

}
