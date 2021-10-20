abstract class Persistence {
    companion object{
        fun createDBPersistence() = DBPersistence()
        fun createFilePersistence() = FilePersistence()
    }
    abstract fun save(data: String)
}

class DBPersistence: Persistence(){
    override fun save(data: String){
        println("Saving $data to DB")
    }
}

class FilePersistence: Persistence(){
    override fun save(data: String){
        println("Saving $data to File")
    }
}