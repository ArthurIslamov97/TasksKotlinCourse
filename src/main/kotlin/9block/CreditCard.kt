package `9block`

open class CreditCard(override var balance: Int = 0) : BankCard() {
    var creditFunds = 10000


    override fun topUp() {
        println("Enter amount of money to top up your card")
        var sum = readLine()?.toIntOrNull() ?: return
        creditFunds += sum
        if (creditFunds < 10000) {
            creditFunds += sum

        }
        if (creditFunds >= 10000) {
            var restOfMoney = creditFunds - 10000
            balance += restOfMoney
            creditFunds = creditFunds - balance
        }
    }


    override fun pay(withdraw: Int) {

        if (creditFunds + balance - withdraw < 0) {
            println("You have no enough money to pay your purchase")
            return
        }
        balance = balance - withdraw
        if (balance < 0) {
            var overDraft = creditFunds + balance
            creditFunds = overDraft
            balance = 0
        }
    }

    override fun getBalanceInfo() {
        println("Your credit card balance is ${balance}")

    }

    override fun getAvailableFundsInfo() {
        println("Your credit card balance is ${balance}")
        println("Your credit limit is ${creditFunds}")
    }


}