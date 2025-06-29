package com.neighborfit.neighborfit.service;

import com.neighborfit.neighborfit.model.Neighborhood;
import com.neighborfit.neighborfit.model.UserPreference;
import com.neighborfit.neighborfit.repository.NeighborhoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Service class that contains the core algorithm for matching
 * user preferences to neighborhoods using Euclidean distance.
 */
@Service
public class MatchService {

    @Autowired
    private NeighborhoodRepository neighborhoodRepository;

    /**
     * Returns the top-matching neighborhoods for a given set of user preferences.
     * Uses a distance-based algorithm to find the closest matches.
     *
     * @param pref User-provided preference weights for various lifestyle factors.
     * @return A sorted list of top 2 best-matching Neighborhoods.
     */
    public List<Neighborhood> getTopMatches(UserPreference pref) {
        // Fetch all neighborhoods from the database
        List<Neighborhood> all = neighborhoodRepository.findAll();

        // Sort neighborhoods based on their Euclidean distance to the user preference
        return all.stream()
                .sorted(Comparator.comparingDouble(n -> euclideanDistance(n, pref))) // Lower distance = better match
                .limit(2) // Return only top 2 matches
                .collect(Collectors.toList());
    }

    /**
     * Calculates the Euclidean distance between the user's preference vector
     * and the current neighborhood's factor vector.
     *
     * @param n Neighborhood data from database.
     * @param p User preferences submitted from the frontend.
     * @return A distance value (lower = closer match).
     */
    private double euclideanDistance(Neighborhood n, UserPreference p) {
        double[] nVec = {
            n.getSafetyScore(),
            n.getGreenSpaces(),
            n.getAffordability(),
            n.getTransportAccess(),
            n.getSchoolRating(),
            n.getEntertainment()
        };

        double[] pVec = {
            p.getSafetyWeight(),
            p.getGreenWeight(),
            p.getAffordabilityWeight(),
            p.getTransportWeight(),
            p.getSchoolWeight(),
            p.getEntertainmentWeight()
        };

        double sum = 0.0;
        for (int i = 0; i < nVec.length; i++) {
            sum += Math.pow(nVec[i] - pVec[i], 2);
        }

        return Math.sqrt(sum); // Euclidean distance formula
    }
}
