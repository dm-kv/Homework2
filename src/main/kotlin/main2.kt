fun main() {
    val likes = 8000
    val s = if (likes % 10 != 1 || likes % 100 == 11) " людям" else " человеку"
    println("Понравилось $likes$s ")
}