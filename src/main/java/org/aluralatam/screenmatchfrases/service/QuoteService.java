package org.aluralatam.screenmatchfrases.service;

import org.aluralatam.screenmatchfrases.dto.QuoteDTO;
import org.aluralatam.screenmatchfrases.model.Quote;
import org.aluralatam.screenmatchfrases.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository repository;

    public QuoteDTO getRandom() {
        Quote randomQuote = repository.getRandomQuote();
        return new QuoteDTO(
                randomQuote.getTitle(),
                randomQuote.getQuote(),
                randomQuote.getAuthor(),
                randomQuote.getPoster());
    }
}
