// 8. Event Handling

document.getElementById("registerBtn").onclick = function () {
    alert("Registered");
};

document.getElementById("category").onchange = function () {
    console.log("Category Changed");
};

document.addEventListener("keydown", function (event) {
    console.log("Key Pressed:", event.key);
});
