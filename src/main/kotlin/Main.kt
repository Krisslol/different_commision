val minComission = 35 // мин. сумма комиссии по картам Visa и Мир
val comissionVM = 0.75 // комиссия по картам Visa и Мир
val limit_MM = 75000 // лимит по картам Мастеркард и Маэстро


fun cards(typesOfCard: String = "Vk Pay", sumOfLastTransit: Int = 0, currentSumTransit: Int) {
    when (typesOfCard) {

        "Maestro" -> if (typesOfCard == "Maestro" && currentSumTransit < limit_MM)
            println("Сумма перевода составляет: $currentSumTransit")
        else println("Сумма перевода составляет: " + (currentSumTransit + (currentSumTransit * 0.6 + 20)))

        "Mastercard" -> if (typesOfCard == "Mastercard" && currentSumTransit < limit_MM)
            println("Сумма перевода составляет: $currentSumTransit")
        else println("Сумма перевода составляет: " + (currentSumTransit + (currentSumTransit * 0.6) + 20))

        "Visa" -> if (typesOfCard == "Visa" && currentSumTransit * comissionVM / 100 < minComission)
            println("Сумма перевода составляет: " + (currentSumTransit + minComission))
        else println("Сумма перевода составляет: " + (currentSumTransit+(currentSumTransit * comissionVM / 100)))

        "Mir" -> if (typesOfCard == "Mir" && currentSumTransit * comissionVM / 100 < minComission)
            println("Сумма перевода составляет: " + (currentSumTransit + minComission))
        else println("Сумма перевода составляет: " + (currentSumTransit+(currentSumTransit * comissionVM / 100)))

        "Vk Pay" -> if (typesOfCard == "Vk Pay") println("Ваш перевод составил: $currentSumTransit")
    }
}

fun main() {

    var price = cards("Mir", currentSumTransit = 40000)
}



