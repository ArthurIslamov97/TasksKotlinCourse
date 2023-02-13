package `9block`

open class DebitCard(override var balance: Int) : BankCard() {


    override fun topUp() {
        println("Enter amount of money to top up your card")
        var sum = readLine()?.toIntOrNull() ?: return
        balance += +sum

    }

    override fun getBalanceInfo() {
        println("Your debit card balance is ${balance}")
    }


    override fun pay(withdraw: Int) {
        balance += -withdraw
    }

    override fun getAvailableFundsInfo() {
        println("Your debit card balance is ${balance}")
    }
}