package com.alt.libraryBook.specification;

import com.alt.libraryBook.dto.SearchReservationCriteriaDTO;
import com.alt.libraryBook.entity.Reservation;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class ReservationSpecification {

    public static Specification<Reservation> withSearchCriteria(SearchReservationCriteriaDTO criteria) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (criteria.getCustomerCode()!= null) {
                predicates.add(criteriaBuilder.equal(root.get("customerId").get("customerCode"), criteria.getCustomerCode()));
            }

            if (criteria.getCustomerName() != null) {
                predicates
                        .add(criteriaBuilder.equal(root.join("customerId").get("customerName"), criteria.getCustomerName()));
            }
            if (criteria.getFolio() != null) {
                predicates.add(criteriaBuilder.equal(root.get("folio"), criteria.getFolio()));
            }

            //Order by specification
            if (criteria.getSortingDirection() != null && criteria.getSortField() != null) {
                if(criteria.getSortingDirection().equals("desc")) {
                    query.orderBy(criteriaBuilder.desc(root.get(criteria.getSortField())));
                } else {
                    query.orderBy(criteriaBuilder.desc(root.get(criteria.getSortField())));
                }
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}