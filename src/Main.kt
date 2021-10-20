import kotlin.random.Random

fun main() {
    println("Test")
    val number = Random.nextInt(1,9)
    val strength = 5
    val rand = Random
    var password = ""
    for( i in 1..strength){
        password+=rand.nextInt(10)
    }
    println(password)
}