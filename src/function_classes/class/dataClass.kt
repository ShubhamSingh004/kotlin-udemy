package function_classes.`class`

data class PersonDetail(
    var name: String,
    var age: Int
)

class Person(personDetail: PersonDetail){
    val name = personDetail.name
    val age = personDetail.age

    fun displayDetails(){
        println("$name $age")
    }
}

fun main(){
    val p = Person(PersonDetail("Shubham", 20))

    p.displayDetails()
}