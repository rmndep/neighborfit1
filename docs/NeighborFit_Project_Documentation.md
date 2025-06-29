NeighborFit Project Documentation

🧠 Problem Definition & Hypothesis Formation

Core Problem: Urban and semi-urban individuals often struggle to choose the right neighborhood when relocating. Current tools focus on individual features like pricing or rent but lack personalized lifestyle-based matching.

Hypothesis:If users provide weighted preferences for key lifestyle factors (like safety, affordability, greenery, etc.), we can recommend the best-matched neighborhoods using real data and similarity algorithms.

🔍 Research Methodology & Findings

- User Surveys: We conducted informal surveys and secondary research to identify user concerns during relocation.
- Findings:
  _ Users value different parameters like safety, affordability, schools, etc.
  _ No existing app combines all lifestyle preferences in a match-based system.
  Gaps in Existing Tools:
- Only show raw data (e.g., Numbeo, Housing.com)
- No personalized matching
- No visual or interactive explanation

⚙️ Algorithm Design Rationale & Trade-Offs

- Used Algorithm: Euclidean Distance Matching
- Why:
  - Matches closest values to user input
  - Easy to scale
  - Handles continuous, numerical data effectively
- Alternative Considered: Cosine similarity (was biased toward higher value neighborhoods)
  Trade-offs:
- Pros: Interpretable, fast, simple
- Cons: No weighting/normalization — resolved by direct preference weights

🧩 Data Challenges & Solutions

- Challenge: No official API access to neighborhood scores
- Solution: Mock data designed based on real Indian cities and logical values (e.g., Gurugram = high transport, Mandi = low affordability)
- Database Used: PostgreSQL via pgAdmin
- Insertion: 15 cities with logical distributions based on real assumptions

✅ Functional Implementation

- Frontend: HTML, CSS, JS (Responsive, clean layout, theme toggle)
- Backend: Java Spring Boot REST API
- Database: PostgreSQL
- Deployment Ready: Deployed with mock data and fully working end-to-end integration
  Working Features:
- Landing page with CTA
- Form for weighted preferences
- Top 2 neighborhood matches via API
- Results with score breakdown
- Clean, mobile-friendly UI

🧪 Testing & Validation

- Manual test cases:
  - All preferences 10 → returns "Lovely", "Chandigarh"
  - All preferences 1 → returns "Mandi", "Delhi"
- Validated form input, placeholder hints, and required field validations
- API returns tested via Postman and browser console

📊 Analysis & Reflection

Effectiveness:

- Achieves full-stack integration
- Handles user preferences intuitively
- Lightweight and fast

  Limitations:

- Static dataset
- No login/auth (could be future addition)
- Assumes numeric scaling is enough for preferences

  Future Improvements:

- Real API integration for city data
- User registration, history, feedback loop
- Better ML-based scoring system
