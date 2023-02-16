class CNY():CurrencyConverter {
    override val currencyCode = "CNY"
    override val currencyName = "Йен"

    override fun convertToRub(sum: Double): Double {
        return sum.times(0.41)
    }
}