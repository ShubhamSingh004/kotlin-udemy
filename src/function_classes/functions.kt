package function_classes

fun main(){
    val n = readlnOrNull()?.toInt()
    println( makeCoffee(2, "Shubham"))
}

fun makeCoffee(sugar: Int, name: String): String {
    return when{
        sugar < 0 -> ("Sugar Spoons cannot be negative")
        sugar == 0 -> ("$name needs coffee with no sugar")
        sugar == 1 -> ("$name needs $sugar spoon of sugar")
        else -> ("$name needs $sugar spoons of sugar")
    }
}

fun makeCoffee(sugar: Double, name: String){
    val a =  when{
        sugar < 0 -> ("Sugar Spoons cannot be negative")
        sugar == 0.0 -> ("$name needs coffee with no sugar")
        sugar == 1.0 -> ("$name needs $sugar spoon of sugar")
        else -> ("$name needs $sugar spoons of sugar")
    }
}
