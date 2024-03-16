package com.example.bookify_application.Repositories;


import com.example.bookify_application.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface ShowRepository extends JpaRepository<Show, Long> {
    Optional<Show> findById(Long showId);


}
