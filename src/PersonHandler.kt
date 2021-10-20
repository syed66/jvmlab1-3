class PersonHandler {
    fun createPerson(name: String, age: Int, height: Int, weight: Int,
                     email: String): Person{
        val person= Person(name = name,age =age, height =height,weight = weight,email =email)
        return person
    }

    fun getHeightInInches(person: Person): String{
        return "Height: " + person.heightInInches() + "inch"
    }
}