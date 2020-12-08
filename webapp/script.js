window.onload = function() {
    getData();
};

async function getData() {
    const response = await fetch('http://localhost:8080/')
    const word = await response.json();

    console.log(word)
}
