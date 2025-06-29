package com.neighborfit.neighborfit.controller;

import com.neighborfit.neighborfit.model.Neighborhood;
import com.neighborfit.neighborfit.model.UserPreference;
import com.neighborfit.neighborfit.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller that exposes endpoints for neighborhood matching.
 * Handles incoming requests from the frontend and delegates processing
 * to the MatchService.
 */
@RestController
@CrossOrigin(origins = "*") // Allow cross-origin requests from any domain (CORS)
public class MatchController {

    @Autowired
    private MatchService matchService;

    /**
     * POST endpoint that receives user preference weights and returns a list
     * of matched neighborhoods sorted by calculated relevance.
     *
     * @param preference The user-defined weights for factors like safety, affordability, etc.
     * @return A list of top-matched neighborhoods based on the user's preferences.
     */
    @PostMapping("/match")
    public List<Neighborhood> match(@RequestBody UserPreference preference) {
        return matchService.getTopMatches(preference);
    }

    /**
     * GET endpoint to retrieve all neighborhoods with default equal weighting.
     * Useful for debugging or displaying data without user input.
     *
     * @return A list of neighborhoods with equal weighting across all factors.
     */
    @GetMapping("/neighborhoods")
    public List<Neighborhood> allNeighborhoods() {
        // Default weights = 1 for all criteria
        return matchService.getTopMatches(new UserPreference(1, 1, 1, 1, 1, 1));
    }
}
