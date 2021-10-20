import kotlin.random.Random

public data class Person(var name: String = "John Doe", var age: Int = 21,
                    var height: Int = 70, var weight: Int = 90,
                    var email: String = "JohnDoe@hotmail.com") {
    val userName: String
    var password: String = ""
    init {
        userName = name + Random(100)
    }
    constructor(name: String , passwordStrength: Int) : this() {
        val rand = Random
        for( i in 1..passwordStrength){
            password+=rand.nextInt(10)
        }

    }


    fun heightInInches(): Int{
        return height
    }
}