fun main() {
    lambdaBasics()
    shortHandSyntax()
    itKeyword()
    lambdaAsArgumnets()

    var counter = 0
    val increment = {
        counter += 1
    }

    increment()
    increment()
    increment()
    println(counter)

    val counter1 = countingLamda()
    val counter2 = countingLamda()

    println(counter1())
    println(counter2())
    println(counter1())
    println(counter1())
    println(counter2())

    lambda()
    minExercise()
    challenges()
}

fun lambdaBasics() {
    var multiplyLambda: (Int, Int) -> Int
    multiplyLambda = { a: Int, b: Int ->
        Int
        a * b
    }

    val result = multiplyLambda(4, 2)
    println(result)
}

fun shortHandSyntax() {
//    using type inference to remove type declaration of variable within lamba functions
    var multiplyLambda: (Int, Int) -> Int
    multiplyLambda = { a, b ->
        a * b
    }

}

fun itKeyword() {
    var doubleLambda = { a: Int ->
        2 * a
    }

    doubleLambda = { 2 * it }
}

fun lambdaAsArgumnets() {
    val addLambda = { a: Int, b: Int ->
        Int
        a + b
    }
    val result = operateOnNumbers(25, 25, addLambda)
    println(result)
}

fun operateOnNumbers(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
): Int {
    return operation(a, b)
}

fun countingLamda(): () -> Int {
    var counter = 0
    val lamda: () -> Int = {
        counter += 1
        counter
    }
    return lamda
}

fun lambda() {
//    iterating over collections
    val values = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    values.forEach { println("$it * $it = ${it * it}") }

//  filter out prices using of lambda
    val prices = arrayOf(23.4, 12.23, 2.3, 9.3, 12.9)
    println(prices.filter { it > 10.0 })

//    usage of map
    println(prices.map {
        it * 0.9
    })

    val sum = prices.reduce { a, b ->
        a + b
    }
    println(sum)
}

fun minExercise() {
    val nameList = listOf("Sarvar", "Samandar", "Muzaffar", "Sanjar", "Diyor")
    val concatenation = nameList.fold("") { a, b -> a + b }
    println(concatenation)

    val moreThan7 = nameList
        .filter { it.length > 7 }
        .fold("") { a, b -> a + b }
    println(moreThan7)

    val namesAndAges = mapOf(
        "Samandar" to 18,
        "Rayhon" to 20,
        "Atabek" to 41,
        "Soxiba" to 41
    )
    println(namesAndAges.filter { it.value <= 18 })

    val adults = namesAndAges
        .filter { it.value > 18 }
        .map { it.key }
    println(adults)
}

fun challenges() {
//    Challenge 1: Repeating yourself
    repeatTask(10) { println("Kotlin Apprentice is a great book!") }
}

fun repeatTask(times: Int, task: () -> Unit) {
    var times = times

    while (times != 0) {
        task()
        times -= 1
    }
//    Challenge 2: Lambda sums

//    Challenge 3: Functional Ratings
    ratings()
}

fun mathSum(length: Int, series: (Int) -> Int): Int {
    return 0
}

fun ratings() {
    val appRatings = mapOf(
        "Calendar Pro" to arrayOf(1, 5, 5, 4, 2, 1, 5, 4),
        "The Messenger" to arrayOf(5, 4, 2, 5, 4, 1, 1, 2),
        "Socialise" to arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
    )

    val averageRating = mutableMapOf<String, Int>()
    appRatings.map {
        averageRating[it.key] = it.value.reduce { a, b -> (a + b) } / it.value.size
    }


    println(averageRating.filter {
       it.value > 3
    }.map {
        it.key
    })

}