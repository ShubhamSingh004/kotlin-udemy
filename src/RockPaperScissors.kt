fun main(){
    val options = arrayOf("Rock", "Paper", "Scissors")
    val compChoiceIndex = (options.indices).random()

    println("Enter your choice:")
    options.forEachIndexed{ index, option ->
        println("$index. $option")
    }
    print("-> ")
    val userChoiceIndex = readln().toInt()

    println("\n\nUser Choice: ${options[userChoiceIndex]}\nComputer Choice: ${options[compChoiceIndex]}")

    val winner = when{
        (userChoiceIndex == compChoiceIndex) -> "Tie"
        (userChoiceIndex == 0 && compChoiceIndex == 2) ||
        (userChoiceIndex == 1 && compChoiceIndex == 0) ||
        (userChoiceIndex == 2 && compChoiceIndex == 1) -> "Player"
        else -> "Computer"
    }

    if(winner != "Tie"){
        println("\n$winner Won!")
    }
    else println("Its a tie")
}