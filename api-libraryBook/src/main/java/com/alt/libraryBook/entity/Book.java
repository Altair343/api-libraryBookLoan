package com.alt.libraryBook.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Book extends Base {

    private String title;
    private String author;
    private String description;
    private String isbn;
    @Column(name = "book_type")
    private String bookType;
    @Column(name = "number_copies")
    private Integer numberCopies;
    private String year;
    private String editorial;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public Integer getNumberCopies() {
        return numberCopies;
    }

    public void setNumberCopies(Integer numberCopies) {
        this.numberCopies = numberCopies;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(description, book.description) && Objects.equals(isbn, book.isbn) && Objects.equals(bookType, book.bookType) && Objects.equals(numberCopies, book.numberCopies) && Objects.equals(year, book.year) && Objects.equals(editorial, book.editorial) && Objects.equals(createdAt, book.createdAt) && Objects.equals(updatedAt, book.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, author, description, isbn, bookType, numberCopies, year, editorial, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                ", bookType='" + bookType + '\'' +
                ", numberCopies=" + numberCopies +
                ", year='" + year + '\'' +
                ", editorial='" + editorial + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                "} " + super.toString();
    }
}
