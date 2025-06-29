package com.neighborfit.neighborfit.repository;

import com.neighborfit.neighborfit.model.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for the Neighborhood entity.
 * 
 * Extends JpaRepository to provide built-in CRUD operations and
 * query method support without the need for boilerplate code.
 *
 * Spring Data JPA automatically implements this at runtime.
 */
public interface NeighborhoodRepository extends JpaRepository<Neighborhood, Long> {
    // No additional methods needed for now — built-in methods like findAll(), findById(), save(), etc. are inherited.
}
