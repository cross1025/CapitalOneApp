package com.capital.cardoffersapplication.controllers;

import com.capital.cardoffersapplication.services.CardOfferService;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cardoffers")
@Data
public class CardOfferController {

    final CardOfferService cardOfferService;
    int test = 12;
    int test = 22;
    int tester = 22;
    ints






}
