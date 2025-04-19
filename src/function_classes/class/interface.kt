package function_classes.`class`

interface Archery {
    fun height()    // abstract function

    fun archer(){
        println("Archer Skill")
    }

    fun personality(){
        println("Jolly")
    }
}

interface Singer{
    fun singing(){
        println("Singing Skill")
    }

    fun personality(){
        println("Kind")
    }
}


// make Child abstract or override height()
class Child: Archery, Singer, BaseClass() {
    override fun personality() {    // mandatory override
        super<Archery>.personality()    // or super<Singer>.personality()
    }

    override fun singing() {
        println("Classical singing")
    }

    override fun height() {  // mandatory override
        println("5'10 feet")
    }
}

fun main(){
    val obj = Child()
    obj.archer()    // Archer Skill
    obj.singing()   // Classical singing

    obj.personality()   // Jolly
    obj.role()  // Role of base class
    obj.height()    // 5'10 feet
}