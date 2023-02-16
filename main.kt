import java.util.*

fun main() {
    println("Выберети валюту:1 - USD, 2 - EUR, 3 - CNY ")
    val currency = readln()
    val exchange = Converters.get(currency)
    if (exchange != null) {
        println("введите сумму:")
        val sum = readln().toDouble()
        println("$sum рублей = ${exchange.convertToRub(sum)} ${exchange.currencyName}")
    } else
        println("Неправильный код валюты")

}

 object Converters {
    fun get(currencyCode: String): CurrencyConverter?{
        when(currencyCode.lowercase(Locale.getDefault())){
            "1" -> return USD()
            "2" -> return EUR()
            "3" -> return CNY()
        }
        return null
    }
}

