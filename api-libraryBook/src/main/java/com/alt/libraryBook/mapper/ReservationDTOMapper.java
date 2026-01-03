package com.alt.libraryBook.mapper;

import com.alt.libraryBook.dto.ReservationDTO;
import com.alt.libraryBook.entity.Reservation;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface ReservationDTOMapper extends Converter<ReservationDTO, Reservation> {

    @Override
    Reservation convert(ReservationDTO source);

}