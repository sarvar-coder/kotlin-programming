import kotlin.math.min

fun main() {
    var errorCode: Int?
    errorCode = 20
    errorCode = null
    println(errorCode)
    minExr()
    checkingForNull()
    challenge2()
}

fun minExr() {
    var myFavouriteSong: String? = "Ishq"
    val parsedInt = "10".toIntOrNull()
    println(parsedInt)

    if (myFavouriteSong != null) {
        print(myFavouriteSong)
    } else {
        println("I don not have a favourite song!")
    }
}

fun checkingForNull() {
    var result: Int? = 30
    println(result)

    var authorName: String? = "Joe Howard"
    var authorAge: Int? = 24

    val ageAfterBirthday = authorAge!! + 1
    println("After their next birthday, author will be $ageAfterBirthday")
}

fun challenge1() {
//    var name: String? = "Ray"  // valid
//    var age: Int = null        // invalid
//    val distance: Float = 26.7 // invalid
//    var middleName: String? = null  // valid
}

fun challenge2() {
    divideIfWhole(10, 2)
    divideIfWhole(10, 3)
}

fun isDivisible(number1: Int, number2: Int): Int? {
    if (number1 % number2 == 0) {
        return number1 / number2
    } else {
        return null
    }
}

fun divideIfWhole(value: Int, divisor: Int) {

    val x = isDivisible(value, divisor) ?: 0
    println("Yep, It divides $x times.")
}

