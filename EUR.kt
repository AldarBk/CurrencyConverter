class EUR():CurrencyConverter {
    override val currencyCode = "EUR"
    override val currencyName = "Евро"

    override fun convertToRub(sum: Double): Double {
        return sum.times(0.17)
    }
}