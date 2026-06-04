const events = [];

events.push({
    name: "Music Fest",
    category: "Music"
});

events.push({
    name: "Baking Workshop",
    category: "Workshop"
});

const musicEvents = events.filter(
    event => event.category === "Music"
);

console.log(musicEvents);

const cards = events.map(
    event => `Workshop on ${event.name}`
);

console.log(cards);
