package com.alt.libraryBook.controller;

import com.alt.libraryBook.dto.ReservationDTO;
import com.alt.libraryBook.dto.SearchReservationCriteriaDTO;
import com.alt.libraryBook.helper.AppConstant;
import com.alt.libraryBook.service.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(AppConstant.WEB_SERVICE_CONNECTOR)
@Validated
public class ReservationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReservationController.class);
    private final ReservationService service;

    @Autowired
    public ReservationController(ReservationService service) {this.service = service;}

    @GetMapping("/demo")
    public Map<String, String> demo() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Home");
        return response;
    }

    @GetMapping
    public ResponseEntity<List<ReservationDTO>> getReservations(SearchReservationCriteriaDTO criteria) {
        LOGGER.info("Obtain all the reservations");
        List<ReservationDTO> response = service.getReservations(criteria);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }


}
