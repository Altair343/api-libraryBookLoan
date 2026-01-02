package com.alt.libraryBook.controller;

import com.alt.libraryBook.helper.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(AppConstant.WEB_SERVICE_CONNECTOR)
@Validated
public class ReservationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReservationController.class);

    public ReservationController() {


    }

    @GetMapping("/")
    public Map<String, String> demo() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Home");
        return response;
    }


}
