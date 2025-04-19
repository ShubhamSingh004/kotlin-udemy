package function_classes.`class`

open class BaseClass{
    fun coreValues(){
        println("Core Values")
    }

    open fun role(){
        println("Role of base class")
    }
}

open class Secondary: BaseClass() {
    override fun role(){
//        super.role()
        println("Role of Secondary Class")
    }
}

open class Tertiary: Secondary(){
    fun func(){
        println("Func in Tertiary")
    }
}


fun main(){
    val obj1 = Secondary()
    obj1.coreValues()
    obj1.role()

    val obj2 = Tertiary()
    obj2.role() // Role of Secondary Class

    obj2.func() //Func in Tertiary
}