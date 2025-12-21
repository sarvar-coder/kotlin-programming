import kotlin.math.sqrt

fun main() {
    printMyName()
    multiply(4, 4)
    val result = multiplier(4, 4)
    println(result)
    val output = multiplyInferred(20, 20)
    println(output)
    printFullName("Sarvar", "Boltaboyev")
    printFullName(firstName = "Sarvar", lastName = "Boltaboyev")
    val fullName = calculateFullName("Sarvarbek", "Boltaboyev")
    println(fullName)
    val funtion = ::add
    println(funtion(9,2))
    println(isPrime(19))
    println(fibonacci(7))
}

fun printMyName() {
    println("My name is Sarvabek")
}

fun multiply(multiplier: Int, andValue: Int) {
    println(multiplier * andValue)
}

fun multiplier(multiplier: Int, value: Int): Int {
    return multiplier * value
}

fun multiplyInferred(number: Int, multiplier: Int) = number * multiplier

fun printFullName(firstName: String, lastName: String) {
    println(lastName + " " + firstName)
}



fun calculateFullName(firstName: String, lastName: String): Pair<String, Int> {
    return Pair(lastName + " " + firstName, (firstName + " " + lastName).length)
}

// functions as variables

fun add(a: Int, b: Int): Int {
    return a + b
}

fun isNumberDiviseble(number: Int, divisor: Int): Boolean = number % divisor == 0

fun isPrime(number: Int): Boolean {

    if (number < 2) { return false }

    val root = sqrt(number.toDouble()).toInt()

    for (i in 2..root) {
        if (isNumberDiviseble(number, i)) {
            return false
        }
    }

    return true
}

fun fibonacci(number: Int): Int {

    if (number <= 1) {
        return number
    } else {
return fibonacci(number - 2) + fibonacci(number - 1)
    }
}
