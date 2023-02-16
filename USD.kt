class USD():CurrencyConverter {
    override val currencyCode = "USD"
    override val currencyName = "Доллар"

    override fun convertToRub(sum: Double): Double {
        return sum.times(0.016)
    }
}