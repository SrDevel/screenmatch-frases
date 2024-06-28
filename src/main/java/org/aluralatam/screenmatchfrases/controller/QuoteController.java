package org.aluralatam.screenmatchfrases.controller;

import org.aluralatam.screenmatchfrases.dto.QuoteDTO;
import org.aluralatam.screenmatchfrases.repository.QuoteRepository;
import org.aluralatam.screenmatchfrases.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @Autowired
    private QuoteService service;

    @GetMapping("/series/frases")
    public QuoteDTO getQuote() {
        return service.getRandom();
    }
}
