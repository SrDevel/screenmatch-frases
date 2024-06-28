package org.aluralatam.screenmatchfrases.repository;

import org.aluralatam.screenmatchfrases.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
    @Query("SELECT q FROM Quote q ORDER BY function('RANDOM') LIMIT 1")
    Quote getRandomQuote();
}
