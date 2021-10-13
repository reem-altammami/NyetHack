fun main() {
    val name = "Madrigal"
    var healthPoints = 70
    val isBlessed = true
    val isImmortal = false

    val healthStatus: String = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
//****** Aura ******
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor= if (auraVisible)
        when (karma){
            in 0..5->"Red"
            in 6..10->"Orange"
            in 11..15->"purple"
            in 16..20->"Green"
            else -> "aura not visible"}
        else{""}

    println("$name $healthStatus \n Aura: $auraColor")

}


