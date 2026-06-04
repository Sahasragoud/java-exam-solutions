//10. Modern JavaScript Features
function showEvent(name = "Community Event") {
    console.log(name);
}

showEvent();

const event = {
    name: "Music Fest",
    date: "10-06-2026"
};

const { name, date } = event;

console.log(name, date);

const eventList = ["Music", "Workshop"];
const clonedList = [...eventList];

console.log(clonedList);
