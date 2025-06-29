# 🏠 NeighborFit – Smarter Neighborhood Matching

NeighborFit is a full-stack web application designed to help individuals discover neighborhoods that best match their lifestyle preferences. It utilizes real-world data and algorithmic thinking to provide personalized recommendations based on user-defined parameters like safety, affordability, and transport access.

Live Link - https://neighborfitapp.netlify.app/
---

## 🚀 Features

- ✅ Lifestyle-based neighborhood matching
- ✅ Smart form with weighted preferences
- ✅ Matching algorithm (Euclidean distance)
- ✅ Responsive, mobile-friendly design
- ✅ Dark/light theme toggle
- ✅ PostgreSQL backend + Spring Boot API
- ✅ Real-time results displayed in UI

---

## 🛠️ Tech Stack

**Frontend:**

- HTML, CSS, JavaScript

**Backend:**

- Java Spring Boot
- REST APIs

**Database:**

- PostgreSQL (via pgAdmin)

---

## 📂 Project Structure

```
neighborfit_fullstack/
├── backend/                # Spring Boot app
├── frontend/               # HTML, CSS, JS UI
├── data/                   # Sample SQL insert
├── docs/                   # Project documentation
└── README.md               # Project summary
```

---

## 🧠 How It Works

1. User visits landing page and clicks "Get Started"
2. They rate how important each lifestyle factor is (scale 1–10)
3. Backend calculates Euclidean distance from all neighborhoods
4. Top 2 matches are returned and displayed in cards

---

## 🧪 Testing Examples

- Input: `1,1,1,1,1,1` → Returns "Mandi" and "Delhi"
- Input: `10,10,10,10,10,10` → Returns "Lovely" and "Chandigarh"

---

## 📦 Setup Instructions

### ✅ Backend Setup

```bash
cd backend
./mvnw spring-boot:run
```

### ✅ Frontend Setup

Just open `frontend/index.html` in browser.

### ✅ Database Setup

- Open pgAdmin
- Run `data/sample_neighborhoods.sql` to insert data

---

## 📝 Documentation

Full project documentation with problem definition, algorithm design, testing, and analysis is available in `docs/NeighborFit_Project_Documentation.md`

---
