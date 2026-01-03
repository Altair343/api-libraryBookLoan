package com.alt.libraryBook.dto;
import java.time.LocalDate;

public class SearchReservationCriteriaDTO {
    private Long customerCode;
    private String customerName;
    private LocalDate folio;

    private String sortField;
    private String sortingDirection;

    private Integer pageActual = 0;
    private Integer pageSize = 10;

    public Long getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Long customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getFolio() {
        return folio;
    }

    public void setFolio(LocalDate folio) {
        this.folio = folio;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortingDirection() {
        return sortingDirection;
    }

    public void setSortingDirection(String sortingDirection) {
        this.sortingDirection = sortingDirection;
    }

    public Integer getPageActual() {
        return pageActual;
    }

    public void setPageActual(Integer pageActual) {
        this.pageActual = pageActual;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
