package `9block`

class TinkoffBlack(override var balance: Int) : DebitCard(0) {
    var cashBack = 0

    override fun pay(withdraw: Int) {
        super.pay(withdraw)
        cashBack = (withdraw * 0.01).toInt()
        balance += cashBack

        if (withdraw >= 5000) {
            cashBack = (withdraw * 0.05).toInt()
            balance += cashBack
        }
    }

    override fun getAvailableFundsInfo() {
        super.getAvailableFundsInfo()
        println("Your cashback is ${cashBack}")
    }

}