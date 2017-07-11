onload = function() {
    var hearts = document.querySelectorAll(".background")[0], counter = 0, text = "";
    for (var i = 0; i < 5000; i++) {
        text += "+";
    }
    setTimeout(function() {
        document.getElementsByTagName("p")[0].style.transition = "is all";
        document.getElementsByTagName("p")[0].style.color = "#222";
    }, 14000)
    setInterval(function() {
        hearts.innerHTML += text[counter];
        counter++;
    }, 0)
}