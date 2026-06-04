//11. Working with Forms

document.querySelector("form").addEventListener("submit", function(event) {

    event.preventDefault();

    const name = this.elements["name"].value;
    const email = this.elements["email"].value;
    const selectedEvent = this.elements["event"].value;

    if (name === "" || email === "") {
        document.getElementById("error").textContent =
            "All fields are required";
        return;
    }

    console.log(name, email, selectedEvent);
});
