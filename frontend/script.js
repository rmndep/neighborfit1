// Attach an event listener to the form to handle user submission
document
  .getElementById('preferenceForm')
  .addEventListener('submit', async function (e) {
    e.preventDefault(); // Prevent the page from reloading on form submit

    const form = e.target;
    // Collect user input from the form and convert values to float for calculation
    const data = {
      safetyWeight: parseFloat(form.safetyWeight.value),
      greenWeight: parseFloat(form.greenWeight.value),
      affordabilityWeight: parseFloat(form.affordabilityWeight.value),
      transportWeight: parseFloat(form.transportWeight.value),
      schoolWeight: parseFloat(form.schoolWeight.value),
      entertainmentWeight: parseFloat(form.entertainmentWeight.value),
    };

    // Send the preference data to the backend server via POST request
    const response = await fetch('https://neighborfit1.onrender.com//match'', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(data), // Convert the JS object into JSON string
    });

    // Parse the backend response (expected to be a list of neighborhood matches)
    const matches = await response.json();

    // Select the div where the results will be displayed
    const resultsDiv = document.getElementById('results');
    resultsDiv.innerHTML = '<h3>Top Neighborhood Matches:</h3>'; // Clear previous results

    // Loop through each match and dynamically display its details
    matches.forEach((n) => {
      const div = document.createElement('div');
      div.classList.add('result-item');
      div.innerHTML = `
        <strong>${n.name}</strong>
        Safety: ${n.safetyScore}, Green: ${n.greenSpaces}, Affordability: ${n.affordability}<br>
        Transport: ${n.transportAccess}, Schools: ${n.schoolRating}, Entertainment: ${n.entertainment}
      `;
      resultsDiv.appendChild(div); // Add each match to the result section
    });
  });
