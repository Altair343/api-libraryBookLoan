package com.alt.libraryBook.exception;

import com.alt.libraryBook.enums.APIError;
import org.springframework.http.HttpStatus;

import java.util.List;

public class AltException extends RuntimeException {
    private HttpStatus status;
    private String description;
    private List<String> reasons;

    public AltException(APIError error) {
        this.status = error.getHttpStatus();
        this.description = error.getMessage();
    }

    public AltException(HttpStatus status, String description, List<String> reasons) {
        this.status = status;
        this.description = description;
        this.reasons = reasons;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getReasons() {
        return reasons;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }
}