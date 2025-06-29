-- ================================================
-- 🚧 Table Definition: neighborhoods
-- ================================================

CREATE TABLE IF NOT EXISTS neighborhoods (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    safety_score DOUBLE PRECISION NOT NULL,
    green_spaces DOUBLE PRECISION NOT NULL,
    affordability DOUBLE PRECISION NOT NULL,
    transport_access DOUBLE PRECISION NOT NULL,
    school_rating DOUBLE PRECISION NOT NULL,
    entertainment DOUBLE PRECISION NOT NULL
);

-- ================================================
-- 📥 Sample Data: Neighborhood Scores
-- ================================================

INSERT INTO neighborhoods 
(name, safety_score, green_spaces, affordability, transport_access, school_rating, entertainment)
VALUES
('Kurukshetra', 9, 10, 7, 6, 8, 6),
('Jalandhar', 8, 8, 8, 8, 8, 8),
('Ludhiana', 10, 9, 6, 5, 9, 5),
('Karnal', 6, 5, 10, 7, 6, 6),
('Gurugram', 7, 4, 8, 10, 7, 8),
('Hisar', 9, 10, 5, 5, 6, 4),
('Lovely', 10, 10, 10, 10, 10, 10),
('Delhi', 5, 6, 6, 5, 6, 6),
('Panipat', 7, 3, 7, 9, 8, 9),
('Rajasthan', 9, 9, 8, 6, 7, 7),
('Ambala', 8, 10, 6, 4, 6, 5),
('YNR', 6, 4, 5, 10, 7, 10),
('Mandi', 1, 1, 1, 1, 1, 1),
('Shimla', 8, 8, 8, 8, 8, 8),
('Chandigarh', 10, 9, 10, 9, 9, 10);
