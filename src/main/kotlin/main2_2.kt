fun main() {
    val likes = 1569
    var s = "String"
    if (likes % 10 == 1) {
        s = " человеку"
    } else if (likes % 1000 == 0) {
        s = " человек"
    } else {
        s = " человекам"
    }
    println("Понравилось " + likes + s)
}