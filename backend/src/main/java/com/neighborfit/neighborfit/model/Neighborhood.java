package com.neighborfit.neighborfit.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity class representing a Neighborhood.
 * Maps to the "neighborhoods" table in the database and holds all
 * factor scores used for matching (e.g., safety, affordability, etc.).
 */
@Entity
@Table(name = "neighborhoods")
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@AllArgsConstructor // Generates a constructor with all fields
@NoArgsConstructor  // Generates a no-argument constructor
public class Neighborhood {

    /** Unique identifier for each neighborhood (primary key). */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Name of the neighborhood (e.g., Greenfield, Midtown). */
    private String name;

    /** Safety score of the neighborhood (0.0 to 10.0). */
    private double safetyScore;

    /** Availability of green spaces in the neighborhood. */
    private double greenSpaces;

    /** Affordability index of the neighborhood. */
    private double affordability;

    /** Accessibility to public transport. */
    private double transportAccess;

    /** School quality rating in the area. */
    private double schoolRating;

    /** Entertainment and leisure options available nearby. */
    private double entertainment;
}
