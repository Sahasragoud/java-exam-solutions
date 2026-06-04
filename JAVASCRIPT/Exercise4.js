// 4. Functions, Scope, Closures, Higher-Order Functions
function addEvent(eventName) {
    console.log(`${eventName} added`);
}

function registerUser(userName) {
    console.log(`${userName} registered`);
}

function filterEventsByCategory(events, callback) {
    return events.filter(callback);
}

function registrationCounter() {
    let count = 0;

    return function () {
        count++;
        return count;
    };
}

const counter = registrationCounter();

console.log(counter());
console.log(counter());

const events = [
    { name: "Music Fest", category: "Music" },
    { name: "Workshop", category: "Education" }
];

const musicEvents = filterEventsByCategory(
    events,
    event => event.category === "Music"
);

console.log(musicEvents);
