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

}