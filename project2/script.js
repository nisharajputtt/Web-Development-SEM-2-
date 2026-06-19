document.addEventListener("DOMContentLoaded", () => {

    // Smooth scroll to signup section
    const startBtn = document.querySelector(".start");

    startBtn.addEventListener("click", () => {
        document.querySelector(".signup").scrollIntoView({
            behavior: "smooth"
        });
    });

    // Email Validation
    const signupBtn = document.querySelector(".signup-box button");
    const emailInput = document.querySelector(".signup-box input");

    signupBtn.addEventListener("click", () => {

        const email = emailInput.value.trim();

        if (!email) {
            alert("Please enter your email.");
            return;
        }

        const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (!regex.test(email)) {
            alert("Invalid email address.");
            return;
        }

        alert(`Membership started for ${email}`);
        emailInput.value = "";
    });

    // Sign In Button
    const signInBtn = document.querySelector(".signin");

    signInBtn.addEventListener("click", () => {

        const username = prompt("Enter username:");

        if (username) {
            alert(`Welcome back, ${username}!`);
        }
    });

    // Poster Click Functionality
    const posters = document.querySelectorAll(".poster img");

    posters.forEach((poster) => {

        poster.addEventListener("click", () => {

            const movie =
                poster.alt ||
                "Movie";

            alert(`Playing ${movie}`);
        });

    });

    // Dynamic Search Feature
    const searchInput = document.createElement("input");

    searchInput.placeholder = "Search Movies...";
    searchInput.style.padding = "12px";
    searchInput.style.margin = "20px";
    searchInput.style.width = "300px";
    searchInput.style.borderRadius = "5px";

    document.querySelector(".row").prepend(searchInput);

    searchInput.addEventListener("keyup", () => {

        const value =
            searchInput.value.toLowerCase();

        posters.forEach((poster) => {

            const movie =
                poster.alt.toLowerCase();

            if (movie.includes(value)) {
                poster.parentElement.style.display = "block";
            } else {
                poster.parentElement.style.display = "none";
            }

        });

    });

    // Trending Counter
    const heading = document.querySelector(".row h2");

    heading.innerHTML += ` (${posters.length})`;

    // Auto-highlight random movie every 3 sec
    setInterval(() => {

        posters.forEach(poster => {
            poster.style.border = "none";
        });

        const random =
            Math.floor(Math.random() * posters.length);

        posters[random].style.border =
            "4px solid #e50914";

    }, 3000);

});