package id.ac.polbeng.depandi.test_kelas

fun main(args: Array<String>) {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello Programmer"
    println(greeter.with_ret_val("Dono"))
}