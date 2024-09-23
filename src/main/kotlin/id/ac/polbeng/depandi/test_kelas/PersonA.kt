package id.ac.polbeng.depandi.test_kelas

class PersonA (_firstName: String, _lastName: String,_age: Int) {
    var firstName:String
    var lastName:String
    var age:Int
    init{
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main(args: Array<String>) {
    val budi = PersonA("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}