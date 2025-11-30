import javax.xml.stream.events.Characters

fun main() {
//     type conversion
    var integer: Int = 100
    var decimal: Double = 100.50
    integer = decimal.toInt()
    print(integer)

    var hourlyRate: Double = 13.4
    var hoursWorked: Int = 8
    val totalCost = hourlyRate.toInt() * hoursWorked.toDouble()
    print("\n")
    print(totalCost)
//     type inference
    val typeInferred = 45.0

    stringAndChar()
    minExercise2()
}

fun miniExercise1() {
    val age1 = 42
    val age2 = 21

    val avg1 = (age2 + age1) / 2.0
}

fun stringAndChar() {
    val character: Char = 's'
    val string: String =  "string"

    // string interpolation
    var int = 34
    print("\n")
    val descOfInt = "This is an integer $int"
    print(descOfInt)

    val bigString = """
  |You can have a string
  |that contains multiple
  |lines
  |by
  |doing this.
  """.trimMargin()
    println(bigString)
}

fun minExercise2()  {
    val firstName = "Sarvar"
    val lastName = "Boltaboyev"

    val fullName = firstName + lastName
    val mydetails = "My name is $fullName"
    print("\n")
    print(mydetails)
}

fun pairAndTriplets() {
    val triple = Triple(4, "Febraury", 2007)
    val day = triple.first
    val month = triple.second
    val year = triple.third

    val (_, c2, c3) = triple
    print("\n")
}