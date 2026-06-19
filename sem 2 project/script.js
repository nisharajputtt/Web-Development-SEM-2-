// Sign In Button
const signInBtn = document.querySelector(".signin");

signInBtn.addEventListener("click", () => {
    alert("Sign In feature coming soon!");
});

// Hero Get Started Button
const startBtn = document.querySelector(".start");

startBtn.addEventListener("click", () => {
    const email = prompt("Enter your email address:");

    if (email && email.includes("@")) {
        window.location.href = "movies.html";
    } else {
        alert("Please enter a valid email address.");
    }
});

// Signup Section Button
const signupBtn = document.querySelector(".signup-box button");
const emailInput = document.querySelector(".signup-box input");

signupBtn.addEventListener("click", () => {

    const email = emailInput.value.trim();

    if (email === "") {
        alert("Please enter your email address.");
    }
    else if (!email.includes("@")) {
        alert("Please enter a valid email.");
    }
    else {
        window.location.href = "movies.html";
    }

});

// Movie Posters - Watch Trailer Popup

const posters = document.querySelectorAll(".poster img");

const trailerLinks = [
    "https://youtu.be/bftjfqS3v6k?si=qqxHW_ZWCjVHyw3O",
    "https://youtu.be/aWzlQ2N6qqg?si=bckLrTPucC10s_Fx",
    "https://youtu.be/9r-tT5IN0vg?si=6Z0XtD161UHkYJZF",
    "https://youtu.be/HnyNZdcL_GY?si=kqUiKAAOQv23R5xT",
    "https://youtu.be/oqxAJKy0ii4?si=g6FDZFAuC2-95NT5",
    "https://youtu.be/q2aENKR59w4?si=gdb3zQhvhEw_xTQ6"
];

posters.forEach((poster, index) => {

    poster.style.cursor = "pointer";

    poster.addEventListener("click", () => {

        const watchTrailer = confirm(
            "🎬 Watch Trailer?\n\nPress OK to open the trailer on YouTube."
        );

        if (watchTrailer) {
            window.open(trailerLinks[index], "_blank");
        }

    });

});