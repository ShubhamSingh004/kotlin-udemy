fun main(){
    for(i in 1..10){
        println(i)
    }

    val l1 = mutableListOf(1, 2, 3)
    for(ele in l1)
        println(ele)

    println("Item and index of a list")
    for(i in 0..<l1.size)       // for(i in 0 until l1.size) also works
        println("$i. ${l1[i]}")


    for(i in 0..<l1.size)
        l1[i] *= 2

    println(l1)
}

