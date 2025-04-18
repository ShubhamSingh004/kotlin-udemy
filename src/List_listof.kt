import java.util.*

data class vase(var color: String, var design: String)


fun main(){
    val l = listOf("Item1", "item 2", 1, 2)     // immuatable list
    val l2 = mutableListOf("Item1", "item 2", 1, 2)

    l2.add(2, "New Item")
    println(l2)

    l2.removeAt(1)
    println(l2)

    l2.remove(2)
    println(l2)

    l2.add("NewItem2")
    println(l2) // adds at last pos

    println(l2[3])
    l2[3] = "Nvidia 3050"
//    l2.set(3, "Nvidia 4050")
    println(l2)

    println(l2.contains("Item1"))   // true

    l2.removeLast()
    println(l2)

    // map func
    val l3 = listOf(1,2,3,4)
    val doubled = l3.map{ it * 2}

    println(doubled)

    // copy function
    val blueVase = vase(color = "Blue", design = "Rose")
    val redVase = blueVase.copy(color = "Red")

    println("$blueVase \n$redVase")

    // let function
    val name: String? = "Shub"
    name?.let {
        println(name.uppercase())
    }
}
