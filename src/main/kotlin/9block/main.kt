package `9block`

fun main() {
    
    var tinkoff = TinkoffBlack(0)
    tinkoff.getAvailableFundsInfo()
    tinkoff.topUp()
    tinkoff.getAvailableFundsInfo()

    println("Enter amount of money to withdraw from your Tinkoff Black card")
    var withdraw = readLine()?.toIntOrNull() ?: return

    tinkoff.pay(withdraw)
    tinkoff.getAvailableFundsInfo()
    tinkoff.getBalanceInfo()

    var tinkoff2 = TinkoffPlatinum()
    tinkoff2.getAvailableFundsInfo()
    tinkoff2.topUp()
    tinkoff2.getAvailableFundsInfo()

    println("Enter amount of money to withdraw from your Tinkoff Platinum card")
    withdraw = readLine()?.toIntOrNull() ?: return

    tinkoff2.pay(withdraw)
    tinkoff2.getAvailableFundsInfo()


}