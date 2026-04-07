function checkprime() {
    let num = document.getElementById("numberInput").value;
    let result = document.getElementById("result");

    num = parseInt(num);

    if (isNaN(num) || num < 2) {
        result.innerText = " is not a prime";
        return;
    }

    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) {
            result.innerText = num + " is NOT a Prime Number ";
            return;
        }
    }

    result.innerText = num + " is a Prime Number ";
}