package `9block`

class TinkoffPlatinum() : CreditCard(0) {

    var percent = 0

    override fun topUp() {
        println("Enter amount of money to top up your card")
        var sum = readLine()?.toIntOrNull() ?: return
        balance += sum

        if (sum >= 1000) {
            var percent = (sum * 0.005).toInt()
            balance += percent
        }

    }

    override fun getAvailableFundsInfo() {
        super.getAvailableFundsInfo()
        println("Your percent is ${percent}")
    }
}