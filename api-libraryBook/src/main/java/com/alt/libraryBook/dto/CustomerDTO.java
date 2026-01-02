package com.alt.libraryBook.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class CustomerDTO {

    private Long id;
    private String customerName;
    private String customerCode;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
