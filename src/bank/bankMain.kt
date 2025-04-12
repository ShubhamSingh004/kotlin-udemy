package bank

class BankAccount(var accHolder: String, private var bal: Double){
    private  val transactionHistory = mutableListOf<String>()

    init{
        if(this.bal > 0.0)
            this.transactionHistory.add("+ $${this.bal} (Account creation)")
    }

    fun deposit(amount: Double){
        this.bal += amount

        this.transactionHistory.add("+ $$amount")
        println("$$amount deposited. Current Balance: $${this.bal}")
    }

    fun withdraw(amount: Double){
        if(this.bal > amount) {
            this.bal -= amount
            this.transactionHistory.add("- $$amount.")
            println("$$amount deposited. Current Balance: $${this.bal}")
        }

        else println("You cannot withdraw money more than your balance. Your current balance is $${this.bal}")
    }

    fun displayHistory(){
        println("\nTRANSACTION HISTORY of ${this.accHolder}'s ACCOUNT")
        for(i in 0..<this.transactionHistory.size)
            println("${i+1}) ${this.transactionHistory[i]}")
        displayBalance()
    }

    fun displayBalance(){
        println("Current Balance is $${this.bal}")
    }
}


fun main(){
    val shubhamAccount = BankAccount("Shubham Singh", 1000.0)
    shubhamAccount.displayBalance()
    shubhamAccount.deposit(2302.45)
    shubhamAccount.withdraw(8444.3)
    shubhamAccount.withdraw(2000.00)
    shubhamAccount.displayBalance()
    shubhamAccount.displayHistory()
}