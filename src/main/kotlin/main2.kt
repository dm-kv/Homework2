fun main() {
    val likes = 100
    val s = if (likes % 10 == 1) " человеку" else " людям"
    println("Понравилось " + likes + s)
}