// Load candidates when the page loads
window.onload = function () {
    fetch("/api/candidates")
        .then(response => response.json())
        .then(data => {
            const dropdown = document.getElementById("candidateId");
            data.forEach(candidate => {
                const option = document.createElement("option");
                option.value = candidate.id;
                option.textContent = candidate.name;
                dropdown.appendChild(option);
            });
        })
        .catch(err => {
            console.error("Error fetching candidates:", err);
            document.getElementById("result").textContent = "Failed to load candidates.";
        });
};

// Handle vote submission
document.getElementById("voteForm").addEventListener("submit", function (event) {
    event.preventDefault();

    const voterId = document.getElementById("voterId").value;
    const candidateId = document.getElementById("candidateId").value;

    fetch(`/api/voter/vote?voterId=${voterId}&candidateId=${candidateId}`, {
        method: "POST"
    })
        .then(res => res.text())
        .then(data => {
            document.getElementById("result").textContent = data;
        })
        .catch(err => {
            console.error("Error submitting vote:", err);
            document.getElementById("result").textContent = "Error submitting vote.";
        });
});
