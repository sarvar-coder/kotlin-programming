import com.sun.tools.javac.tree.TreeInfo.args
import kotlin.math.min

fun main(args: Array<String>) {
    args.forEach { arg ->
        println(arg)
    }
    arrays()
    minExr()
    var array = mutableListOf(1, 1, 2, 3, 4, 1)
    var array1 = arrayOf(1, 2, 3, 4, 5, 6)
    println(remove(1, array))
    println(reverse(array1).contentToString())
println(minAndMax(array1))
}

fun arrays() {
    val oddNumbers = arrayOf(1, 3, 5, 7, 9)
    val evenNumbers = arrayOf(2, 4, 6, 8)
    evenNumbers.toIntArray()
    lists()
    findIndexOfDan()

}

fun lists() {
    var players = mutableListOf<String>("Alice", "Bob", "Cindy", "Dan")

    if (players.size < 2) {
        println("We need 2 players at least")
    } else {
        println("Let's Start!")
    }

    val currentPlayer = players.first()

    val minPlayer = players.minOrNull()
    minPlayer.let {
        println("$minPlayer will start!")
    }

//    accessing elements by index
    val firstPlayer = players[0]
    println("firstPlayer is $firstPlayer")

//     Using ranges to slice
    val upComingPlayers = players.slice(1..2)
    val string = upComingPlayers.joinToString()
    println(upComingPlayers)

}

fun findIndexOfDan() {
    var players = mutableListOf<String>("Alice", "Bob", "Cindy", "Dan")

    val indexOfDan: Int = players.indexOf("Dan")
    println("Dan is at the $indexOfDan")
}

fun minExr() {
    val scores = listOf(2, 2, 8, 6, 1)
    val players = mutableListOf<String>("Alice", "Bob", "Cindy", "Dan", "Franklin")

    for ((index, player) in players.withIndex()) {
        println("${index + 1}. $player has ${scores[index]} scores.")
    }

}

fun removeOne(item: Int, list: List<Int>): List<Int> {

    var result = list.toMutableList()

    for (i in result) {
        if (item == i) {
            result.remove(i)
            return result
        }
    }

    return list
}

fun remove(item: Int, list: List<Int>): List<Int> {
    var result = mutableListOf<Int>()

    for (i in list) {
        if (item != i) {
            result.add(i)
        }
    }

    return result
}

fun reverse(array: Array<Int>): Array<Int> {
    var result = emptyArray<Int>()
    var lastIndex = array.size - 1

    while (lastIndex != -1) {
        result += array[lastIndex]
        lastIndex--
    }

    return result
}

fun minAndMax(numbers: Array<Int>): Pair<Int, Int>? {
    if (numbers.isEmpty()) {
        return null
    }
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    for (number in numbers) {
        if (number > max) {
            max = number
        }
        if (number < min) {
            min = number
        }

    }

    return Pair(min, max)
}
