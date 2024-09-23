package id.ac.polbeng.depandi.test_kelas

fun main(args: Array<String>) {

    val meri = Student("Meri", 20)
// Destructuring Declaration
    val(name, age) = meri
    println("Name = $name")
    println("Age = $age")
}