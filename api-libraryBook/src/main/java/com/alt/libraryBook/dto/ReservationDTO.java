package com.alt.libraryBook.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class ReservationDTO {
    Long version;
    private Long id;
    private String folio;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;

    private CustomerDTO customerId;
    private List<BookDTO> bookList;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
