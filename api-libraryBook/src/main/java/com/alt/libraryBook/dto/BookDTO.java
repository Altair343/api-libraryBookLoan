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
public class BookDTO {
    Long version;
    private Long id;
    private String title;
    private String author;
    private String description;
    private String isbn;
    private String bookType;
    private Integer numberCopies;
    private String year;
    private String editorial;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
