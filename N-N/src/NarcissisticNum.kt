fun NarcissisticNumber (n: List) :Boolean {

}

fun digits(i: Int): List<Int> {
    var i = i
    val digits: MutableList<Int> = ArrayList()
    while (i > 0) {
        digits.add(i % 10)
        i /= 10
    }
    return digits
}

fun main() {
    val num1 = digits( 153)
    val num2 = digits( 1652)
    var SNum1 = NarcissisticNumber(num1)
    var SNum2 = NarcissisticNumber(num2)

}