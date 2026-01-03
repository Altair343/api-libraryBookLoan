package com.alt.libraryBook.service;

import com.alt.libraryBook.entity.Reservation;
import com.alt.libraryBook.enums.APIError;
import com.alt.libraryBook.repository.ReservationRepository;
import com.alt.libraryBook.dto.ReservationDTO;
import com.alt.libraryBook.dto.SearchReservationCriteriaDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import jakarta.validation.*;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import com.alt.libraryBook.specification.ReservationSpecification;
import com.alt.libraryBook.exception.AltException;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReservationService.class);
    private ReservationRepository repository;
    private ConversionService conversionService;

    @Autowired
    public ReservationService(ReservationRepository repository, ConversionService conversionService) {
        this.repository = repository;
        this.conversionService = conversionService;
    }

    public List<ReservationDTO> getReservations(SearchReservationCriteriaDTO criteria) {
        Pageable pageable = PageRequest.of(criteria.getPageActual(), criteria.getPageSize());
        return conversionService.convert(repository.findAll(ReservationSpecification.withSearchCriteria(criteria), pageable), List.class);
    }

    public ReservationDTO getReservationById(Long id) {
        Optional<Reservation> result = repository.findById(id);
        if (result.isEmpty()) {
            LOGGER.debug("Not exist reservation with the id {}", id);
            throw new AltException(APIError.RESERVATION_NOT_FOUND);
        }
        return conversionService.convert(result.get(), ReservationDTO.class);
    }



}
