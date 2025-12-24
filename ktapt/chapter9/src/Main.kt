import kotlin.math.min

var yearOfBirth = mapOf<String, Int>()
var namesScore = mutableMapOf<String, Int>()
var bobData = mutableMapOf<String, String>()

var names = setOf<String>()


fun main() {
//    Maps
    createMap()
    accessingValues()
    modifyingMutableMap()
    iteratingThroughMaps()

//    Sets
    creatingSets()

//    Challenges
    challenges()
}

fun createMap() {
    yearOfBirth = mapOf(
        "Sarvar" to 2007,
        "Samandar" to 2007,
        "Sanjar" to 2006,
        "Muzaffar" to 2007,
        "Diyor" to 2007
    )

    namesScore = mutableMapOf(
        "Anna" to 4,
        "Brain" to 2,
        "Cindy" to 2,
        "Dan" to 1,
    )
    println(namesScore)
}

fun accessingValues() {
// To access Anna's score we should use square bracket rather than by its index unlike array.
    println(namesScore["Anna"])

//    All collection types has isEmpty and size properties.
    println(namesScore.size)
    println(namesScore.isEmpty())
}

fun modifyingMutableMap() {
    bobData = mutableMapOf(
        "name" to "bob",
        "profession" to "card player",
        "country" to "USA"
    )

    bobData.put("state", "CA")

    // shorter way to add pairs using subscripting
    bobData["city"] = "San Francisco"
    minExr1(bobData)

    bobData.put("name", "Bobby")
    bobData["profession"] = "Mailman"

//    usage of += operator updating maps
    val pair = "nickname" to "Bobby D"
    bobData += pair

    println(bobData)

//    removing elements in maps
    bobData.remove("city")
    bobData.remove("state")
}

fun minExr1(map: MutableMap<String, String>) {
    println(map["city"])
    println(map["state"])
}

fun iteratingThroughMaps() {
    for ((player, score) in namesScore) {
        println("$player - $score")
    }

    for (player in namesScore.keys) {
        println("$player")
    }
}

fun creatingSets() {
    names = setOf("Anna", "Ben", "Cindy", "Dan")

//    create set by calling HashSet constructor.
    val hashSet = HashSet<Int>()

    val someArray = arrayOf(1, 2, 3, 4, 1, 6)
    val someSet = mutableSetOf(*someArray)
    println(someSet)

    for (number in someSet) {
        println(number)
    }
}

fun challenges() {
    val map: Map<Int, Int> = emptyMap()

//    First challenge
    firstChallenge()
    val first = occurrencesOfCharacters("Sarvarbek")
    println(isInvertible(first))

    val nameTitleLookup: MutableMap<String, String?> = mutableMapOf(
        "Marry" to "Engineer",
        "Patrick" to "Intern",
        "Ray" to "Hacker"
    )

    nameTitleLookup["Patrick"] = null
    nameTitleLookup.remove("Ray")
    println(nameTitleLookup)
}

fun firstChallenge() {
    val states = mapOf("NY" to "New york", "SF" to "San Francisco", "CA" to "California")
    for (state in states.values) {
        if (state.length >= 8) {
            println(state)
        }
    }
}

fun occurrencesOfCharacters(text: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()

    for (char in text) {

        if (map[char] == null) {
            map[char] = 1
        } else {
            map[char] = map[char]!! + 1
        }
    }
    println(map)
    return map
}

fun isInvertible(map: Map<Char, Int>): Boolean {

    val setOfValues = setOf(map.values)
    return setOfValues.size == map.values.size
}