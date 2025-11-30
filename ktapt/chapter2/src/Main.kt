
import kotlin.math.*

const val pi: Double  = 3.14  // const is only used within global scope.
fun main() {
    // this is comment
    /*
    This is
    a multiline comment
     */

    2 + 3 // ok
    print(22 / 7)
    print("\n")
    print(22 / 7)
    print("\n")
    print(28.43 % 10.442)

    // constant variable
    val number: Int = 40
    print("\n")
    print(number)
    // number = 45 // it is wrong. we cannot change value of number variable cause it is constant - non changable

    var counter: Int  = 0
    counter += 1
    counter -= 1
    counter += 1
    counter *= 20
    counter /= 4 - 2
    println(counter)

}