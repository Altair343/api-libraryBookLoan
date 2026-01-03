package com.alt.libraryBook.mapper;

import com.alt.libraryBook.dto.ReservationDTO;
import com.alt.libraryBook.entity.Reservation;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface ReservationMapper extends Converter<Reservation, ReservationDTO> {

    @Override
    ReservationDTO convert(Reservation source);

}