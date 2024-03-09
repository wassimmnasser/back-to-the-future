package com.bttf.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
/**
author : Wassim MNASSER
*/
public class DVDServiceImplTest {
	
	private DVDServiceImpl dvdService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        dvdService = new DVDServiceImpl();
    }
	
	 @Test
	    void calculateTotalPrice_ShouldReturn36() {
	        // Given
	        String dvdContent = "Back to the Future 1\nBack to the Future 2\nBack to the Future 3";
	        int expectedPrice = 36;

	        // When
	        int totalPrice = dvdService.calculateTotalPrice(dvdContent);

	        // Then
	        assertEquals(expectedPrice, totalPrice);
	    }

	    @Test
	    void calculateTotalPrice_ShouldReturn27() {
	        // Given
	        String dvdContent = "Back to the Future 1\nBack to the Future 3";
	        int expectedPrice = 27;

	        // When
	        int totalPrice = dvdService.calculateTotalPrice(dvdContent);

	        // Then
	        assertEquals(expectedPrice, totalPrice);
	    }

	    @Test
	    void calculateTotalPrice_ShouldReturn15() {
	        // Given
	        String dvdContent = "Back to the Future 1";
	        int expectedPrice = 15;

	        // When
	        int totalPrice = dvdService.calculateTotalPrice(dvdContent);

	        // Then
	        assertEquals(expectedPrice, totalPrice);
	    }

	    @Test
	    void calculateTotalPrice_ShouldReturn48() {
	        // Given
	        String dvdContent = "Back to the Future 1\nBack to the Future 2\nBack to the Future 3\nBack to the Future 2";
	        int expectedPrice = 48;

	        // When
	        int totalPrice = dvdService.calculateTotalPrice(dvdContent);

	        // Then
	        assertEquals(expectedPrice, totalPrice);
	    }

	    @Test
	    void calculateTotalPrice_ShouldReturn56() {
	        // Given
	        String dvdContent = "Back to the Future 1\nBack to the Future 2\nBack to the Future 3\nLa chèvre";
	        int expectedPrice = 56;

	        // When
	        int totalPrice = dvdService.calculateTotalPrice(dvdContent);

	        // Then
	        assertEquals(expectedPrice, totalPrice);
	    }

}
