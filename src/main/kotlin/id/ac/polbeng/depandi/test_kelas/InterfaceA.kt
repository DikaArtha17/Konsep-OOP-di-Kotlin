package id.ac.polbeng.depandi.test_kelas

interface MyInterface{
    var str: String
    fun demo()
    fun func(){
        println("Hello")
    }
}
class MyClass: MyInterface{
    override var str: String = "Rekayasa Perangkat Lunak"
    override fun demo() {
        println("Demo Function")
    }
}

fun main(args: Array<String>) {

    val obj = MyClass()
    obj.demo()
    obj.func()
    println(obj.str)
}