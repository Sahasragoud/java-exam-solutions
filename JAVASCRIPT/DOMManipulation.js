//DOM Manipulation
const container = document.querySelector("#events");

const card = document.createElement("div");
card.textContent = "Music Festival";

container.appendChild(card);

function register() {
    card.textContent = "Registered Successfully";
}
