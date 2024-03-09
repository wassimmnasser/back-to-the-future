package com.bttf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bttf.service.DVDService;

/**
author : Wassim MNASSER
*/
@RestController
public class DVDController {
	
	private final DVDService dvdService;

    @Autowired
    public DVDController(DVDService dvdService) {
        this.dvdService = dvdService;
    }

    @PostMapping("/calculateTotalPrice")
    public ResponseEntity<Integer> calculateTotalPrice(@RequestBody String dvdContent) {
        int totalPrice = dvdService.calculateTotalPrice(dvdContent);
        return new ResponseEntity<>(totalPrice, HttpStatus.OK);
    }

}
