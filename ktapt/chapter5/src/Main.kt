import kotlin.math.sqrt

fun main() {
    val range = 1..10

    for (i in range) {
        print("$i x $i = ${i * i}")
        print("\n")
    }

    for (i in range) {
        print("sqrt $i - ${sqrt(i.toDouble())}")
        print("\n")
    }

    var sum = 0
    for (row in 1 ..  8 step 2) {


        for (column in 0 until 8) {
            sum += row * column
        }
    }
    print(sum)
    whenExpression()
    firsrChallange()
    challenge()
}

fun whenExpression() {
    val number = 10
    print("\n")
    when (number) {
        0 ->  print("Zero")
        else -> print("Non-Zero")
    }

    val animal = "Dog"
    print("\n")
    when (animal) {
        "Dog", "Cat" -> print("Animal is a house pet")
        else -> print("Animal is not a house pet")
    }

    val numberName = when (number) {
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else -> "Unkown"
    }
    print("\n")
    print(numberName)

}

fun firsrChallange() {
    val age = 4
    val pair = Pair("Sarvar", 18)
print("\n")
    when (pair.second) {
        in 0..2 -> print("${pair.first} is Infant")
        in 3..12 -> print("${pair.first} is Child")
        in 13..19 -> print("${pair.first} is Teenager")
        in 20..39 -> print("${pair.first} is Adult")
        in 40..60 -> print("${pair.first} is Middle Aged")
        else -> print("Elderly")
    }
}

// count down without downTo
fun challenge() {
    var countDown = 10
    while (countDown > 0) {
        print("\n")
        print(countDown)
        countDown--

    }

    for (i in 0..10) {
        print("\n")
        print(i.toDouble() / 10)
    }
        

}