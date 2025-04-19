package function_classes.`class`

interface Archery {
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

class Child: Archery, Singer{
    override fun personality() {    // mandatory override
        super<Archery>.personality()    // or super<Singer>.personality()
    }
}

fun main(){
    val obj = Child()
    obj.archer()
    obj.singing()

    obj.personality()
}