3. Conditionals, Loops, and Error Handling
const events = [
    { name: "Music Fest", seats: 20, upcoming: true },
    { name: "Workshop", seats: 0, upcoming: true },
    { name: "Old Event", seats: 10, upcoming: false }
];

events.forEach(event => {
    if (event.upcoming && event.seats > 0) {
        console.log(event.name);
    }
});

try {
    let seats = 0;

    if (seats <= 0) {
        throw new Error("No seats available");
    }

    console.log("Registration successful");
}
catch(error) {
    console.log(error.message);
}
