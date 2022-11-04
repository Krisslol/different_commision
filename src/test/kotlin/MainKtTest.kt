import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun comissionForMasterCard() {
        val typesOfCard = "Mastercard"
        val sumOfLastTransit: Double = 0.0
        val currentSumTransit = 10_000.00
        val res = cards(typesOfCard, sumOfLastTransit, currentSumTransit)
        assertEquals(10_000.00, res, 0.001)
    }

    @Test
    fun comissionForMaestro() {
        val typesOfCard = "Maestro"
        val sumOfLastTransit: Double = 0.0
        val currentSumTransit = 10_000.00
        val res = cards(typesOfCard, sumOfLastTransit, currentSumTransit)
        assertEquals(10_000.00, res, 0.001)
    }


    @Test

    fun comissionForVisa() {
        val typesOfCard = "Visa"
        val sumOfLastTransit: Double = 0.0
        val currentSumTransit = 10_000.00
        val res = cards(typesOfCard, sumOfLastTransit, currentSumTransit)
        assertEquals(10_075.00, res, 0.001)
    }

    @Test

    fun comissionForMir() {
        val typesOfCard = "Mir"
        val sumOfLastTransit: Double = 0.0
        val currentSumTransit = 10_000.00
        val res = cards(typesOfCard, sumOfLastTransit, currentSumTransit)
        assertEquals(10_075.00, res, 0.001)
    }


    @Test
    fun cardWithoutComission() {
        val typesOfCard = "Vk Pay"
        val currentSumTransit = 20_000.00
        val sumOfLastTransit: Double = 0.0
        val res = cards(typesOfCard, sumOfLastTransit, currentSumTransit)
        assertEquals(20_000.00, res, 0.001)
    }

    @Test

    fun sumCommissionHigherMinComissionForVisaMir() {
        val typesOfCard = "Visa"
        val sumOfLastTransit: Double = 0.0
        val currentSumTransit = 100_000.00
        val res = cards(typesOfCard, sumOfLastTransit, currentSumTransit)
        assertEquals(100_750.00, res, 0.001)


    }

    @Test
    fun checkSumWithMinComissionForVisaMir() {
        val typesOfCard = "Mir"
        val sumOfLastTransit: Double = 0.0
        val currentSumTransit = 1_000.00
        val res = cards(typesOfCard, sumOfLastTransit, currentSumTransit)
        assertEquals(1_037.00, res, 0.001)

    }
}

