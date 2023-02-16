interface CurrencyConverter {

    val currencyCode: String
    val currencyName: String

    fun convertToRub(sum: Double): Double {
        return sum.times(0)
    }
}