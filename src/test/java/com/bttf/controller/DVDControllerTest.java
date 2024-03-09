package com.bttf.controller;

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

import com.bttf.service.DVDService;

/**
 * author : Wassim MNASSER
 */
public class DVDControllerTest {

	private DVDController dvdController;

	@Mock
	private DVDService dvdService;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
		dvdController = new DVDController(dvdService);
	}

	@Test
	void calculateTotalPrice_ShouldReturn36() {
		String dvdContent = "Back to the Future 1\nBack to the Future 2\nBack to the Future 3";
		int totalPrice = 36;

		when(dvdService.calculateTotalPrice(dvdContent)).thenReturn(totalPrice);

		ResponseEntity<Integer> response = dvdController.calculateTotalPrice(dvdContent);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(totalPrice, response.getBody());
		verify(dvdService, times(1)).calculateTotalPrice(dvdContent);
	}

	@Test
	void calculateTotalPrice_ShouldReturn27() {
		String dvdContent = "Back to the Future 1\nBack to the Future 3";
		int totalPrice = 27;

		when(dvdService.calculateTotalPrice(dvdContent)).thenReturn(totalPrice);

		ResponseEntity<Integer> response = dvdController.calculateTotalPrice(dvdContent);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(totalPrice, response.getBody());
		verify(dvdService, times(1)).calculateTotalPrice(dvdContent);
	}

	@Test
	void calculateTotalPrice_ShouldReturn15() {
		String dvdContent = "Back to the Future 1";
		int totalPrice = 15;

		when(dvdService.calculateTotalPrice(dvdContent)).thenReturn(totalPrice);

		ResponseEntity<Integer> response = dvdController.calculateTotalPrice(dvdContent);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(totalPrice, response.getBody());
		verify(dvdService, times(1)).calculateTotalPrice(dvdContent);
	}

	@Test
	void calculateTotalPrice_ShouldReturn48() {
		String dvdContent = "Back to the Future 1\nBack to the Future 2\nBack to the Future 3\nBack to the Future 2";
		int totalPrice = 48;

		when(dvdService.calculateTotalPrice(dvdContent)).thenReturn(totalPrice);

		ResponseEntity<Integer> response = dvdController.calculateTotalPrice(dvdContent);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(totalPrice, response.getBody());
		verify(dvdService, times(1)).calculateTotalPrice(dvdContent);
	}

	@Test
	void calculateTotalPrice_ShouldReturn56() {
		String dvdContent = "Back to the Future 1\nBack to the Future 2\nBack to the Future 3\nLa chèvre";
		int totalPrice = 56;

		when(dvdService.calculateTotalPrice(dvdContent)).thenReturn(totalPrice);

		ResponseEntity<Integer> response = dvdController.calculateTotalPrice(dvdContent);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(totalPrice, response.getBody());
		verify(dvdService, times(1)).calculateTotalPrice(dvdContent);
	}

}
