fun main() {
   val myTrue = true
    val myFalse = false

    val age: Int = readln().toInt()

    if(age < 18)
        println("Minor")
    else if (age in 18..65)
        println("Adult")
    else
        println("Senior Citizen")
//    println("Hello" + " Name")
}