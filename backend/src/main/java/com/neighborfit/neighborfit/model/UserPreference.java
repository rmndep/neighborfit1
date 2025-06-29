package com.neighborfit.neighborfit.model;

import lombok.*;

/**
 * A data model representing the weight preferences given by the user
 * for each factor influencing neighborhood selection.
 *
 * This object is received from the frontend and used in the matching algorithm
 * to compute the most suitable neighborhoods.
 */
@Data // Lombok: auto-generates getters, setters, equals, hashCode, toString
@AllArgsConstructor // Lombok: generates constructor with all fields
@NoArgsConstructor  // Lombok: generates no-args constructor
public class UserPreference {

    /** Weight for safety factor (e.g., 0–10). */
    private double safetyWeight;

    /** Weight for green spaces factor. */
    private double greenWeight;

    /** Weight for affordability factor. */
    private double affordabilityWeight;

    /** Weight for public transport accessibility. */
    private double transportWeight;

    /** Weight for school quality. */
    private double schoolWeight;

    /** Weight for entertainment and lifestyle facilities. */
    private double entertainmentWeight;
}
