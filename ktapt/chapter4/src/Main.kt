import kotlin.math.sqrt
fun  main() {
    createBoolean()
    firstExercise()
    ifExpression()
    exercise2()
    quadraticEquation()
}

fun createBoolean() {
    val yes: Boolean = true
    val no: Boolean = false

//    equality operator
    val doesOneEqualTwo = (1 == 2)

//    greater and less operator
    val oneIsGreaterThanTwo = 1 > 2
    val oneIsLessThanTwo = 1 < 2

//    and operator if both value true it will be true if one of the input is false then it will be false
    val and = oneIsLessThanTwo && oneIsLessThanTwo

//    or operator: if one of the inputs true it will be true. when both are false then will be false
    val or = false || false

//     string equality
    val order = "fff" > "eee"
    print(order)
}

fun firstExercise() {
    val myAge = 18
    val isTeenager = myAge >= 13 && myAge < 19
    print("\n")
    print(isTeenager)

//

    val theirAge = 30
    val bothTeenagers = isTeenager && theirAge <= 13 && theirAge < 19
    print("\n")
    print(bothTeenagers)

//

    val reader = "Sarvar"
    val author = "Richard Lucas"

    val authorIsReader = reader == author

    print("\n")
    print(authorIsReader)
    print("\n")

    val readerBeforeAuthor = reader < author
    print("readerBeforeAuthor: \n")
    print(readerBeforeAuthor)
}

fun ifExpression() {

    if (2 > 1) {
        print("\n")
        print("Yes 2 is greater than 1")
    }

    val animal = "Wolf"
    print("\n")
    if (animal == "Dog" || animal == "Cat") {
        print("Yes it is house pet ")
    } else {
        print("It is not house pet")
    }

    val a = 5
    val b = 10
    val min = if (a > b) b else a
    val max = if (a > b) a else b
    print("\n")
    print("max: ")
    print(max)
    print("\n")
    print("min: ")
    print(min)

}

fun exercise2() {
    var counter = 0
    while (counter < 10) {
        print("\n")
        print(counter)
        counter++
    }
}

fun quadraticEquation() {
    val a = 1
    val b = -5
    val c = 6
    val d = sqrt((b * b - 4 * a * c).toDouble())
    val x1 = (-b + d) / 2 * a
    val x2 = (-b - d) / 2 * a
    print("\n")
    print("x1: $x1")
    print("\n")
    print("x2: $x2")
}

