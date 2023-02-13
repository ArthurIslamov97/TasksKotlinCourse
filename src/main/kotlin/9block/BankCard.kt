package `9block`

abstract class BankCard() {


    abstract var balance: Int

    abstract fun topUp()

    abstract fun pay(withdraw: Int)

    abstract fun getBalanceInfo()

    abstract fun getAvailableFundsInfo()


}