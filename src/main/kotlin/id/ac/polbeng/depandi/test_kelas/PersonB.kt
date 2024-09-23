package id.ac.polbeng.depandi.test_kelas

class PersonB (_firstname: String, _lastName: String, _age: Int) {
    var firstName:String = _firstname
    var lastName:String = _lastName
    var age:Int = _age
}

fun main(args: Array<String>) {
    val budi = PersonB("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}