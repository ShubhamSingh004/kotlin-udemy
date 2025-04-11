package function_classes.`class`

class Dog(var name: String, var breed: String){
    init{
        println("Init block")
    }
    fun bark(){
        println("Woof Woof")
    }
}

fun main(){
    val D = Dog("John", "German Shepherd") // object
    D.bark()
    println(D.name + " " + D.breed )
}