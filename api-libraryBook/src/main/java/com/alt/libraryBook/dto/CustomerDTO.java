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
    Long version;
    private Long id;
    private String customerName;
    private String customerCode;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
