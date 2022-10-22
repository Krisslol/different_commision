fun cards(typesOfCard: String = "Vk Pay", sumOfLastTransit: Double = 0.0, currentSumTransit: Double): Double {

    return when (typesOfCard) {
        "Maestro", "Mastercard" -> comissionForMasterCardAndMaestro(sumOfLastTransit, currentSumTransit)

        "Visa", "Mir" -> comissionForVisaAndMir(currentSumTransit)

        "Vk Pay" -> currentSumTransit
        else -> 0.0
    }
}

// рассчет комиссии Виза и Мир
fun comissionForVisaAndMir(currentSumTransit: Double): Double {
    val minComission = 35.0
    val comissionVM = 0.0075
    return if (currentSumTransit * 0.0075 > 35.0) currentSumTransit + currentSumTransit * comissionVM else minComission + currentSumTransit
}

// расчет комиссии по картам Мастеркард и Маэстро
fun comissionForMasterCardAndMaestro(sumOfLastTransit: Double, currentSumTransit: Double): Double {
    val maxMonthAmountForComission: Double = 75_000.00
    return if (maxMonthAmountForComission > currentSumTransit) currentSumTransit else currentSumTransit + currentSumTransit * 0.006 + 20
}

fun main() {
    var price = cards("Vk Pay", 0.0, currentSumTransit = 10_000.00)
    println("Сумма перевода составляет: $price")
}


