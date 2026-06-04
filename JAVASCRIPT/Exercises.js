// 9. Async JS, Promises, Async/Await

//Using Promise

fetch("events.json")
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.log(error));

//Using Async/Await

async function getEvents() {
    try {
        console.log("Loading...");

        const response = await fetch("events.json");
        const data = await response.json();

        console.log(data);
    }
    catch(error) {
        console.log(error);
    }
}

getEvents();
